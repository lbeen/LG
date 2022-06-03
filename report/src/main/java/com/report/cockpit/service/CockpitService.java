package com.report.cockpit.service;

import java.util.Map;

/**
 * 驾驶舱service
 */
public interface CockpitService {
    /**
     * 获取投料量和毛棒产量
     */
    Map<String, Double> feedingAndFinish();

    /**
     * 获取方棒单产
     */
    Map<String, Object> squareSingleYield();

    /**
     * 机加物料周转天数
     */
    Map<String, Object> turnoverDays();

    /**
     * 机加48小时在线
     */
    Map<String, Object> machineOnline48();

    /**
     * 断线
     */
    Map<String, Object> breakLine();

    /**
     * 切方产能
     */
    Map<String, Object> buttYield();

    /**
     * 抛光产能
     */
    Map<String, Object> polishingYield();

    /**
     * 寿命大于150占比
     */
    Map<String, Object> lifetimeGt150();

    /**
     * 单晶8小时在线
     */
    Map<String, Object> singleOnline8();
}
