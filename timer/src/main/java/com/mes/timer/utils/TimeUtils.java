package com.mes.timer.utils;

import com.google.common.collect.Maps;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class TimeUtils {
    public static final String PATTERN_TIME = "yyyy-MM-dd HH:mm:ss";
    /**
     * 日期格式器缓存
     */
    private static final Map<String, DateTimeFormatter> DATETIME_FORMATTERS = Maps.newHashMap();

    /**
     * 格式化时间
     *
     * @param dateTime 时间
     */
    public static String formatTime(LocalDateTime dateTime) {
        return dateTime.format(getFormatter(PATTERN_TIME));
    }

    /**
     * 获取时间格式器
     *
     * @param pattern 格式
     */
    public static DateTimeFormatter getFormatter(String pattern) {
        DateTimeFormatter formatter = DATETIME_FORMATTERS.get(pattern);
        if (formatter == null) {
            formatter = DateTimeFormatter.ofPattern(pattern);
            DATETIME_FORMATTERS.put(pattern, formatter);
        }
        return formatter;
    }
}
