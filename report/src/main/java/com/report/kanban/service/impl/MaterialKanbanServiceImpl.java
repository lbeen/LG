package com.report.kanban.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.google.common.collect.Maps;
import com.report.kanban.mapper.MaterialKanbanMapper;
import com.report.kanban.service.MaterialKanbanService;
import com.report.utils.DataUtils;
import com.report.utils.pojo.ScrollData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class MaterialKanbanServiceImpl implements MaterialKanbanService {
    private final MaterialKanbanMapper materialKanbanMapper;

    @DS("#DS")
    @Override
    public ScrollData barrelRecyclingList(String DS, int area) {
        Map<String, Object> param = Maps.newHashMap();
        if (area == 1) {
            param.put("area1", "A");
            param.put("area2", "B");
        } else if (area == 2) {
            param.put("area1", "C");
            param.put("area2", "D");
        } else if (area == 3) {
            param.put("area1", "E");
            param.put("area2", "F");
        } else {
            param.put("area1", "G");
            param.put("area2", "H");
        }
        String[] columns = {"FURNACE_NUMBER_S", "FEEDER_CODE_S", "FEEDING_TIME_T"};
        return DataUtils.getScrollData(() -> materialKanbanMapper.barrelRecyclingList(param), columns);
    }

    @DS("#DS")
    @Override
    public ScrollData resistanceAndLifetime(String DS, String area) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("area", area);
        String[] columns = {"CRYSTAL_NUMBER", "SPEC", "ABIANJUN", "AMAX", "BPINGJUN", "BMIN", "TASHOUMING",
                "WBSHOUMING"};
        return DataUtils.getScrollData(() -> materialKanbanMapper.resistanceAndLifetime(param), columns);
    }

    /**
     * 多晶汇总
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public ScrollData PolycrystallineData(String DS, String workshop) {
        String[] columns;
        columns = new String[]{"types", "INVEN"};
        return DataUtils.getScrollData(() -> materialKanbanMapper.PolycrystallineData(null), columns);
    }

    /**
     * 多晶明细
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public ScrollData PolycrystallineDetailedData(String DS, String workshop) {
        String[] columns;
        columns = new String[]{"CLEAN_BATCH_NO_S", "QUANTITY_INVEN_F", "END_TIME_T", "DAYS"};
        return DataUtils.getScrollData(() -> materialKanbanMapper.PolycrystallineDetailedData(null), columns);
    }

    /**
     * 复拉料汇总
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public ScrollData RedrawnMaterialData(String DS, String workshop) {
        String[] columns;
        columns = new String[]{"NAME", "INVEN"};
        return DataUtils.getScrollData(() -> materialKanbanMapper.RedrawnMaterialData(null), columns);
    }

    /**
     * 复拉料明细
     *
     * @param DS 数据源
     */
    @DS("#DS")
    @Override
    public ScrollData RedrawnMaterialDetailedData(String DS, String workshop) {
        String[] columns;
        columns = new String[]{"CLEAN_BATCH_NO_S", "SPEC_S", "QUANTITY_INVEN_F", "column_2_s", "CREATE_TIME_T", "DAYS"};
        return DataUtils.getScrollData(() -> materialKanbanMapper.RedrawnMaterialDetailedData(null), columns);
    }

}
