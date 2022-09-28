package com.report.cockpit.service;

import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.EchartsPieData;
import com.report.utils.pojo.EchartsSingleData;

import java.util.List;
import java.util.Map;

/**
 * 驾驶舱service
 */
public interface CockpitService {

    /**
     * 寿命大于150占比
     *
     * @param DS 数据源
     */
    EchartsSingleData lifetimeGt150(String DS);

    /**
     * 断线数据
     *
     * @param DS 数据源
     */
    EchartsData breakLine(String DS);

    /**
     * 获取投料量和方棒产量
     *
     * @param DS 数据源
     */
    List<Map<String, Object>> feedingAndFinish(String DS);

    /**
     * 获取保山方棒单产
     *
     * @param DS 数据源
     */
    Object squareSingleYield(String DS);

    /**
     * 获取单晶产能
     *
     * @param DS 数据源
     */
    EchartsData singleYield(String DS);

    /**
     * 获取机加产能
     *
     * @param DS 数据源
     */
    EchartsData machineYield(String DS);

    /**
     * 机加物料周转天数
     *
     * @param DS 数据源
     */
    EchartsData turnoverDays(String DS);

    /**
     * 机加48小时在线
     *
     * @param DS 数据源
     */
    EchartsData machineOnline48(String DS);

    /**
     * 单晶8小时在线
     *
     * @param DS 数据源
     */
    EchartsPieData singleOnline8(String DS);

    /**
     * 成品率
     *
     * @param DS 数据源
     */
    EchartsSingleData singleFinishedRate(String DS);

    /**
     * 交料趋势
     *
     * @param DS 数据源
     */
    EchartsData payLength(String DS);

    /**
     * 单晶在线
     *
     * @param DS 数据源
     */
    EchartsData singleOnline(String DS);

    /**
     * 机加在线
     *
     * @param DS 数据源
     */
    EchartsSingleData machineOnline(String DS);
}
