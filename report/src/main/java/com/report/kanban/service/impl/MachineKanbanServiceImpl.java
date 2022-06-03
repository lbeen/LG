package com.report.kanban.service.impl;

import com.report.dao.Dao;
import com.report.conf.DaoConfiguration;
import com.report.kanban.service.MachineKanbanService;
import com.report.utils.CommonUtils;
import com.report.utils.Record;
import com.report.utils.SysUtils;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Service
public class MachineKanbanServiceImpl implements MachineKanbanService {
    private static final String MAPPING_ID = "MachineKanban.";

    /**
     * 获取毛棒接收检测数据
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @Override
    public Map<String, Object> getBlankBarCount(String factory, String shop) {
        Dao dao = DaoConfiguration.getDGDao(factory);

        shop = SysUtils.getLJShop(shop);
        String[][] shifts = getLastAndCurrentShift();
        Object[] last = new Object[]{shifts[0][0],
                getDuringCount(dao, "blankBarReceive", shifts[0][1], shifts[0][2], shop),
                getDuringCount(dao, "blankBarTest", shifts[0][1], shifts[0][2], shop)};
        Object[] current = new Object[]{shifts[1][0],
                getDuringCount(dao, "blankBarReceive", shifts[1][1], shifts[1][2], shop),
                getDuringCount(dao, "blankBarTest", shifts[1][1], shifts[1][2], shop)};

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("heads", new String[]{"班次", "毛棒接收", "毛棒检验",});
        returnMap.put("list", new Object[][]{last, current});
        return returnMap;
    }

    /**
     * 获取期间数量
     *
     * @param dao       dao
     * @param sqlId     sqlId
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param shop      车间
     */
    private double getDuringCount(Dao dao, String sqlId, String startTime, String endTime, String shop) {
        Map<String, Object> param = new HashMap<>();
        param.put("startTime", startTime);
        param.put("endTime", endTime);
        param.put("shop", shop);
        return dao.getDouble(MAPPING_ID + sqlId, param, 0);
    }

    /**
     * 获取echarts数据
     *
     * @param dao     dao
     * @param sqlId   sqlId
     * @param shop    车间
     * @param sortByX x轴排序
     */
    @Override
    public Map<String, Object> queryEchartsBarData(Dao dao, String sqlId, String shop, boolean sortByX) {
        String[][] shifts = getLastAndCurrentShift();
        Map<String, Integer> total = new HashMap<>();
        Map<String, Integer> lastMap = queryEchartsBarData(dao, sqlId, shop, shifts[0][1], shifts[0][2], total);
        Map<String, Integer> currentMap = queryEchartsBarData(dao, sqlId, shop, shifts[1][1], shifts[1][2], total);

        String[] xValues = sortByX ? CommonUtils.getSortKey(total) : CommonUtils.getSortValueKey(total);

        int lastTotal = 0, currentTotal = 0;
        int[] lastData = new int[xValues.length], currentData = new int[xValues.length];
        for (int i = 0; i < xValues.length; i++) {
            String xValue = xValues[i];

            Integer lastVal = lastMap.get(xValue);
            if (lastVal != null) {
                lastTotal += lastVal;
                lastData[i] = lastVal;
            }
            Integer currentVal = currentMap.get(xValue);
            if (currentVal != null) {
                currentTotal += currentVal;
                currentData[i] = currentVal;
            }
        }

        Map<String, Object> data = new HashMap<>();
        data.put("legends",
                new String[]{shifts[0][0] + "（" + lastTotal + "）", shifts[1][0] + "（" + currentTotal + "）"});
        data.put("xData", xValues);
        data.put("yData", new int[][]{lastData, currentData});
        return data;
    }

    /**
     * 查询echarts数据
     *
     * @param dao       dao
     * @param sqlId     sqlId
     * @param shop      车间
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param total     总数map
     */
    private Map<String, Integer> queryEchartsBarData(Dao dao, String sqlId, String shop, String startTime,
                                                     String endTime, Map<String, Integer> total) {
        List<Record> result = queryByShopAndTime(dao, sqlId, shop, startTime, endTime);
        if (CollectionUtils.isEmpty(result)) {
            return Collections.emptyMap();
        }

        Map<String, Integer> data = new HashMap<>();
        for (Record record : result) {
            String xValue = record.getString("x");
            if (StringUtils.isBlank(xValue)) {
                continue;
            }
            String yValue = record.getString("y");
            if (StringUtils.isBlank(yValue)) {
                continue;
            }

            int yValueInt = new BigDecimal(yValue).setScale(0, RoundingMode.HALF_UP).intValue();
            data.put(xValue, yValueInt);
            CommonUtils.increaseValue(total, xValue, yValueInt);
        }
        return data;
    }

    /**
     * 车间时间查询数据
     *
     * @param dao       dao
     * @param sqlId     sqlId
     * @param shop      车间
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    private List<Record> queryByShopAndTime(Dao dao, String sqlId, String shop, String startTime, String endTime) {
        Map<String, Object> param = new HashMap<>();
        param.put("startTime", startTime);
        param.put("endTime", endTime);
        param.put("shop", shop);
        return dao.getList(MAPPING_ID + sqlId, param);
    }

    /**
     * 成品未入托长度分布
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @Override
    public Map<String, Object> finishLenDistribution(String factory, String shop) {
        Dao dao = DaoConfiguration.getDGDao(factory);
        List<Record> result = dao.getList(MAPPING_ID + "finishLenDistribution", Collections.singletonMap("shop", shop));

        Map<String, Integer> headAndTotal = new LinkedHashMap<>();
        int degraded = 0;
        Map<String, Map<String, Integer>> lenSpec = new LinkedHashMap<>();
        for (Record record : result) {
            String spec = record.getString("spec_s");
            String len = record.getString("len");
            int num = record.getInteger("num");

            if ("降级品".equals(spec)) {
                degraded += num;
            } else {
                Integer total = headAndTotal.get(spec);
                total = total == null ? num : (total + num);
                headAndTotal.put(spec, total);
            }
            Map<String, Integer> lenMap = lenSpec.computeIfAbsent(len, k -> new LinkedHashMap<>());
            lenMap.put(spec, num);
        }
        headAndTotal.put("降级品", degraded);

        List<List<Object>> list = new ArrayList<>();
        for (Map.Entry<String, Map<String, Integer>> entry : lenSpec.entrySet()) {
            List<Object> line = new ArrayList<>();
            line.add(entry.getKey());

            Map<String, Integer> specNum = entry.getValue();
            for (String head : headAndTotal.keySet()) {
                line.add(specNum.getOrDefault(head, 0));
            }
            list.add(line);
        }

        List<String> heads = new ArrayList<>();
        heads.add("长度");
        heads.addAll(headAndTotal.keySet());

        List<Object> totals = new ArrayList<>();
        totals.add("合计");
        totals.addAll(headAndTotal.values());
        list.add(totals);

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("heads", heads);
        returnMap.put("list", list);
        return returnMap;
    }

    /**
     * 获取上个班次和本班次
     */
    public String[][] getLastAndCurrentShift() {
        String shift1, shift2;
        LocalDateTime startTime;

        LocalDateTime now = LocalDateTime.now();
        int currentHour = now.getHour();
        if (currentHour < 8) {
            shift1 = "上个白班";
            shift2 = "本次夜班";
            startTime = now.plusDays(-1).withHour(8).withMinute(0).withSecond(0);
        } else if (currentHour < 20) {
            shift1 = "上个夜班";
            shift2 = "本次白班";
            startTime = now.plusDays(-1).withHour(20).withMinute(0).withSecond(0);
        } else {
            shift1 = "上个白班";
            shift2 = "本次夜班";
            startTime = now.withHour(8).withMinute(0).withSecond(0);
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time1 = startTime.format(formatter);
        String time2 = startTime.plusHours(12).format(formatter);
        String time3 = startTime.plusHours(24).format(formatter);
        return new String[][]{{shift1, time1, time2}, {shift2, time2, time3}};
    }

    /**
     * 成品规格分布
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @Override
    public List<Record> finishSpecYield(String factory, String shop) {
        Dao dao = DaoConfiguration.getDGDao(factory);
        String[][] shifts = getLastAndCurrentShift();
        List<Record> list = queryByShopAndTime(dao, "finishSpecYield", shop, shifts[0][1], shifts[0][2]);
        if (CollectionUtils.isEmpty(list)) {
            return Collections.emptyList();
        }
        list.forEach(m -> {
            m.put("name", m.remove("x"));
            m.put("value", m.remove("y"));
        });
        return list;
    }
}
