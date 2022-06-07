package com.mes.util;

import com.datasweep.compatibility.ui.Time;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

/**
 * 公共工具
 */
public class CommonUtils {
    /**
     * uuid
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }

    /**
     * 转字符串（null->''）
     *
     * @param obj 对象
     */
    public static String toString(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    /**
     * 字符串转TIme
     */
    public static Time str2Time(String timeStr) throws Exception {
        Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(timeStr);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return new Time(calendar);
    }

    /**
     * time转日期字符串
     *
     * @param time time
     */
    public static String timeToDayStr(Time time) {
        return timeToStr(time, "yyyy-MM-dd");
    }

    /**
     * time转日期字符串
     *
     * @param time time
     */
    public static String timeToStr(Time time, String format) {
        if (time == null) {
            return "";
        }
        return new SimpleDateFormat(format).format(time.getCalendar().getTime());
    }

    /**
     * 四舍五入
     *
     * @param number 数字
     * @param round  保留几位小数
     */
    public static double round(float number, int round) {
        return new BigDecimal(number).setScale(round, RoundingMode.HALF_UP).doubleValue();
    }

}
