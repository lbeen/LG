package com.report.cockpit.web;

import com.report.cockpit.service.CockpitService;
import com.report.utils.SysUtils;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cockpit")
@RequiredArgsConstructor
public class CockpitController {
    private final CockpitService cockpitService;

    /**
     * 寿命大于150占比
     *
     * @param factory 工厂
     */
    @GetMapping("/lifetimeGt150")
    public Result lifetimeGt150(String factory) {
        return Result.success(cockpitService.lifetimeGt150(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 断线
     *
     * @param factory 工厂
     */
    @GetMapping("/breakLine")
    public Result breakLine(String factory) {
        return Result.success(cockpitService.breakLine(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 获取投料量和方棒产量
     *
     * @param factory 工厂
     */
    @GetMapping("/feedingAndFinish")
    public Result feedingAndFinish(String factory) {
        return Result.success(cockpitService.feedingAndFinish(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 获取方棒单产
     *
     * @param factory 工厂
     */
    @GetMapping("/squareSingleYield")
    public Result squareSingleYield(String factory) {
        return Result.success(cockpitService.squareSingleYield(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 获取方棒单产
     *
     * @param factory 工厂
     */
    @GetMapping("/singleYield")
    public Result singleYield(String factory) {
        return Result.success(cockpitService.singleYield(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 获取方棒单产
     *
     * @param factory 工厂
     */
    @GetMapping("/machineYield")
    public Result machineYield(String factory) {
        return Result.success(cockpitService.machineYield(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 机加物料周转天数
     *
     * @param factory 工厂
     */
    @GetMapping("/turnoverDays")
    public Result turnoverDays(String factory) {
        return Result.success(cockpitService.turnoverDays(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 寿命大于150占比
     *
     * @param factory 工厂
     */
    @GetMapping("/machineOnline48")
    public Result machineOnline48(String factory) {
        return Result.success(cockpitService.machineOnline48(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 单晶8小时在线
     *
     * @param factory 工厂
     */
    @GetMapping("/singleOnline8")
    public Result singleOnline8(String factory) {
        return Result.success(cockpitService.singleOnline8(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 成品率
     *
     * @param factory 工厂
     */
    @GetMapping("/singleFinishedRate")
    public Result singleFinishedRate(String factory) {
        return Result.success(cockpitService.singleFinishedRate(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 交料趋势
     *
     * @param factory 工厂
     */
    @GetMapping("/payLength")
    public Result payLength(String factory) {
        return Result.success(cockpitService.payLength(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 单晶在线
     *
     * @param factory 工厂
     */
    @GetMapping("/singleOnline")
    public Result singleOnline(String factory) {
        return Result.success(cockpitService.singleOnline(SysUtils.getDGDataSource(factory)));
    }

    /**
     * 机加在线
     *
     * @param factory 工厂
     */
    @GetMapping("/machineOnline")
    public Result machineOnline(String factory) {
        return Result.success(cockpitService.machineOnline(SysUtils.getDGDataSource(factory)));
    }
}
