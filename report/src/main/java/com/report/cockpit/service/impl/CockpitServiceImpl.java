package com.report.cockpit.service.impl;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.report.cockpit.service.CockpitService;
import com.report.dao.Dao;
import com.report.utils.common.CommonUtils;
import com.report.utils.common.TimeUtils;
import com.report.utils.sys.SysUtils;
import com.report.utils.web.DataUtils;
import com.report.utils.web.EchartsData;
import com.report.utils.web.EchartsPieData;
import com.report.utils.web.EchartsSingleData;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 驾驶舱service
 */
@Service
@RequiredArgsConstructor
public class CockpitServiceImpl implements CockpitService {
    private static final String MAPPING_ID = "Cockpit.";

    private final Dao bsDgDao;

    private final Dao bsScadaDao;

    /**
     * 寿命大于150占比
     */
    @Override
    public EchartsSingleData lifetimeGt150() {
        LocalDateTime[] days = TimeUtils.getRecentDays8(0, 7);
        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        return DataUtils.getEchartsData(bsDgDao, MAPPING_ID + "lifetimeGt150", param, TimeUtils.formatShortDay(days));
    }

    /**
     * 断线
     */
    @Override
    public EchartsData breakLine() {
        LocalDateTime[] days = TimeUtils.getRecentDays8(0, 2);
        String[] formats = TimeUtils.formatTime(days);

        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", formats[0]);
        param.put("endTime", formats[1]);
        param.put("startDay", TimeUtils.formatDay(days[0]));
        Table<String, String, Double> table = bsScadaDao.getList(MAPPING_ID + "breakLine", param).stream().collect(
                HashBasedTable::create, (t, r) -> {
                    String workshop = r.remove("workshop").toString();
                    for (String type : r.keySet()) {
                        switch (type) {
                            case "dd":
                                t.put("断线", workshop, r.getDouble(type));
                                break;
                            case "fd":
                                t.put("放断", workshop, r.getDouble(type));
                                break;
                            case "qsd":
                                t.put("切手动", workshop, r.getDouble(type));
                                break;
                        }
                    }
                }, Table::putAll);
        String[] workshops = SysUtils.getBsSingleWorkshops();
        ArrayUtils.reverse(workshops);
        String[] types = new String[]{"断线", "放断", "切手动"};
        return DataUtils.toEchartsData(table, types, workshops);
    }

    /**
     * 获取投料量和方棒产量
     */
    @Override
    public Map<String, Double> feedingAndFinish() {
        LocalDateTime[] days = TimeUtils.getRecentDays8(0, 2);

        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        Map<String, Double> finishMap = DataUtils.getMap(bsDgDao, MAPPING_ID + "finish", param);
        Map<String, Double> feedingMap = DataUtils.getMap(bsDgDao, MAPPING_ID + "feeding", param);

        String[] shortDays = TimeUtils.formatShortDay(days);
        Map<String, Double> data = new LinkedHashMap<>();
        data.put("今日方棒产量（t）", finishMap.getOrDefault(shortDays[1], 0D));
        data.put("昨日方棒产量（t）", finishMap.getOrDefault(shortDays[0], 0D));
        data.put("今日投料（t）", feedingMap.getOrDefault(shortDays[1], 0D));
        data.put("昨日投料（t）", feedingMap.getOrDefault(shortDays[0], 0D));
        return data;
    }

    /**
     * 获取方棒单产
     */
    @Override
    public EchartsData squareSingleYield() {
        LocalDateTime[] days = TimeUtils.getRecentDays8(2, 7);

        Map<String, Object> param = Maps.newHashMap();
        param.put("startTime", TimeUtils.formatTime(days[0]));
        param.put("endTime", TimeUtils.formatTime(days[0].plusDays(7)));

        Table<String, String, Double> yieldTable = DataUtils.getTable(bsDgDao, MAPPING_ID + "squareYield", param);
        Table<String, String, Double> timeTable = DataUtils.getTable(bsDgDao, MAPPING_ID + "timeSingle", param);

        String[] workshops = SysUtils.getBsMachineWorkshops();
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
                yAxis[i][j] = CommonUtils.round(yield / time, 1);
            }
        }
        return new EchartsData(workshops, shortDays, yAxis);
    }

    /**
     * 获取单晶产能
     */
    @Override
    public EchartsData singleYield() {
        return getYield("singleYield", SysUtils.getBsSingleWorkshops());
    }

    /**
     * 获取机加产能
     */
    @Override
    public EchartsData machineYield() {
        return getYield("machineYield", SysUtils.getBsMachineWorkshops());
    }

    /**
     * 获取产量
     *
     * @param sqlId     sqlId
     * @param workshops 车间
     */
    private EchartsData getYield(String sqlId, String[] workshops) {
        LocalDateTime[] days = TimeUtils.getRecentDays8(0, 2);
        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        EchartsData echartsData = DataUtils.getEchartsData(bsDgDao, MAPPING_ID + sqlId, param,
                TimeUtils.formatShortDay(days), workshops);
        echartsData.setLegend(new String[]{"昨日", "今日"});
        return echartsData;
    }

    /**
     * 机加物料周转天数
     */
    @Override
    public EchartsData turnoverDays() {
        LocalDateTime[] days = TimeUtils.getRecentDays8(0, 7);
        Map<String, Object> param = Collections.singletonMap("startTime", TimeUtils.formatTime(days[0]));
        String[] types = new String[]{"毛棒", "其他"};
        return DataUtils.getEchartsData(bsDgDao, MAPPING_ID + "turnoverDays", param, types,
                TimeUtils.formatShortDay(days));
    }

    /**
     * 机加48小时在线
     */
    @Override
    public EchartsData machineOnline48() {
        String[] types = new String[]{"毛棒检测", "毛棒", "圆棒", "毛方棒", "成品方棒"};
        String[] workshops = SysUtils.getBsMachineWorkshops();
        return DataUtils.getEchartsData(bsDgDao, MAPPING_ID + "machineOnline48", null, types, workshops);
    }

    /**
     * 单晶8小时在线
     */
    @Override
    public EchartsPieData singleOnline8() {
        return DataUtils.getEchartsPieData(bsDgDao, "singleOnline8", null, SysUtils.getBsSingleWorkshops());
    }
}

