package com.report.kanban.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MaterialKanbanMapper {

    /**
     * 料筒占用列表
     */
    List<Record> barrelRecyclingList(Map<String, Object> param);
    /**
     * 电阻和寿命
     */
    List<Record> resistanceAndLifetime(Map<String, Object> param);
    /**
     * 多晶汇总
     */
    List<Record> PolycrystallineData(Map<String, Object> param);

    /**
     * 多晶明细
     */
    List<Record> PolycrystallineDetailedData(Map<String, Object> param);

    /**
     * 复拉料汇总
     */
    List<Record> RedrawnMaterialData(Map<String, Object> param);

    /**
     * 复拉料明细
     */
    List<Record> RedrawnMaterialDetailedData(Map<String, Object> param);


}
