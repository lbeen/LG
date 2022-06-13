package com.report.utils.web;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;
import com.report.dao.Dao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataUtils {
    /**
     * 获取echarts数据
     *
     * @param dao   dao
     * @param sqlId sqlId
     * @param param 查询参数
     * @param xAxis X轴条目
     */
    public static EchartsSingleData getEchartsData(Dao dao, String sqlId, Map<String, Object> param, String[] xAxis) {
        Map<String, Double> map = getMap(dao, sqlId, param);
        double[] yAxis = new double[xAxis.length];
        for (int i = 0; i < xAxis.length; i++) {
            Double value = map.get(xAxis[i]);
            if (value != null) {
                yAxis[i] = value;
            }
        }
        return new EchartsSingleData(xAxis, yAxis);
    }

    /**
     * 获取echarts数据
     *
     * @param dao    dao
     * @param sqlId  sqlId
     * @param param  查询参数
     * @param legend 数据条目
     * @param xAxis  X轴条目
     */
    public static EchartsData getEchartsData(Dao dao, String sqlId, Map<String, Object> param, String[] legend,
                                             String[] xAxis) {
        return toEchartsData(getTable(dao, sqlId, param), legend, xAxis);
    }

    /**
     * 获取数据table
     *
     * @param dao   dao
     * @param sqlId sqlId
     * @param param 查询参数
     */
    public static Table<String, String, Double> getTable(Dao dao, String sqlId, Map<String, Object> param) {
        return dao.getList(sqlId, param).stream().collect(HashBasedTable::create,
                (t, r) -> t.put(r.getString("k1"), r.getString("k2"), r.getDouble("v")), Table::putAll);
    }

    /**
     * 转换成Echarts数据
     *
     * @param table  数据table
     * @param legend 数据条目
     * @param xAxis  X轴条目
     */
    public static EchartsData toEchartsData(Table<String, String, Double> table, String[] legend, String[] xAxis) {
        double[][] yAxis = new double[legend.length][xAxis.length];
        for (int i = 0; i < legend.length; i++) {
            Map<String, Double> row = table.row(legend[i]);
            for (int j = 0; j < xAxis.length; j++) {
                Double value = row.get(xAxis[j]);
                if (value != null) {
                    yAxis[i][j] = value;
                }
            }
        }
        return new EchartsData(legend, xAxis, yAxis);
    }

    /**
     * 获取echarts数据
     *
     * @param dao    dao
     * @param sqlId  sqlId
     * @param param  查询参数
     * @param legend 数据条目
     */
    public static EchartsPieData getEchartsPieData(Dao dao, String sqlId, Map<String, Object> param, String[] legend) {
        Map<String, Double> map = getMap(dao, sqlId, param);

        List<Map<String, Object>> series = Lists.newArrayList();
        for (String key : legend) {
            series.add(ImmutableMap.of("name", key, "value", map.getOrDefault(key, 0D)));
        }
        return new EchartsPieData(legend, series);
    }

    /**
     * 获取数据map
     *
     * @param dao   dao
     * @param sqlId sqlId
     * @param param 查询参数
     */
    public static Map<String, Double> getMap(Dao dao, String sqlId, Map<String, Object> param) {
        return dao.getList(sqlId, param).stream().collect(
                Collectors.toMap(r -> r.getString("k"), r -> r.getDouble("v")));
    }
}
