package com.report.kanban.web;

import com.report.kanban.service.MaterialKanbanService;
import com.report.utils.SysUtils;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kanban/material")
@RequiredArgsConstructor
public class MaterialKanbanController {
    private final MaterialKanbanService materialKanbanService;

    /**
     * 料筒占用统计
     *
     * @param factory 工厂
     * @param area    片区
     */
    @GetMapping("/barrelRecyclingList")
    public Result barrelRecyclingList(String factory, int area) {
        return Result.success(materialKanbanService.barrelRecyclingList(SysUtils.getDGDataSource(factory), area));
    }

    /**
     *
     * @param factory 数据源
     * @param area 车间
     * @return
     */
    @GetMapping("/resistanceAndLifetime")
    public Result resistanceAndLifetime(String factory, String area) {
        return Result.success(materialKanbanService.resistanceAndLifetime(SysUtils.getDGDataSource(factory), area));
    }

    /**
     * 多晶汇总
     */
    @GetMapping("/PolycrystallineData")
    public Result PolycrystallineData(String factory) {
        return Result.success(materialKanbanService.PolycrystallineData(SysUtils.getDGDataSource(factory), null));
    }

    /**
     * 多晶明细
     */
    @GetMapping("/PolycrystallineDetailedData")
    public Result PolycrystallineDetailedData(String factory) {
        return Result.success(materialKanbanService.PolycrystallineDetailedData(SysUtils.getDGDataSource(factory), null));
    }

    /**
     * 复拉料汇总
     */
    @GetMapping("/RedrawnMaterialData")
    public Result RedrawnMaterialData(String factory) {
        return Result.success(materialKanbanService.RedrawnMaterialData(SysUtils.getDGDataSource(factory), null));
    }

    /**
     * 复拉料明细
     */
    @GetMapping("/RedrawnMaterialDetailedData")
    public Result RedrawnMaterialDetailedData(String factory) {
        return Result.success(materialKanbanService.RedrawnMaterialDetailedData(SysUtils.getDGDataSource(factory), null));
    }

}
