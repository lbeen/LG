package com.report.kanban.service;

import com.report.utils.pojo.EchartsData;

import java.util.Map;

public interface MachineKanbanService {
    /**
     * 获取毛棒接收检测数据
     *
     * @param dataSource 数据源
     * @param shop    车间
     */
    Map<String, Object> blankBarCount(String dataSource, String shop);

    /**
     * 切断产量
     *
     * @param dataSource 数据源
     */
    EchartsData cutoffYield(String dataSource);

    /**
     * 切方产量
     *
     * @param dataSource 数据源
     */
    EchartsData buttYield(String dataSource);

    /**
     * 抛光产量
     *
     * @param dataSource 数据源
     */
    EchartsData polishingYield(String dataSource);

    /**
     * 成品产量
     *
     * @param dataSource 数据源
     * @param shop    车间
     */
    EchartsData finishYield(String dataSource, String shop);
}
