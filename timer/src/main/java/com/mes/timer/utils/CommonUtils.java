package com.mes.timer.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CommonUtils {
    /**
     * 除法
     *
     * @param dividend 被除数
     * @param divisor  除数
     * @param round    保留位数
     */
    public static Double divide(Double dividend, Double divisor, int round) {
        if (dividend == null || divisor == null) {
            return null;
        }
        return BigDecimal.valueOf(dividend).divide(BigDecimal.valueOf(divisor), round,
                RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * 保留小数
     *
     * @param num   数字
     * @param scale 小数位数
     */
    public static Double round(Double num, int scale) {
        if (num == null) {
            return null;
        }
        return BigDecimal.valueOf(num).setScale(scale, RoundingMode.HALF_UP).doubleValue();
    }
}
