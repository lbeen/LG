package com.report.kanban.service;

import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.ScrollData;

import java.util.Map;

public interface MachineKanbanService {
    /**
     * 毛棒在线统计
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    EchartsData maoOnlineStatistics(String DS, String workshop);

    /**
     * 毛棒在线列表
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    ScrollData maoOnlineList(String DS, String workshop, int hours);

    /**
     * 切断数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    Map<String, Object> cutOffData(String DS, String workshop);

    /**
     * 切方数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    Map<String, Object> buttData(String DS, String workshop);

    /**
     * 抛光数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    Map<String, Object> polishingData(String DS, String workshop);

    /**
     * 成品数据
     *
     * @param DS       数据源
     * @param workshop 车间
     */
    Map<String, Object> finishData(String DS, String workshop);

}