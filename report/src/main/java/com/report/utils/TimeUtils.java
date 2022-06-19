package com.report.utils;

import com.google.common.collect.Maps;
import com.report.utils.pojo.Times;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class TimeUtils {
    /**
     * 日期格式器缓存
     */
    private static final Map<String, DateTimeFormatter> DATETIME_FORMATTERS = Maps.newHashMap();

    /**
     * 格式化现在时间
     */
    public static String formatNowTime() {
        return LocalDateTime.now().format(getFormatter("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 格式化时间
     *
     * @param dateTime 时间
     */
    public static String formatTime(LocalDateTime dateTime) {
        return dateTime.format(getFormatter("yyyy-MM-dd HH:mm:ss"));
    }

    /**
     * 格式化时间数组
     *
     * @param times 时间时间数组
     */
    public static String[] formatTime(LocalDateTime[] times) {
        return formatArray(times, "yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 格式化时间
     *
     * @param dateTime 时间
     */
    public static String formatDay(LocalDateTime dateTime) {
        return dateTime.format(getFormatter("yyyy-MM-dd"));
    }

    /**
     * 格式化时间数组
     *
     * @param times 时间时间数组
     */
    public static String[] formatShortDay(LocalDateTime[] times) {
        return formatArray(times, "MM-dd");
    }

    /**
     * 格式化时间数组
     *
     * @param times 时间时间数组
     */
    private static String[] formatArray(LocalDateTime[] times, String pattern) {
        DateTimeFormatter formatter = getFormatter(pattern);
        String[] formats = new String[times.length];
        for (int i = 0; i < times.length; i++) {
            formats[i] = times[i].format(formatter);
        }
        return formats;
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

    /**
     * 获取最近N天日期（8点对8点）
     *
     * @param delay 推后天数
     * @param count 天数
     */
    public static LocalDateTime[] getRecentDays8(int delay, int count) {
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8) {
            delay++;
        }
        now = now.minusDays(delay).withHour(8).withMinute(0).withSecond(0).withNano(0);

        LocalDateTime[] days = new LocalDateTime[count];
        days[count - 1] = now;
        for (int i = 1; i < count; i++) {
            days[count - 1 - i] = now.minusDays(i);
        }
        return days;
    }

    /**
     * 获取最近两个班次
     */
    public static Times getRecent2Shifts() {
        Times times = new Times();

        DateTimeFormatter formatter = getFormatter("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8) {
            LocalDateTime shift1 = now.minusDays(1).withHour(8).withMinute(0).withSecond(0).withNano(0);
            LocalDateTime shift2 = shift1.plusHours(12);
            times.addTime(shift1, shift1.format(formatter) + "白班", "上个白班");
            times.addTime(shift2, shift2.format(formatter) + "夜班", "本次夜班");
            return times;
        }
        if (now.getHour() < 20) {
            LocalDateTime shift1 = now.minusDays(1).withHour(20).withMinute(0).withSecond(0).withNano(0);
            LocalDateTime shift2 = shift1.plusHours(12);
            times.addTime(shift1, shift1.format(formatter) + "夜班", "上个夜班");
            times.addTime(shift2, shift2.format(formatter) + "白班", "本次白班");
            return times;
        }
        LocalDateTime shift1 = now.withHour(8).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime shift2 = shift1.plusHours(12);
        times.addTime(shift1, shift1.format(formatter) + "白班", "上个白班");
        times.addTime(shift2, shift2.format(formatter) + "夜班", "本次夜班");
        return times;
    }
}
