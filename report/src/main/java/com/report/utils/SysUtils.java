package com.report.utils;

/**
 * 系统工具
 */
public class SysUtils {
    /**
     * 获取拉晶车间
     *
     * @param shop 车间
     */
    public static String getLJShop(String shop) {
        return shop.substring(0, 5) + "LJ";
    }
}
