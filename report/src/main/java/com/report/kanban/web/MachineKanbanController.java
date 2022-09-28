package com.report.kanban.web;

import com.report.kanban.service.MachineKanbanService;
import com.report.utils.SysUtils;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kanban/machine")
@RequiredArgsConstructor
public class MachineKanbanController {
    private final MachineKanbanService machineKanbanService;

    /**
     * 毛棒在线统计
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    @GetMapping("/maoOnlineStatistics")
    public Result maoOnlineStatistics(String factory, String workshop) {
        return Result.success(machineKanbanService.maoOnlineStatistics(SysUtils.getDGDataSource(factory), workshop));
    }

    /**
     * 毛棒在线统计
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    @GetMapping("/maoOnlineList")
    public Result maoOnlineList(String factory, String workshop, int hours) {
        return Result.success(machineKanbanService.maoOnlineList(SysUtils.getDGDataSource(factory), workshop, hours));
    }

    /**
     * 切断数据
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    @GetMapping("/cutoffData")
    public Result cutoffData(String factory, String workshop) {
        return Result.success(machineKanbanService.cutOffData(SysUtils.getDGDataSource(factory), workshop));
    }

    /**
     * 切方数据
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    @GetMapping("/buttData")
    public Result buttData(String factory, String workshop) {
        return Result.success(machineKanbanService.buttData(SysUtils.getDGDataSource(factory), workshop));
    }

    /**
     * 抛光数据
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    @GetMapping("/polishingData")
    public Result polishingData(String factory, String workshop) {
        return Result.success(machineKanbanService.polishingData(SysUtils.getDGDataSource(factory), workshop));
    }

    /**
     * 成品数据
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    @GetMapping("/finishData")
    public Result finishData(String factory, String workshop) {
        return Result.success(machineKanbanService.finishData(SysUtils.getDGDataSource(factory), workshop));
    }

}