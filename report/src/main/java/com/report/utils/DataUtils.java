package com.report.utils;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Table;
import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.EchartsPieData;
import com.report.utils.pojo.EchartsSingleData;
import com.report.utils.pojo.Record;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataUtils {
    /**
     * 获取echarts数据
     *
     * @param query  查询方法
     * @param param  查询参数
     * @param legend 数据条目
     * @param xAxis  X轴条目
     */
    public static EchartsData getEchartsData(Function<Map<String, Object>, List<Record>> query,
                                             Map<String, Object> param, String[] legend, String[] xAxis) {
        return toEchartsData(getTable(query, param), legend, xAxis);
    }

    /**
     * 获取echarts数据
     *
     * @param query 查询方法
     * @param param 查询参数
     * @param xAxis X轴条目
     */
    public static EchartsSingleData getEchartsData(Function<Map<String, Object>, List<Record>> query,
                                                   Map<String, Object> param, String[] xAxis) {
        Map<String, Double> map = getMap(query, param);
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
     * @param query  查询方法
     * @param param  查询参数
     * @param legend 数据条目
     * @param xAxis  X轴条目
     */
    public static EchartsData getEchartsData(Function<Map<String, Object>, List<Record>> query,
                                             Map<String, Object> param, String[] legend, String[] xAxis) {
        return toEchartsData(getTable(query, param), legend, xAxis);
    }

    /**
     * 获取数据table
     *
     * @param query 查询方法
     * @param param 查询参数
     */
    public static Table<String, String, Double> getTable(Function<Map<String, Object>, List<Record>> query,
                                                         Map<String, Object> param) {
        return query.apply(param).stream().collect(HashBasedTable::create,
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
     * @param query  查询方法
     * @param param  查询参数
     * @param legend 数据条目
     */
    public static EchartsPieData getEchartsPieData(Function<Map<String, Object>, List<Record>> query,
                                                   Map<String, Object> param, String[] legend) {
        Map<String, Double> map = getMap(query, param);

        List<Map<String, Object>> series = Lists.newArrayList();
        for (String key : legend) {
            series.add(ImmutableMap.of("name", key, "value", map.getOrDefault(key, 0D)));
        }
        return new EchartsPieData(legend, series);
    }

    /**
     * 获取数据map
     *
     * @param query 查询方法
     * @param param 查询参数
     */
    public static Map<String, Double> getMap(Function<Map<String, Object>, List<Record>> query,
                                             Map<String, Object> param) {
        return query.apply(param).stream().collect(Collectors.toMap(r -> r.getString("k"), r -> r.getDouble("v")));
    }
}
