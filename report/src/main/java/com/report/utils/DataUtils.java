package com.report.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataUtils {
    /**
     * 转换成Echarts数据
     *
     * @param list   数据list
     * @param legend 数据条目
     * @param xAxis  X轴条目
     */
    public static Map<String, Object> toEchartsData(List<Record> list, String[] legend, String[] xAxis) {
        Map<String, Double> dataMap = list.stream().collect(
                Collectors.toMap(r -> r.getString("legend") + r.getString("x"), r -> r.getDouble("y")));
        return toEchartsData(dataMap, legend, xAxis);
    }

    /**
     * 转换成Echarts数据
     *
     * @param dataMap 数据map
     * @param legend  数据条目
     * @param xAxis   X轴条目
     */
    public static Map<String, Object> toEchartsData(Map<String, Double> dataMap, String[] legend, String[] xAxis) {
        double[][] ys = new double[legend.length][xAxis.length];
        for (int i = 0; i < legend.length; i++) {
            for (int j = 0; j < xAxis.length; j++) {
                Double value = dataMap.get(legend[i] + xAxis[j]);
                if (value != null) {
                    ys[i][j] = value;
                }
            }
        }
        Map<String, Object> data = new HashMap<>();
        data.put("legend", legend);
        data.put("xAxis", xAxis);
        data.put("yAxis", ys);
        return data;
    }

    /**
     * 转换成Echarts数据
     *
     * @param list  数据list
     * @param xAxis X轴条目
     */
    public static Map<String, Object> toEchartsData(List<Record> list, String[] xAxis) {
        Map<String, Double> dataMap = list.stream().collect(
                Collectors.toMap(r -> r.getString("x"), r -> r.getDouble("y")));
        return toEchartsData(dataMap, xAxis);
    }

    /**
     * 转换成Echarts数据
     *
     * @param dataMap 数据map
     * @param xAxis   X轴条目
     */
    public static Map<String, Object> toEchartsData(Map<String, Double> dataMap, String[] xAxis) {
        double[] ys = new double[xAxis.length];
        for (int i = 0; i < xAxis.length; i++) {
            Double value = dataMap.get(xAxis[i]);
            if (value != null) {
                ys[i] = value;
            }
        }
        Map<String, Object> data = new HashMap<>();
        data.put("xAxis", xAxis);
        data.put("yAxis", ys);
        return data;
    }
}
