package com.report.cockpit.service;

import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.EchartsSingleData;

import java.util.Map;

/**
 * 驾驶舱service
 */
public interface MachineCockpitService {
    /**
     * 产量
     *
     * @param DS      数据源
     * @param process 工序
     */
    Map<String, Double> totalYield(String DS, String process);

    /**
     * 各个机台产量
     *
     * @param DS      数据源
     * @param process 工序
     */
    EchartsSingleData eachMachine(String DS, String process);

    /**
     * 设备数据
     *
     * @param DS      数据源
     * @param process 工序
     */
    Map<String, Double> totalEquipmentData(String DS, String process);

    /**
     * 设备维修用时
     *
     * @param DS 数据源
     */
    EchartsData equipmentMaintenanceTime(String DS, String process);

    /**
     * 待料时间
     *
     * @param DS 数据源
     */
    EchartsData equipmentWaitingTime(String DS, String process);

    /**
     * 在线总计
     *
     * @param DS      数据源
     * @param process 工序
     */
    Map<String, Double> totalOnline(String DS, String process);

    /**
     * 在线
     *
     * @param DS      数据源
     * @param process 工序
     */
    EchartsSingleData online(String DS, String process);

    /**
     * 交料数据
     *
     * @param DS      数据源
     * @param process 工序
     */
    Map<String, Double> totalPayLength(String DS, String process);

    /**
     * 交料数据
     *
     * @param DS      数据源
     * @param process 工序
     */
    EchartsSingleData payLengthByReason(String DS, String process);
}
