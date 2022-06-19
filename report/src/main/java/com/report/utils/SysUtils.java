package com.report.utils;

import com.report.sys.Factory;
import com.report.sys.SysConstants;

/**
 * 系统工具
 */
public class SysUtils {
    public static final String DS_BS_DG = "bs-dg";
    public static final String DS_TC_DG = "tc-dg";
    public static final String DS_BS_MACHINE1 = "bs-machine1";
    public static final String DS_BS_MACHINE2 = "bs-machine2";
    public static final String DS_BS_MACHINE3 = "bs-machine3";
    public static final String DS_TC_MACHINE1 = "tc-machine1";


    /**
     * 获取机加数据库Dao
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
        throw new RuntimeException("工厂匹配不到对应数据源");
    }

    /**
     * 获取机加数据库Dao
     *
     * @param factory 工厂
     * @param shop    车间
     */
    public static String getMachineDataSource(String factory, String shop) {
        Factory factoryEnum = Factory.getFactory(factory);
        if (factoryEnum == Factory.BS) {
            if (SysConstants.MACHINE_SHOP_1.equalsIgnoreCase(shop)) {
                return DS_BS_MACHINE1;
            }
            if (SysConstants.MACHINE_SHOP_2.equalsIgnoreCase(shop)) {
                return DS_BS_MACHINE2;
            }
            if (SysConstants.MACHINE_SHOP_3.equalsIgnoreCase(shop)) {
                return DS_BS_MACHINE3;
            }
        } else if (factoryEnum == Factory.TC) {
            if (SysConstants.MACHINE_SHOP_1.equalsIgnoreCase(shop)) {
                return DS_TC_MACHINE1;
            }
        }
        throw new RuntimeException("工厂和车间匹配不到对应机加数据库Dao");
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
}
