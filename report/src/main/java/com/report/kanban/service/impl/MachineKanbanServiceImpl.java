package com.report.kanban.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.report.common.mapper.OnlineMapper;
import com.report.common.mapper.YieldMapper;
import com.report.constants.SysConstants;
import com.report.kanban.service.MachineKanbanService;
import com.report.utils.DataUtils;
import com.report.utils.ParallelRunner;
import com.report.utils.SysUtils;
import com.report.utils.TimeUtils;
import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.Record;
import com.report.utils.pojo.ScrollData;
import com.report.utils.pojo.Shifts;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MachineKanbanServiceImpl implements MachineKanbanService {
    private final YieldMapper yieldMapper;
    private final OnlineMapper onlineMapper;

    /**
     * 毛棒在线统计
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    @DS("#DS")
    @Override
    public EchartsData maoOnlineStatistics(String DS, String workshop) {
        Table<String, String, Double> table = onlineMapper.maoOnlineStatistics(
                Collections.singletonMap("workshop", SysUtils.getLJShop(workshop))).stream().collect(
                HashBasedTable::create, (t, r) -> {
                    String[] k2Arr = r.getString("k2").split("_");
                    t.put(r.getString("k1") + k2Arr[0], k2Arr[1], r.getDouble("v"));
                }, Table::putAll);

        String[] areas;
        if (DS.equals(SysUtils.DS_BS_DG)) {
            areas = SysUtils.getBsWorkshopAreas(workshop);
        } else {
            areas = SysUtils.getTCWorkshopAreas();
        }
        String[] legend = new String[areas.length * 2];
        for (int i = 0; i < areas.length; i++) {
            int index = i * 2;
            legend[index] = areas[i] + "未接收";
            legend[index + 1] = areas[i] + "未划线";
        }
        String[] types = {"<1小时", "1-2小时", "2-3小时", "3-4小时", "4-5小时", "≥5小时"};
        return DataUtils.toEchartsData(table, legend, types);
    }

    /**
     * 毛棒在线列表
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    @DS("#DS")
    @Override
    public ScrollData maoOnlineList(String DS, String workshop, int hours) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime startTime, endTime;
        if (hours == 3) {
            startTime = now.minusHours(5);
            endTime = now.minusHours(3);
        } else {
            startTime = now.minusDays(50);
            endTime = now.minusHours(5);
        }
        Map<String, Object> param = Maps.newHashMap();
        param.put("workshop", SysUtils.getLJShop(workshop));
        param.put("startTime", TimeUtils.formatTime(startTime));
        param.put("endTime", TimeUtils.formatTime(endTime));

        String[] columns;
        if (DS.equals(SysUtils.DS_BS_DG)) {
            columns = new String[]{"crystal_number_s", "spec_s", "duration", "creation_time"};
        } else {
            columns = new String[]{"crystal_number_s", "area", "spec_s", "creation_time"};
        }
        return DataUtils.getScrollData(() -> onlineMapper.maoOnlineList(param), columns);
    }

    /**
     * 抛光数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    @DS("#DS")
    @Override
    public Map<String, Object> cutOffData(String DS, String workshop) {
        if (DS.equals(SysUtils.DS_BS_DG)) {
            if (SysConstants.MACHINE_SHOP_3.equals(workshop)) {
                return processData(DS, workshop, yieldMapper::cutoffYieldByShiftEquipment, true,
                        onlineMapper::cutoffOnlineStatistics, onlineMapper::cutoffOnlineListBS);
            }
            return processData(DS, workshop, yieldMapper::cutoffYieldByShiftSpec, false,
                    onlineMapper::cutoffOnlineStatistics, onlineMapper::cutoffOnlineListBS);
        }
        return processData(DS, workshop, yieldMapper::cutoffYieldByShiftSpec, false,
                onlineMapper::cutoffOnlineStatistics, onlineMapper::cutoffOnlineList);
    }

    /**
     * 切方数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    @DS("#DS")
    @Override
    public Map<String, Object> buttData(String DS, String workshop) {
        if (DS.equals(SysUtils.DS_BS_DG)) {
            return processData(DS, workshop, yieldMapper::buttYieldByShiftSpec, false,
                    onlineMapper::buttOnlineStatistics, onlineMapper::buttOnlineListBS);
        }
        return processData(DS, workshop, yieldMapper::buttYieldByShiftSpec, false, onlineMapper::buttOnlineStatistics,
                onlineMapper::buttOnlineList);
    }

    /**
     * 抛光数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    @DS("#DS")
    @Override
    public Map<String, Object> polishingData(String DS, String workshop) {
        if (DS.equals(SysUtils.DS_BS_DG)) {
            return processData(DS, workshop, yieldMapper::polishingYieldByShiftSpec, false,
                    onlineMapper::polishingOnlineStatistics, onlineMapper::polishingOnlineListBS);
        }
        return processData(DS, workshop, yieldMapper::polishingYieldByShiftSpec, false,
                onlineMapper::polishingOnlineStatistics, onlineMapper::polishingOnlineList);
    }

    /**
     * 各工序数据
     *
     * @param yieldQuery            产量查询方法
     * @param yieldSortByK          产量key值排序
     * @param onlineStatisticsQuery 在线统计查询方法
     * @param onlineListQuery       在线列表查询方法
     * @param workshop              车间
     */
    private Map<String, Object> processData(String DS, String workshop,
                                            Function<Map<String, Object>, List<Record>> yieldQuery,
                                            boolean yieldSortByK,
                                            Function<Map<String, Object>, List<Record>> onlineStatisticsQuery,
                                            Function<Map<String, Object>, List<Record>> onlineListQuery) {
        Map<String, Object> data = Maps.newHashMap();

        ParallelRunner runner = ParallelRunner.create(3);
        //在线
        Map<String, Object> onlineParam = Maps.newHashMap();
        onlineParam.put("workshop", SysUtils.getSingleWorkshopName(workshop));
        String[] columns = {"crystal_number_s", "spec_s", "crystal_length", "duration"};
        runner.execute(DS, () -> {
            List<Record> list = onlineListQuery.apply(onlineParam);
            List<Record> fList = list.stream().filter(r -> "F".equals(r.getString("is_finish"))).collect(
                    Collectors.toList());
            List<Record> nList = list.stream().filter(r -> "N".equals(r.getString("is_finish"))).collect(
                    Collectors.toList());
            data.put("onlineF", DataUtils.toScrollData(fList, columns));
            data.put("onlineN", DataUtils.toScrollData(nList, columns));
        });
        runner.execute(DS, () -> data.put("onlineStatistics",
                DataUtils.getEchartsDataSortByV(() -> onlineStatisticsQuery.apply(onlineParam))));
        //产量
        runner.executeAndAwait(() -> data.put("yield", getRecent2ShiftsYield(yieldQuery, workshop, yieldSortByK)));
        return data;
    }

    /**
     * 成品数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    @DS("#DS")
    @Override
    public Map<String, Object> finishData(String DS, String workshop) {
        Map<String, Object> onlineParam = Maps.newHashMap();
        onlineParam.put("workshop", SysUtils.getSingleWorkshopName(workshop));
        onlineParam.put("machineWorkshop", workshop);

        ParallelRunner runner = ParallelRunner.create(5);
        //成品在线列表
        List<Record> finishOnlineN = Lists.newArrayList();
        List<Record> finishOnlineF = Lists.newArrayList();
        runner.execute(DS, () -> {
            List<Record> list;
            if (DS.equals(SysUtils.DS_BS_DG)) {
                list = onlineMapper.finishOnlineListBS(onlineParam);
            } else {
                list = onlineMapper.finishOnlineList(onlineParam);
            }
            for (Record record : list) {
                record.put("crystal_type", "成品");
                if ("F".equals(record.getString("is_finish"))) {
                    finishOnlineF.add(record);
                } else {
                    finishOnlineN.add(record);
                }
            }
        });
        //半托在线列表
        List<Record> halfPalletOnlineN = Lists.newArrayList();
        List<Record> halfPalletOnlineF = Lists.newArrayList();
        runner.execute(DS, () -> {
            List<Record> list;
            if (DS.equals(SysUtils.DS_BS_DG)) {
                list = onlineMapper.halfPalletOnlineListBS(onlineParam);
            } else {
                list = onlineMapper.halfPalletOnlineList(onlineParam);
            }
            for (Record record : list) {
                record.put("crystal_type", "半托");
                if ("F".equals(record.getString("is_finish"))) {
                    halfPalletOnlineF.add(record);
                } else {
                    halfPalletOnlineN.add(record);
                }
            }
        });
        //成品在线统计
        Table<String, String, Double> finishTable = HashBasedTable.create();
        runner.execute(DS, () -> {
            List<Record> list = onlineMapper.finishOnlineStatistics(onlineParam);
            for (Record record : list) {
                finishTable.put("成品", record.getString("k"), record.getDouble("v"));
            }
        });
        //半托在线统计
        Table<String, String, Double> halfPalletTable = HashBasedTable.create();
        runner.execute(DS, () -> {
            List<Record> list = onlineMapper.halfPalletOnlineStatistics(onlineParam);
            for (Record record : list) {
                halfPalletTable.put("半托", record.getString("k"), record.getDouble("v"));
            }
        });
        //产量
        Map<String, Object> data = Maps.newHashMap();
        runner.executeAndAwait(
                () -> data.put("yield", getRecent2ShiftsYield(yieldMapper::finishYieldByShiftSpec, workshop, false)));

        finishOnlineF.addAll(halfPalletOnlineF);
        finishOnlineF.sort(Comparator.comparing(o -> o.getLocalDateTime("creation_time")));
        finishOnlineN.addAll(halfPalletOnlineN);
        finishOnlineN.sort(Comparator.comparing(o -> o.getLocalDateTime("creation_time")));
        String[] columns = {"crystal_number_s", "crystal_type", "spec_s", "crystal_length", "duration"};
        data.put("onlineF", DataUtils.toScrollData(finishOnlineF, columns));
        data.put("onlineN", DataUtils.toScrollData(finishOnlineN, columns));

        finishTable.putAll(halfPalletTable);
        data.put("onlineStatistics", DataUtils.toEchartsDataSortByV(finishTable, new String[]{"半托", "成品"}));
        return data;
    }

    /**
     * 获取最近两个班次产量
     *
     * @param query    查询方法
     * @param workshop 车间
     * @param sortByK          key值排序
     */
    private EchartsData getRecent2ShiftsYield(Function<Map<String, Object>, List<Record>> query, String workshop,
                                              boolean sortByK) {
        Shifts shifts = TimeUtils.getRecent2Shifts();
        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", shifts.startTime());
        param.put("endTime", TimeUtils.formatTime(LocalDateTime.now()));
        param.put("workshop", workshop);
        EchartsData echartsData;
        if (sortByK) {
            echartsData = DataUtils.getEchartsDataSortByK(() -> query.apply(param), shifts.formats());
        } else {
            echartsData = DataUtils.getEchartsDataSortByV(() -> query.apply(param), shifts.formats());
        }
        return new EchartsData(shifts.names(), echartsData.xAxis, echartsData.yAxis);
    }
}