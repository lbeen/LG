package com.report.cockpit.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.report.cockpit.mapper.CockpitMapper;
import com.report.cockpit.mapper.MachineCockpitMapper;
import com.report.cockpit.service.MachineCockpitService;
import com.report.common.mapper.OnlineMapper;
import com.report.common.mapper.YieldMapper;
import com.report.utils.CommonUtils;
import com.report.utils.DataUtils;
import com.report.utils.TimeUtils;
import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.EchartsSingleData;
import com.report.utils.pojo.Record;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * 驾驶舱service
 */
@Service
@RequiredArgsConstructor
public class MachineCockpitServiceImpl implements MachineCockpitService {
    private static final String CUTOFF = "cutoff";
    private static final String BUTT = "butt";
    private static final String POLISHING = "polishing";
    private static final String FINISH = "finish";

    private final MachineCockpitMapper machineCockpitMapper;
    private final CockpitMapper cockpitMapper;
    private final YieldMapper yieldMapper;
    private final OnlineMapper onlineMapper;

    /**
     * 产量
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public Map<String, Double> totalYield(String DS, String process) {
        LocalDateTime now = LocalDateTime.now();
        Map<String, Object> param = getTimeParam(now);
        switch (process) {
            case CUTOFF:
                return getYield(now, yieldMapper.cutoffYield(param), 130);
            case BUTT:
                return getYield(now, yieldMapper.buttYield(param), 90);
            case POLISHING:
                return getYield(now, yieldMapper.polishingYield(param), 90);
            case FINISH:
                return getYield(now, yieldMapper.finishYield(param), 90);
            default:
                return Collections.emptyMap();
        }
    }

    /**
     * 获取产量
     *
     * @param now      现在时间
     * @param yield    时间产量
     * @param capacity 产能
     */
    private Map<String, Double> getYield(LocalDateTime now, double yield, double capacity) {
        Map<String, Double> data = Maps.newHashMap();
        data.put("actual", yield);
        data.put("plan", cockpitMapper.finishTarget());
        if (showYesterday(now)) {
            data.put("capacity", capacity);
        } else {
            data.put("capacity", CommonUtils.round(capacity * TimeUtils.nowOfShiftDayPercent(), 2));
        }
        return data;
    }

    /**
     * 各个机台产量
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public EchartsSingleData eachMachine(String DS, String process) {
        Map<String, Object> param = getTimeParam(LocalDateTime.now());
        switch (process) {
            case CUTOFF:
                return DataUtils.getEchartsDataSortByK(() -> yieldMapper.cutoffYieldByEquipment(param));
            case BUTT:
                return DataUtils.getEchartsDataSortByK(() -> yieldMapper.buttYieldByEquipment(param));
            case POLISHING:
                return DataUtils.getEchartsDataSortByK(() -> yieldMapper.polishingYieldByEquipment(param));
            case FINISH:
                return DataUtils.getEchartsDataSortByK(() -> yieldMapper.finishYieldBySpec(param));
            default:
                return null;
        }
    }

    /**
     * 设备数据
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public Map<String, Double> totalEquipmentData(String DS, String process) {
        LocalDateTime now = LocalDateTime.now();
        Map<String, Object> param = getEquipmentParam(now, process);
        Double maintenanceTime = machineCockpitMapper.totalEquipmentMaintenanceTime(param);
        Double waitingTime = machineCockpitMapper.totalEquipmentWaitingTime(param);

        Double count = machineCockpitMapper.equipmentCount(param);

        double totalTime;
        if (showYesterday(now)) {
            totalTime = 24 * 60;
        } else {
            totalTime = CommonUtils.round(Duration.between(TimeUtils.get8oClock(now), now).toMinutes() * count / 60, 2);
        }

        Map<String, Double> data = new HashMap<>();
        data.put("maintenance", maintenanceTime == null ? 0 : maintenanceTime);
        data.put("waiting", waitingTime == null ? 0 : waitingTime);
        data.put("total", totalTime);
        return data;
    }

    /**
     * 设备维修用时
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public EchartsData equipmentMaintenanceTime(String DS, String process) {
        Map<String, Object> param = getEquipmentParam(LocalDateTime.now(), process);
        Table<String, String, Double> table = DataUtils.getTable(
                () -> machineCockpitMapper.equipmentMaintenanceTime(param));
        String[] reasons = table.rowKeySet().toArray(new String[0]);
        String[] equipments = new TreeSet<>(table.columnKeySet()).toArray(new String[0]);
        return DataUtils.toEchartsData(table, reasons, equipments);
    }

    /**
     * 待料时间
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public EchartsData equipmentWaitingTime(String DS, String process) {
        Map<String, Object> param = getEquipmentParam(LocalDateTime.now(), process);
        HashBasedTable<String, String, Double> table = machineCockpitMapper.equipmentWaitingTime(
                param).stream().collect(HashBasedTable::create, (t, r) -> {
            t.put("待料次数", r.getString("k"), r.getDouble("v1"));
            t.put("待料时间", r.getString("k"), r.getDouble("v2"));
        }, Table::putAll);
        String[] equipments = new TreeSet<>(table.columnKeySet()).toArray(new String[0]);
        return DataUtils.toEchartsData(table, new String[]{"待料次数", "待料时间"}, equipments);
    }

    /**
     * 前台传入参数获取工序方法
     *
     * @param now     现在时间
     * @param process 工序
     */
    private Map<String, Object> getEquipmentParam(LocalDateTime now, String process) {
        Map<String, Object> param = getTimeParam(now);
        switch (process) {
            case CUTOFF:
                param.put("process", "QDJ");
                break;
            case BUTT:
                param.put("process", "QFJ");
                break;
            case POLISHING:
                param.put("process", "YTJ");
                break;
            case FINISH:
                param.put("process", "XQD");
                break;
        }
        return param;
    }

    /**
     * 在线总计
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public Map<String, Double> totalOnline(String DS, String process) {
        if (showYesterday(LocalDateTime.now())) {
            switch (process) {
                case CUTOFF:
                    return getOnline(onlineMapper.yesterdayOnlineTotal("毛棒"), 0);
                case BUTT:
                    return getOnline(onlineMapper.yesterdayOnlineTotal("圆棒"), 5);
                case POLISHING:
                    return getOnline(onlineMapper.yesterdayOnlineTotal("毛方棒"), 5);
                case FINISH:
                    return getOnline(onlineMapper.yesterdayOnlineTotal("成品方棒"), 3);
                default:
                    return Collections.emptyMap();
            }
        }
        switch (process) {
            case CUTOFF:
                return getOnline(onlineMapper.cutoffOnlineStatisticsAll(), 0);
            case BUTT:
                return getOnline(onlineMapper.buttOnlineStatisticsAll(), 5);
            case POLISHING:
                return getOnline(onlineMapper.polishingOnlineStatisticsAll(), 5);
            case FINISH:
                return getOnline(onlineMapper.finishOnlineStatisticsAll(), 3);
            default:
                return Collections.emptyMap();
        }
    }

    /**
     * 获取在线总计数据
     *
     * @param onlineRecord 在线查询结果
     * @param target       目标
     */
    private Map<String, Double> getOnline(Record onlineRecord, double target) {
        Map<String, Double> data = Maps.newHashMap();
        data.put("weight", CommonUtils.round(onlineRecord.getDouble("v2"), 2));
        data.put("count", CommonUtils.round(onlineRecord.getDouble("v1"), 0));
        data.put("target", target);
        return data;
    }

    /**
     * 在线总计
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public EchartsSingleData online(String DS, String process) {
        if (showYesterday(LocalDateTime.now())) {
            switch (process) {
                case CUTOFF:
                    return DataUtils.getEchartsDataSortByV(() -> onlineMapper.yesterdayOnlineBySpec("毛棒"));
                case BUTT:
                    return DataUtils.getEchartsDataSortByV(() -> onlineMapper.yesterdayOnlineBySpec("圆棒"));
                case POLISHING:
                    return DataUtils.getEchartsDataSortByV(() -> onlineMapper.yesterdayOnlineBySpec("毛方棒"));
                case FINISH:
                    return DataUtils.getEchartsDataSortByV(() -> onlineMapper.yesterdayOnlineBySpec("成品方棒"));
                default:
                    return null;
            }
        }
        switch (process) {
            case CUTOFF:
                return DataUtils.getEchartsDataSortByV(() -> onlineMapper.cutoffOnlineStatistics(null));
            case BUTT:
                return DataUtils.getEchartsDataSortByV(() -> onlineMapper.buttOnlineStatistics(null));
            case POLISHING:
                return DataUtils.getEchartsDataSortByV(() -> onlineMapper.polishingOnlineStatistics(null));
            case FINISH:
                return DataUtils.getEchartsDataSortByV(() -> onlineMapper.finishOnlineStatistics(null));
            default:
                return null;
        }
    }

    /**
     * 交料数据
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public Map<String, Double> totalPayLength(String DS, String process) {
        Map<String, Double> data = new HashMap<>();
        Map<String, Object> param = getPayParam(process);
        data.put("payLength", machineCockpitMapper.totalPayLength(param));
        return data;
    }

    /**
     * 交料数据
     *
     * @param DS      数据源
     * @param process 工序
     */
    @DS("#DS")
    @Override
    public EchartsSingleData payLengthByReason(String DS, String process) {
        Map<String, Object> param = getPayParam(process);
        return DataUtils.getEchartsDataSortByV(() -> machineCockpitMapper.payLengthByReason(param));
    }

    /**
     * 前台传入参数获取工序方法
     *
     * @param process 工序
     */
    private Map<String, Object> getPayParam(String process) {
        Map<String, Object> param = getTimeParam(LocalDateTime.now());
        switch (process) {
            case CUTOFF:
                param.put("process", 8);
                break;
            case BUTT:
                param.put("process", 9);
                break;
            case POLISHING:
                param.put("process", 10);
                break;
            case FINISH:
                param.put("process", 11);
                break;
        }
        return param;
    }

    private Map<String, Object> getTimeParam(LocalDateTime now) {
        LocalDateTime startTime, endTime;
        if (now.getHour() < 10) {
            startTime = TimeUtils.get8oClock(now.minusDays(1));
            endTime = TimeUtils.get8oClock(now);
        } else {
            startTime = TimeUtils.get8oClock(now);
            endTime = TimeUtils.get8oClock(now.plusDays(1));
        }

        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(startTime));
        param.put("endTime", TimeUtils.formatTime(endTime));
        return param;
    }

    private boolean showYesterday(LocalDateTime now) {
        int hour = now.getHour();
        return hour >= 8 && hour < 10;
    }
}
