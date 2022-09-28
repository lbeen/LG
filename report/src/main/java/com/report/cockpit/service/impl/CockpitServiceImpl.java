package com.report.cockpit.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.report.cockpit.mapper.CockpitMapper;
import com.report.cockpit.service.CockpitSCADAService;
import com.report.cockpit.service.CockpitService;
import com.report.utils.CacheUtils;
import com.report.utils.CommonUtils;
import com.report.utils.DataUtils;
import com.report.utils.SysUtils;
import com.report.utils.TimeUtils;
import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.EchartsPieData;
import com.report.utils.pojo.EchartsSingleData;
import com.report.utils.pojo.Record;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 驾驶舱service
 */
@Service
@RequiredArgsConstructor
public class CockpitServiceImpl implements CockpitService {
    private final CockpitSCADAService cockpitSCADAService;
    private final CockpitMapper cockpitMapper;

    /**
     * 寿命大于150占比
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsSingleData lifetimeGt150(String DS) {
        LocalDateTime[] days = TimeUtils.getRecentShiftDays(0, 7);
        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        return DataUtils.getEchartsData(() -> cockpitMapper.lifetimeGt150(param), TimeUtils.formatShortDay(days));
    }

    /**
     * 断线数据
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData breakLine(String DS) {
        List<Record> orderSteps;
        Map<String, Double> runPullers;
        double nowPercent;

        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        if (hour >= 8 && hour < 10) {
            LocalDateTime endTime = TimeUtils.get8oClock(now);
            LocalDateTime startTime = endTime.minusDays(1);
            orderSteps = cockpitSCADAService.breakLineOrderAndStep(SysUtils.getSCADADataSource(DS), startTime, endTime);
            if (SysUtils.DS_BS_DG.equals(DS)) {
                runPullers = DataUtils.getMap(cockpitMapper::yesterdayRunPullersGroupWorkshop);
            } else {
                runPullers = DataUtils.getMap(cockpitMapper::yesterdayRunPullerGroupSpec);
            }
            nowPercent = 1D;
        } else {
            LocalDateTime startTime = TimeUtils.get8oClock(now);
            if (hour < 8) {
                startTime = startTime.minusDays(1);
            }
            orderSteps = cockpitSCADAService.breakLineOrderAndStep(SysUtils.getSCADADataSource(DS), startTime, now);
            if (SysUtils.DS_BS_DG.equals(DS)) {
                runPullers = DataUtils.getMap(cockpitMapper::runPullersGroupWorkshop);
            } else {
                runPullers = DataUtils.getMap(cockpitMapper::runPullerGroupSpec);
            }
            nowPercent = TimeUtils.nowOfShiftDayPercent();
        }

        Set<String> orders = orderSteps.stream().map(r -> r.getString("crystalid")).collect(Collectors.toSet());
        Map<String, String> orderInfo = getMassProductionInfo(DS, orders);
        Table<String, String, Double> stepTable = orderSteps.stream().collect(HashBasedTable::create, (t, r) -> {
            String rowKey = orderInfo.get(r.getString("crystalid"));
            if (rowKey == null) {
                return;
            }
            Double runPuller = runPullers.get(rowKey);
            if (runPuller == null || runPuller <= 0) {
                return;
            }
            CommonUtils.increaseValue(t, "等断", rowKey, r.getDouble("dd"));
            CommonUtils.increaseValue(t, "放断", rowKey, r.getDouble("fd"));
            CommonUtils.increaseValue(t, "切手动", rowKey, r.getDouble("qsd"));
        }, Table::putAll);

        for (Map.Entry<String, Map<String, Double>> columnEntry : stepTable.columnMap().entrySet()) {
            String rowKey = columnEntry.getKey();
            double runPuller = runPullers.get(rowKey);

            Map<String, Double> map = columnEntry.getValue();
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                entry.setValue(CommonUtils.round(entry.getValue() / runPuller * 100 / nowPercent, 1));
            }
        }

        String[] xAxis;
        if (SysUtils.DS_BS_DG.equals(DS)) {
            xAxis = SysUtils.getBsSingleWorkshops();
            ArrayUtils.reverse(xAxis);
        } else {
            xAxis = Sets.newHashSet(orderInfo.values()).toArray(new String[0]);
        }
        return DataUtils.toEchartsData(stepTable, new String[]{"等断", "放断", "切手动"}, xAxis);
    }

    /**
     * 获取量产品的工单规格
     *
     * @param DS     数据源
     * @param orders 工单号
     */
    private Map<String, String> getMassProductionInfo(String DS, Set<String> orders) {
        String cacheKey = DS + ":order_spec_workshop";

        String valueKey = SysUtils.DS_BS_DG.equals(DS) ? "workshop" : "spec_s";
        Map<String, String> orderWorkshop = Maps.newHashMap();
        CacheUtils.useCache(cacheKey, () -> CacheBuilder.newBuilder().expireAfterAccess(10, TimeUnit.MINUTES).build(),
                orders,
                keys -> getOrderInfo(keys).stream().collect(Collectors.toMap(r -> r.getString("order_number_s"), r -> {
                    r.remove("order_number_s");
                    return r;
                })), (o, r) -> {
                    if (getMassProductionSpec(r) != null) {
                        orderWorkshop.put(o, r.getString(valueKey));
                    }
                });
        return orderWorkshop;
    }

    /**
     * 获取量产品规格
     *
     * @param record 规格是否量产品
     */
    private String getMassProductionSpec(Record record) {
        String spec = record.getString("spec_s");
        if (spec == null || spec.endsWith("H0") || spec.endsWith("C0") || !"是".equals(record.get("isproduction_s"))) {
            return null;
        }
        return spec;
    }

    /**
     * 获取工单信息
     *
     * @param orders 工单
     */
    private List<Record> getOrderInfo(Set<String> orders) {
        if (orders.size() <= 500) {
            return cockpitMapper.orderInfo(orders);
        }
        List<Record> list = Lists.newArrayList();
        Set<String> tempOrder = Sets.newHashSet();
        for (String order : orders) {
            tempOrder.add(order);
            if (tempOrder.size() > 500) {
                list.addAll(cockpitMapper.orderInfo(tempOrder));
                tempOrder.clear();
            }
        }
        if (!tempOrder.isEmpty()) {
            list.addAll(cockpitMapper.orderInfo(tempOrder));
        }
        return list;
    }

    /**
     * 获取投料量和方棒产量
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public List<Map<String, Object>> feedingAndFinish(String DS) {
        LocalDateTime[] days = TimeUtils.getRecentShiftDays(0, 2);

        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        Map<String, Double> finishMap = DataUtils.getMap(() -> cockpitMapper.finish(param));
        Map<String, Double> feedingMap = DataUtils.getMap(() -> cockpitMapper.feeding(param));

        String[] shortDays = TimeUtils.formatShortDay(days);
        List<Map<String, Object>> data = Lists.newArrayList();
        if (DS.equals(SysUtils.DS_BS_DG)) {
            data.add(circularData("今日方棒产量（t）", finishMap.get(shortDays[1]), null));
        } else {
            data.add(circularData("今日方棒产量（t）", finishMap.get(shortDays[1]), cockpitMapper.finishTarget()));
        }
        data.add(circularData("昨日方棒产量（t）", finishMap.get(shortDays[0]), null));
        data.add(circularData("今日投料（t）", feedingMap.get(shortDays[1]), null));
        data.add(circularData("昨日投料（t）", feedingMap.get(shortDays[0]), null));
        return data;
    }

    private Map<String, Object> circularData(String name, Double value, Double target) {
        Map<String, Object> data = Maps.newHashMap();
        data.put("name", name);
        data.put("value", value == null ? 0 : value);
        if (target == null || target == 0) {
            data.put("target", 0D);
        } else {
            data.put("target", CommonUtils.round(target * TimeUtils.nowOfShiftDayPercent(), 2));
        }
        return data;
    }

    /**
     * 获取方棒单产
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public Object squareSingleYield(String DS) {
        Function<Map<String, Object>, List<Record>> yieldQuery;
        Function<Map<String, Object>, List<Record>> timeSingleQuery;
        if (SysUtils.DS_BS_DG.equals(DS)) {
            yieldQuery = cockpitMapper::squareYield;
            timeSingleQuery = cockpitMapper::timeSingle;
        } else {
            yieldQuery = cockpitMapper::squareYieldBySpec2;
            timeSingleQuery = cockpitMapper::timeSingleBySpec2;
        }

        LocalDateTime[] days = TimeUtils.getRecentShiftDays(0, 7);
        Map<String, Object> param = getStartAndEndTimeParam(days);

        Table<String, String, Double> yieldTable = getYieldTable(yieldQuery, param);
        //今天没有产量只显示到昨天
        Map<String, Double> todayYield = yieldTable.column(TimeUtils.formatShortDay(LocalDateTime.now()));
        if (todayYield.isEmpty()) {
            days = TimeUtils.getRecentShiftDays(1, 7);
            param = getStartAndEndTimeParam(days);
            yieldTable = getYieldTable(yieldQuery, param);
        }
        Table<String, String, Double> timeTable = getTimeTable(timeSingleQuery, param);

        if (SysUtils.DS_BS_DG.equals(DS)) {
            return squareSingleYieldBS(days, yieldTable, timeTable);
        }
        return squareSingleYieldTC(days, yieldTable, timeTable, param);
    }

    private Table<String, String, Double> getYieldTable(Function<Map<String, Object>, List<Record>> yieldQuery,
                                                        Map<String, Object> param) {
        return DataUtils.getTable(() -> yieldQuery.apply(param));
    }

    private Table<String, String, Double> getTimeTable(Function<Map<String, Object>, List<Record>> timeSingleQuery,
                                                       Map<String, Object> param) {
        return DataUtils.getTable(() -> timeSingleQuery.apply(param));
    }

    /**
     * 获取开始时间结束时间查询参数
     *
     * @param days 日期数组
     */
    private Map<String, Object> getStartAndEndTimeParam(LocalDateTime[] days) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(days[0]));
        param.put("endTime", TimeUtils.formatNowTime());
        return param;
    }

    /**
     * 获取保山方棒单产
     *
     * @param days       日期
     * @param yieldTable 产量数据
     * @param timeTable  拉晶用时数据
     */
    public EchartsData squareSingleYieldBS(LocalDateTime[] days, Table<String, String, Double> yieldTable,
                                           Table<String, String, Double> timeTable) {
        String[] workshops = SysUtils.getBsSingleWorkshops();
        String[] shortDays = TimeUtils.formatShortDay(days);
        double[][] yAxis = new double[workshops.length][shortDays.length];
        for (int i = 0; i < workshops.length; i++) {
            Map<String, Double> yieldRow = yieldTable.row(workshops[i]);
            Map<String, Double> timeRow = timeTable.row(workshops[i]);
            for (int j = 0; j < shortDays.length; j++) {
                Double yield = yieldRow.get(shortDays[j]);
                if (yield == null || yield == 0) {
                    yAxis[i][j] = 0D;
                    continue;
                }
                Double time = timeRow.get(shortDays[j]);
                if (time == null || time == 0) {
                    yAxis[i][j] = 0D;
                    continue;
                }
                yAxis[i][j] = CommonUtils.round(yield / time, 2);
            }
        }
        return new EchartsData(workshops, shortDays, yAxis);
    }

    /**
     * 获取腾冲方棒单产
     *
     * @param days       日期
     * @param yieldTable 产量数据
     * @param timeTable  拉晶用时数据
     * @param param      查询参数
     */
    private Map<String, Object> squareSingleYieldTC(LocalDateTime[] days, Table<String, String, Double> yieldTable,
                                                    Table<String, String, Double> timeTable,
                                                    Map<String, Object> param) {
        //单产预测
        double avgFinishRate = avgFinishRate(days[0].minusDays(2));
        Table<String, String, Double> wwcWeightTable = DataUtils.getTable(() -> cockpitMapper.getWwcWeight2(param));

        String[] specs = yieldTable.rowKeySet().toArray(new String[0]);
        String[] shortDays = TimeUtils.formatShortDay(days);

        Map<String, double[][]> specMap = Maps.newHashMap();
        for (String spec : specs) {
            double[] actual = new double[shortDays.length];
            double[] estimate = new double[shortDays.length];

            Map<String, Double> yieldRow = yieldTable.row(spec);
            Map<String, Double> timeRow = timeTable.row(spec);
            Map<String, Double> wwcWeightRow = wwcWeightTable.row(spec);
            for (int i = 0; i < shortDays.length; i++) {
                Double time = timeRow.get(shortDays[i]);
                if (time == null || time == 0) {
                    continue;
                }
                Double yield = yieldRow.get(shortDays[i]);
                if (yield != null && yield != 0) {
                    actual[i] = CommonUtils.round(yield / time, 2);
                }
                Double wwcWeight = wwcWeightRow.get(shortDays[i]);
                if (wwcWeight != null && wwcWeight != 0) {
                    estimate[i] = CommonUtils.round(wwcWeight * avgFinishRate / time, 2);
                }
            }
            specMap.put(spec, new double[][]{actual, estimate});
        }
        //加目标
        Iterator<Record> targetIterator = cockpitMapper.squareYieldTarget(
                Collections.singletonMap("startTime", TimeUtils.formatDay(days[0]))).iterator();
        String[] longDays = TimeUtils.formatDay(days);
        int dayIndex = longDays.length - 1;
        double[] targets = new double[longDays.length];
        out:
        while (targetIterator.hasNext()) {
            Record currentTarget = targetIterator.next();
            String startDay = currentTarget.getString("k");
            double target = currentTarget.getDouble("v");
            while (true) {
                String day = longDays[dayIndex];
                if (day.compareTo(startDay) >= 0) {
                    targets[dayIndex] = target;
                    dayIndex--;
                    if (dayIndex >= 0) {
                        continue;
                    }
                    break out;
                }
                continue out;
            }
        }
        //日期加两天
        for (int i = 0; i < days.length; i++) {
            days[i] = days[i].plusDays(1);
        }

        Map<String, Object> data = Maps.newHashMap();
        data.put("specs", specMap);
        data.put("targets", targets);
        data.put("days", TimeUtils.formatShortDay(days));
        return data;
    }

    /**
     * 获取平均成品率
     *
     * @param startTime 开始时间
     */
    private double avgFinishRate(LocalDateTime startTime) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(startTime));
        param.put("endTime", TimeUtils.formatTime(startTime.plusDays(7)));
        return cockpitMapper.avgFinishRate2(param);
    }

    /**
     * 获取单晶产能
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData singleYield(String DS) {
        return getYield(cockpitMapper::singleYield,
                DS.equals(SysUtils.DS_BS_DG) ? SysUtils.getBsSingleWorkshops() : SysUtils.getTcSingleWorkshops());
    }

    /**
     * 获取机加产能
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData machineYield(String DS) {
        if (DS.equals(SysUtils.DS_BS_DG)) {
            return getYield(cockpitMapper::machineYield, SysUtils.getBsMachineWorkshops());
        }
        return getYield(cockpitMapper::machineYieldTC, SysUtils.getTcMachineWorkshops());
    }

    /**
     * 获取产量
     *
     * @param query     查询方法
     * @param workshops 车间
     */
    private EchartsData getYield(Function<Map<String, Object>, List<Record>> query, String[] workshops) {
        LocalDateTime[] days = TimeUtils.getRecentShiftDays(0, 2);
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(days[0]));
        param.put("endTime", TimeUtils.formatNowTime());

        String[] shortDays = TimeUtils.formatShortDay(days);
        double nowPercent = TimeUtils.nowOfShiftDayPercent();
        Table<String, String, Double> table = query.apply(param).stream().collect(HashBasedTable::create, (t, r) -> {
            String day = r.getString("k1");
            String workshop = r.getString("k2");
            double yield = r.getDouble("v");
            t.put(day, workshop, yield);
            if (shortDays[1].equals(day)) {
                t.put(day + "预计", workshop, CommonUtils.round(yield / nowPercent, 1));
            }
        }, Table::putAll);

        String[] legend = ArrayUtils.add(shortDays, shortDays[1] + "预计");
        EchartsData echartsData = DataUtils.toEchartsData(table, legend, workshops);
        return new EchartsData(new String[]{"昨日", "今日", "今日预计"}, echartsData.xAxis, echartsData.yAxis);
    }

    /**
     * 机加物料周转天数
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData turnoverDays(String DS) {
        LocalDateTime[] days = TimeUtils.getRecentShiftDays(0, 7);
        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        String[] types = {"毛棒", "其他"};
        return DataUtils.getEchartsData(() -> cockpitMapper.turnoverDays(param), types, TimeUtils.formatShortDay(days));
    }

    /**
     * 机加48小时在线
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData machineOnline48(String DS) {
        String[] types = {"毛棒检测", "毛棒", "圆棒", "毛方棒", "成品方棒"};
        String[] workshops = SysUtils.getBsMachineWorkshops();
        ArrayUtils.reverse(workshops);
        return DataUtils.getEchartsData(cockpitMapper::machineOnline48, types, workshops);
    }

    /**
     * 单晶8小时在线
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsPieData singleOnline8(String DS) {
        return DataUtils.getEchartsPieData(cockpitMapper::singleOnline8, SysUtils.getBsSingleWorkshops());
    }

    /**
     * 成品率
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsSingleData singleFinishedRate(String DS) {
        LocalDateTime[] days = TimeUtils.getRecentShiftDays(1, 7);
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(days[0]));
        param.put("endTime", TimeUtils.formatTime(days[0].plusDays(7)));
        return DataUtils.getEchartsData(() -> cockpitMapper.singleFinishedRate(param), TimeUtils.formatShortDay(days));
    }

    /**
     * 交料趋势
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData payLength(String DS) {
        LocalDateTime[] days = TimeUtils.getRecentShiftDays(1, 7);
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(days[0]));
        param.put("endTime", TimeUtils.formatTime(days[0].plusDays(7)));
        String[] types = {"单晶", "机加"};
        return DataUtils.getEchartsData(() -> cockpitMapper.payLength(param), types, TimeUtils.formatShortDay(days));
    }

    /**
     * 单晶在线
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsData singleOnline(String DS) {
        String[] types = {"小于8小时", "超8小时"};
        String[] areas = {"A", "B", "C", "D", "E", "F", "G", "H"};
        return DataUtils.getEchartsData(cockpitMapper::singleOnline, types, areas);
    }

    /**
     * 机加在线
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public EchartsSingleData machineOnline(String DS) {
        String[] crystalTypes = {"毛棒检测", "毛棒", "圆棒", "毛方棒", "成品方棒"};
        return DataUtils.getEchartsData(cockpitMapper::machineOnline, crystalTypes);
    }
}