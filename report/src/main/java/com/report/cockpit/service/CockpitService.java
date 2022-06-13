package com.report.cockpit.service;

import com.report.utils.web.EchartsData;
import com.report.utils.web.EchartsPieData;
import com.report.utils.web.EchartsSingleData;

import java.util.Map;

/**
 * 驾驶舱service
 */
public interface CockpitService {

    /**
     * 寿命大于150占比
     */
    EchartsSingleData lifetimeGt150();

    /**
     * 断线
     */
    EchartsData breakLine();

    /**
     * 获取投料量和方棒产量
     */
    Map<String, Double> feedingAndFinish();

    /**
     * 获取方棒单产
     */
    EchartsData squareSingleYield();

    /**
     * 获取单晶产能
     */
    EchartsData singleYield();

    /**
     * 获取机加产能
     */
    EchartsData machineYield();

    /**
     * 机加物料周转天数
     */
    EchartsData turnoverDays();

    /**
     * 机加48小时在线
     */
    EchartsData machineOnline48();

    /**
     * 单晶8小时在线
     */
    EchartsPieData singleOnline8();
}
