package com.report.utils;

import com.google.common.collect.Maps;
import com.report.utils.pojo.Shifts;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class TimeUtils {
    public static final String PATTERN_TIME = "yyyy-MM-dd HH:mm:ss";
    public static final String PATTERN_DAY = "yyyy-MM-dd";
    public static final String PATTERN_SHORTDAY = "MM-dd";

    /**
     * 日期格式器缓存
     */
    private static final Map<String, DateTimeFormatter> DATETIME_FORMATTERS = Maps.newHashMap();

    /**
     * 格式化现在时间
     */
    public static String formatNowTime() {
        return LocalDateTime.now().format(getFormatter(PATTERN_TIME));
    }

    /**
     * 格式化时间
     *
     * @param dateTime 时间
     */
    public static String formatTime(LocalDateTime dateTime) {
        return dateTime.format(getFormatter(PATTERN_TIME));
    }

    /**
     * 格式化时间
     *
     * @param dateTime 时间
     */
    public static String formatDay(LocalDateTime dateTime) {
        return dateTime.format(getFormatter(PATTERN_DAY));
    }

    /**
     * 格式化时间数组
     *
     * @param times 时间时间数组
     */
    public static String[] formatDay(LocalDateTime[] times) {
        return formatArray(times, PATTERN_DAY);
    }

    /**
     * 格式化时间
     *
     * @param dateTime 时间
     */
    public static String formatShortDay(LocalDateTime dateTime) {
        return dateTime.format(getFormatter(PATTERN_SHORTDAY));
    }

    /**
     * 格式化时间数组
     *
     * @param times 时间时间数组
     */
    public static String[] formatShortDay(LocalDateTime[] times) {
        return formatArray(times, PATTERN_SHORTDAY);
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
     * 获取最近N天班次日期（8点对8点）
     *
     * @param delay 推后天数
     * @param count 天数
     */
    public static LocalDateTime[] getRecentShiftDays(int delay, int count) {
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8) {
            delay++;
        }
        now = get8oClock(now.minusDays(delay));

        LocalDateTime[] days = new LocalDateTime[count];
        days[count - 1] = now;
        for (int i = 1; i < count; i++) {
            days[count - 1 - i] = now.minusDays(i);
        }
        return days;
    }

    /**
     * 获取早上8点
     *
     * @param dateTime 时间
     */
    public static LocalDateTime get8oClock(LocalDateTime dateTime) {
        return dateTime.withHour(8).withMinute(0).withSecond(0).withNano(0);
    }

    /**
     * 获取本次班次8点
     */
    public static LocalDateTime getShiftDay8oClock() {
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8) {
            return get8oClock(now.minusDays(1));
        }
        return get8oClock(now);
    }

    /**
     * 获取最近两个班次
     */
    public static Shifts getRecent2Shifts() {
        Shifts shifts = new Shifts();

        DateTimeFormatter formatter = getFormatter(PATTERN_DAY);
        LocalDateTime now = LocalDateTime.now();
        if (now.getHour() < 8) {
            LocalDateTime shift1 = get8oClock(now.minusDays(1));
            LocalDateTime shift2 = shift1.plusHours(12);
            shifts.add(shift1, shift1.format(formatter) + "白班", "上个白班");
            shifts.add(shift2, shift2.format(formatter) + "夜班", "本次夜班");
            return shifts;
        }
        if (now.getHour() < 20) {
            LocalDateTime shift1 = now.minusDays(1).withHour(20).withMinute(0).withSecond(0).withNano(0);
            LocalDateTime shift2 = shift1.plusHours(12);
            shifts.add(shift1, shift1.format(formatter) + "夜班", "上个夜班");
            shifts.add(shift2, shift2.format(formatter) + "白班", "本次白班");
            return shifts;
        }
        LocalDateTime shift1 = get8oClock(now);
        LocalDateTime shift2 = shift1.plusHours(12);
        shifts.add(shift1, shift1.format(formatter) + "白班", "上个白班");
        shifts.add(shift2, shift2.format(formatter) + "夜班", "本次夜班");
        return shifts;
    }

    /**
     * 现在是一个班次天的几分之几（精确到分钟）
     */
    public static double nowOfShiftDayPercent() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime today = get8oClock(now);
        if (now.getHour() < 8) {
            today = now.minusDays(1);
        }
        return Duration.between(today, now).toMinutes() / 1440D;
    }
}
