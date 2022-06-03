package com.report.utils;

/**
 * 系统工具
 */
public class SysUtils {
    private static final String[] BS_SINGLE_WORKSHOPS = new String[]{"一车间", "二车间", "三车间南", "三车间北"};
    private static final String[] BS_MACHINE_WORKSHOPS = new String[]{"一车间", "二车间", "三车间"};

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
        return BS_SINGLE_WORKSHOPS.clone();
    }

    /**
     * 获取保山机加车间
     */
    public static String[] getBsMachineWorkshops() {
        return BS_MACHINE_WORKSHOPS.clone();
    }
}
