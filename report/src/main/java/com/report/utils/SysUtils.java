package com.report.utils;

import com.report.constants.Factory;
import com.report.constants.SysConstants;

/**
 * 系统工具
 */
public class SysUtils {
    public static final String DS_BS_DG = "bs-dg";
    public static final String DS_TC_DG = "tc-dg";
    public static final String DS_BS_SCADA = "bs-scada";
    public static final String DS_TC_SCADA = "tc-scada";

    /**
     * 获取DG库数据源
     *
     * @param factory 工厂
     */
    public static String getDGDataSource(String factory) {
        Factory factoryEnum = Factory.getFactory(factory);
        if (factoryEnum == Factory.BS) {
            return DS_BS_DG;
        }
        if (factoryEnum == Factory.TC) {
            return DS_TC_DG;
        }
        throw new RuntimeException("工厂匹配不到对应DG库数据源");
    }

    /**
     * 获取SCADA库数据源
     *
     * @param DGDataSource DG数据源
     */
    public static String getSCADADataSource(String DGDataSource) {
        switch (DGDataSource) {
            case DS_BS_DG:
                return DS_BS_SCADA;
            case DS_TC_DG:
                return DS_TC_SCADA;
            default:
                throw new RuntimeException("DG数据源匹配不到对应SCADA库数据源");
        }
    }

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

    /**
     * 获取保山车间区域
     */
    public static String[] getBsWorkshopAreas(String workshop) {
        switch (workshop) {
            case SysConstants.MACHINE_SHOP_1:
                return new String[]{"一车间"};
            case SysConstants.MACHINE_SHOP_2:
                return new String[]{"二车间"};
            case SysConstants.MACHINE_SHOP_3:
                return new String[]{"三车间南", "三车间北"};
            default:
                throw new RuntimeException("车间找不到对应区域");
        }
    }

    /**
     * 获取腾冲单晶车间
     */
    public static String[] getTcSingleWorkshops() {
        return new String[]{"一车间南", "一车间北"};
    }

    /**
     * 获取腾冲机加车间
     */
    public static String[] getTcMachineWorkshops() {
        return new String[]{"一车间南", "一车间北"};
    }

    /**
     * 获取腾冲车间区域
     */
    public static String[] getTCWorkshopAreas() {
        return new String[]{"一车间南", "一车间北"};
    }

    /**
     * 获取单晶车间名称
     */
    public static String getSingleWorkshopName(String machineWorkshop) {
        switch (machineWorkshop) {
            case SysConstants.MACHINE_SHOP_1:
                return "单晶一车间";
            case SysConstants.MACHINE_SHOP_2:
                return "单晶二车间";
            case SysConstants.MACHINE_SHOP_3:
                return "单晶三车间";
            default:
                return null;
        }
    }
}
