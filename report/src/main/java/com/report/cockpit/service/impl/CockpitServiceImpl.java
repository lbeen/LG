package com.report.cockpit.service.impl;

import com.report.cockpit.service.CockpitService;
import com.report.dao.Dao;
import com.report.utils.DataUtils;
import com.report.utils.CommonUtils;
import com.report.utils.Record;
import com.report.utils.SysUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 驾驶舱service
 */
@Service
public class CockpitServiceImpl implements CockpitService {
    private static final String MAPPING_ID = "Cockpit.";
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static final DateTimeFormatter DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");

    private final Dao bsDgDao;

    private final Dao bsScadaDao;

    public CockpitServiceImpl(Dao bsDgDao, Dao bsScadaDao) {
        this.bsDgDao = bsDgDao;
        this.bsScadaDao = bsScadaDao;
    }

    /**
     * 获取投料量和毛棒产量
     */
    @Override
    public Map<String, Double> feedingAndFinish() {
        LocalDateTime yesterday, today, now = LocalDateTime.now();
        if (now.getHour() < 8) {
            yesterday = now.plusDays(-2).withHour(8).withMinute(0).withSecond(0);
            today = now.plusDays(-1).withHour(8).withMinute(0).withSecond(0);
        } else {
            yesterday = now.plusDays(-1).withHour(8).withMinute(0).withSecond(0);
            today = now.withHour(8).withMinute(0).withSecond(0);
        }
        String startTime = CommonUtils.formatDate(yesterday, "yyyy-MM-dd HH:mm:ss");
        String yesterdayStr = CommonUtils.formatDate(yesterday, "yyyy-MM-dd");
        String todayStr = CommonUtils.formatDate(today, "yyyy-MM-dd");

        Map<String, Object> param = Collections.singletonMap("startTime", startTime);
        Map<String, Double> finishMap = getDataMap("finish", param);
        Map<String, Double> feedingMap = getDataMap("feeding", param);

        Map<String, Double> data = new LinkedHashMap<>();
        data.put("今日完成", finishMap.getOrDefault(todayStr, 0D));
        data.put("昨日完成", feedingMap.getOrDefault(yesterdayStr, 0D));
        data.put("今日投料", finishMap.getOrDefault(todayStr, 0D));
        data.put("昨日投料", feedingMap.getOrDefault(yesterdayStr, 0D));
        return data;
    }

    /**
     * 查询数据转换成map
     *
     * @param sqlId sqlId
     * @param param 查询参数
     */
    private Map<String, Double> getDataMap(String sqlId, Map<String, Object> param) {
        return bsDgDao.getList(MAPPING_ID + sqlId, param).stream().collect(
                Collectors.toMap(r -> r.getString("x"), r -> r.getDouble("y")));
    }

    /**
     * 获取方棒单产
     */
    @Override
    public Map<String, Object> squareSingleYield() {
        List<Record> list = bsDgDao.getList(MAPPING_ID + "squareSingleYield");
        String[] workshops = SysUtils.getBsMachineWorkshops();
        String[] days = getRecent7Days(LocalDateTime.now().minusDays(1));
        return DataUtils.toEchartsData(list, workshops, days);
    }

    /**
     * 机加物料周转天数
     */
    @Override
    public Map<String, Object> turnoverDays() {
        List<Record> list = bsDgDao.getList(MAPPING_ID + "turnoverDays");
        String[] types = new String[]{"毛棒", "其他"};
        String[] days = getRecent7Days(LocalDateTime.now());
        return DataUtils.toEchartsData(list, types, days);
    }

    /**
     * 机加48小时在线
     */
    @Override
    public Map<String, Object> machineOnline48() {
        List<Record> list = bsDgDao.getList(MAPPING_ID + "machineOnline48");
        String[] types = new String[]{"毛棒检测", "毛棒", "圆棒", "毛方棒", "成品方棒"};
        String[] workshops = SysUtils.getBsMachineWorkshops();
        return DataUtils.toEchartsData(list, types, workshops);
    }

    /**
     * 断线
     */
    @Override
    public Map<String, Object> breakLine() {
        String startTime, endTime;
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8) {
            startTime = now.plusDays(-2).withHour(8).withMinute(0).withSecond(0).format(TIME_FORMATTER);
            endTime = now.plusDays(-1).withHour(8).withMinute(0).withSecond(0).format(TIME_FORMATTER);
        } else {
            startTime = now.plusDays(-1).withHour(8).withMinute(0).withSecond(0).format(TIME_FORMATTER);
            endTime = now.withHour(8).withMinute(0).withSecond(0).format(TIME_FORMATTER);
        }
        Map<String, Object> param = new HashMap<>();
        param.put("startTime", startTime);
        param.put("endTime", endTime);
        Map<String, Double> dataMap = bsScadaDao.getList(MAPPING_ID + "breakLine", param).stream().collect(HashMap::new,
                (m, r) -> {
                    String workshop = r.remove("workshop").toString();
                    for (String type : r.keySet()) {
                        m.put(type + workshop, r.getDouble(type));
                    }
                }, HashMap::putAll);
        String[] workshops = SysUtils.getBsSingleWorkshops();
        ArrayUtils.reverse(workshops);
        String[] types = new String[]{"断线", "放断", "切手动"};
        return DataUtils.toEchartsData(dataMap, types, workshops);
    }

    /**
     * 切方产能
     */
    @Override
    public Map<String, Object> buttYield() {
        List<Record> list = bsDgDao.getList(MAPPING_ID + "buttYield");
        String[] workshops = SysUtils.getBsMachineWorkshops();
        return DataUtils.toEchartsData(list, workshops);
    }

    /**
     * 抛光产能
     */
    @Override
    public Map<String, Object> polishingYield() {
        List<Record> list = bsDgDao.getList(MAPPING_ID + "polishingYield");
        String[] workshops = SysUtils.getBsMachineWorkshops();
        return DataUtils.toEchartsData(list, workshops);
    }

    /**
     * 寿命大于150占比
     */
    @Override
    public Map<String, Object> lifetimeGt150() {
        List<Record> list = bsDgDao.getList(MAPPING_ID + "lifetimeGt150");
        String[] days = getRecent7Days(LocalDateTime.now());
        return DataUtils.toEchartsData(list, days);
    }

    /**
     * 单晶8小时在线
     */
    @Override
    public Map<String, Object> singleOnline8() {
        Map<String, Double> dataMap = bsDgDao.getList(MAPPING_ID + "singleOnline8").stream().collect(
                Collectors.toMap(r -> r.getString("x"), r -> r.getDouble("y")));
        String[] workshops = SysUtils.getBsSingleWorkshops();

        Map<String, Object> data = new HashMap<>();
        data.put("legend", workshops);
        data.put("series", dataMap);
        return data;
    }

    /**
     * 获取最近七天日期
     *
     * @param endDate 结束日期
     */
    private String[] getRecent7Days(LocalDateTime endDate) {
        if (endDate.getHour() < 8) {
            endDate = endDate.plusDays(-1);
        }
        String[] days = new String[7];
        days[6] = endDate.format(DAY_FORMATTER);
        for (int i = 1; i < 7; i++) {
            days[6 - i] = endDate.minusDays(i).format(DAY_FORMATTER);
        }
        return days;
    }
}

