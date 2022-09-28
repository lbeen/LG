package com.mes.timer.utils;

import com.mes.timer.constants.Factory;
import com.mes.timer.constants.SysConstants;

/**
 * 系统工具
 */
public class SysUtils {
    public static final String DS_BS_MES = "bs-mes";
    public static final String DS_TC_MES = "tc-mes";
    public static final String DS_BS_MACHINE1 = "bs-machine1";
    public static final String DS_BS_MACHINE2 = "bs-machine2";
    public static final String DS_BS_MACHINE3 = "bs-machine3";
    public static final String DS_TC_MACHINE1 = "tc-machine1";

    /**
     * 获取MES库数据源
     *
     * @param factory 工厂
     */
    public static String getMESDataSource(String factory) {
        return getMESDataSource(Factory.getFactory(factory));
    }

    /**
     * 获取MES库数据源
     *
     * @param factory 工厂
     */
    public static String getMESDataSource(Factory factory) {
        if (factory == Factory.BS) {
            return DS_BS_MES;
        }
        if (factory == Factory.TC) {
            return DS_TC_MES;
        }
        throw new RuntimeException("工厂匹配不到对应MES库库数据源");
    }

    /**
     * 获取机加数据库数据源
     *
     * @param factory 工厂
     * @param shop    车间
     */
    public static String getMachineDataSource(Factory factory, String shop) {
        if (factory == Factory.BS) {
            if (SysConstants.MACHINE_SHOP_1.equalsIgnoreCase(shop)) {
                return DS_BS_MACHINE1;
            }
            if (SysConstants.MACHINE_SHOP_2.equalsIgnoreCase(shop)) {
                return DS_BS_MACHINE2;
            }
            if (SysConstants.MACHINE_SHOP_3.equalsIgnoreCase(shop)) {
                return DS_BS_MACHINE3;
            }
        } else if (factory == Factory.TC) {
            if (SysConstants.MACHINE_SHOP_1.equalsIgnoreCase(shop)) {
                return DS_TC_MACHINE1;
            }
        }
        throw new RuntimeException("工厂和车间匹配不到对应机加数据库数据源");
    }
}
