package com.report.kanban.service;

import com.report.dao.Dao;
import com.report.dao.Record;

import java.util.List;
import java.util.Map;

public interface MachineKanbanService {
    /**
     * 获取毛棒接收检测数据
     *
     * @param factory 工厂
     * @param shop    车间
     */
    Map<String, Object> getBlankBarCount(String factory, String shop);

    /**
     * 获取echarts数据
     *
     * @param dao     dao
     * @param sqlId   sqlId
     * @param shop    车间
     * @param sortByX x轴排序
     */
    Map<String, Object> queryEchartsBarData(Dao dao, String sqlId, String shop, boolean sortByX);

    /**
     * 成品未入托长度分布
     *
     * @param factory 工厂
     * @param shop    车间
     */
    Map<String, Object> finishLenDistribution(String factory, String shop);

    /**
     * 成品规格分布
     *
     * @param factory 工厂
     * @param shop    车间
     */
    List<Record> finishSpecYield(String factory, String shop);
}
