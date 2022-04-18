package com.report.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * 公共工具
 */
public class CommonUtils {
    /**
     * uuid
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 对象变字符串，null->""
     */
    public static String toString(Object obj) {
        return Objects.toString(obj, "");
    }

    /**
     * 保留小数
     *
     * @param num   数字
     * @param scale 小数位数
     */
    public static double round(Double num, int scale) {
        if (num == null) {
            num = 0.0;
        }
        return new BigDecimal(num).setScale(scale, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * value增加
     */
    public static void increaseValue(Map<String, Integer> map, String key, int addValue) {
        Integer value = map.get(key);
        if (value == null) {
            value = addValue;
        } else {
            value += addValue;
        }
        map.put(key, value);
    }

    /**
     * 获取map排序后的key
     */
    public static String[] getSortKey(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getKey).toArray(String[]::new);
    }

    /**
     * 获取map值排序后的key
     */
    public static String[] getSortValueKey(Map<String, Integer> map) {
        return map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).map(
                Map.Entry::getKey).toArray(String[]::new);
    }
}
