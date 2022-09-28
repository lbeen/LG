package com.report.kanban.service;

import com.report.utils.pojo.ScrollData;

public interface MaterialKanbanService {
    /**
     * 料筒占用统计
     *
     * @param DS 数据源
     */
    ScrollData barrelRecyclingList(String DS, int area);

    /**
     * 电阻和寿命
     *
     * @param DS   数据源
     * @param area 车间
     */
    ScrollData resistanceAndLifetime(String DS, String area);
    /**
     * 多晶汇总
     *
     * @param DS 数据源
     */
    ScrollData PolycrystallineData(String DS, String workshop);

    /**
     * 多晶明细
     *
     * @param DS 数据源
     */
    ScrollData PolycrystallineDetailedData(String DS, String workshop);

    /**
     * 复拉料汇总
     *
     * @param DS 数据源
     */
    ScrollData RedrawnMaterialData(String DS, String workshop);

    /**
     * 复拉料明细
     *
     * @param DS 数据源
     */
    ScrollData RedrawnMaterialDetailedData(String DS, String workshop);

}
