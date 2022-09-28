package com.report.cockpit.web;

import com.report.cockpit.service.MachineCockpitService;
import com.report.utils.SysUtils;
import com.report.utils.pojo.EchartsSingleData;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cockpit/machine")
@RequiredArgsConstructor
public class MachineCockpitController {
    private final MachineCockpitService machineCockpitService;

    /**
     * 产量
     *
     * @param factory 工厂
     * @param process 工序
     */
    @GetMapping("/totalYield")
    public Result totalYield(String factory, String process) {
        return Result.success(machineCockpitService.totalYield(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 各个机台产量
     *
     * @param factory 工厂
     * @param process 工序
     */
    @GetMapping("eachMachine")
    public Result eachMachine(String factory, String process) {
        EchartsSingleData data = machineCockpitService.eachMachine(SysUtils.getDGDataSource(factory), process);
        return Result.success(data);
    }

    /**
     * 设备数据
     *
     * @param factory 工厂
     * @param process 工序
     */
    @GetMapping("/totalEquipmentData")
    public Result totalEquipmentData(String factory, String process) {
        return Result.success(machineCockpitService.totalEquipmentData(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 设备维修用时
     *
     * @param factory 数据源
     * @param process 机加工序
     */
    @GetMapping("/equipmentMaintenanceTime")
    public Result equipmentMaintenanceTime(String factory, String process) {
        return Result.success(
                machineCockpitService.equipmentMaintenanceTime(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 待料时间
     *
     * @param factory 数据源
     * @param process 机加工序
     */
    @GetMapping("/equipmentWaitingTime")
    public Result equipmentWaitingTime(String factory, String process) {
        return Result.success(machineCockpitService.equipmentWaitingTime(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 在线总计
     *
     * @param factory 数据源
     */
    @GetMapping("/totalOnline")
    public Result totalOnline(String factory, String process) {
        return Result.success(machineCockpitService.totalOnline(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 在线
     *
     * @param factory 数据源
     */
    @GetMapping("/online")
    public Result online(String factory, String process) {
        return Result.success(machineCockpitService.online(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 交料数据
     *
     * @param factory 工厂
     * @param process 工序
     */
    @GetMapping("/totalPayLength")
    public Result totalPayLength(String factory, String process) {
        return Result.success(machineCockpitService.totalPayLength(SysUtils.getDGDataSource(factory), process));
    }

    /**
     * 交料数据
     *
     * @param factory 工厂
     * @param process 工序
     */
    @GetMapping("/payLengthByReason")
    public Result payLengthByReason(String factory, String process) {
        return Result.success(machineCockpitService.payLengthByReason(SysUtils.getDGDataSource(factory), process));
    }
}
