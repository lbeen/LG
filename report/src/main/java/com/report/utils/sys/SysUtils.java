package com.report.utils.sys;

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

    /**
     * 获取保山单晶车间
     */
    public static String[] getBsSingleWorkshops() {
        return new String[]{"一车间", "二车间", "三车间南", "三车间北"};
    }

    /**
     * 获取保山机加车间
     */
    public static String[] getBsMachineWorkshops() {
        return new String[]{"一车间", "二车间", "三车间"};
    }
}
