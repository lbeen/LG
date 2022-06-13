package com.report.kanban.web;

import com.report.conf.DaoConfiguration;
import com.report.dao.Dao;
import com.report.kanban.service.MachineKanbanService;
import com.report.sys.Factory;
import com.report.sys.SysConstants;
import com.report.utils.web.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kanban/machine")
@RequiredArgsConstructor
public class MachineKanbanController {
    private final MachineKanbanService machineKanbanService;

    /**
     * 成品产量
     *
     * @param shop 车间
     */
    @RequestMapping("getBlankBarCount")
    public Result getBlankBarCount(String factory, String shop) {
        return Result.success(machineKanbanService.getBlankBarCount(factory, shop));
    }

    /**
     * 成品产量
     *
     * @param shop 车间
     */
    @RequestMapping("cutoffYield")
    public Result cutoffYield(String factory, String shop) {
        String sqlId;
        if (Factory.getFactory(factory) == Factory.BS && SysConstants.MACHINE_SHOP_2.equalsIgnoreCase(shop)) {
            sqlId = "cutoffYieldCreateTime";
        } else {
            sqlId = "cutoffYield";
        }
        Dao dao = DaoConfiguration.getMachineDao(factory, shop);
        return Result.success(machineKanbanService.queryEchartsBarData(dao, sqlId, shop, true));
    }

    /**
     * 成品产量
     *
     * @param shop 车间
     */
    @RequestMapping("buttYield")
    public Result buttYield(String factory, String shop) {
        Dao dao = DaoConfiguration.getMachineDao(factory, shop);
        return Result.success(machineKanbanService.queryEchartsBarData(dao, "buttYield", shop, true));
    }

    /**
     * 成品产量
     *
     * @param shop 车间
     */
    @RequestMapping("polishingYield")
    public Result polishingYield(String factory, String shop) {
        String sqlId;
        if (Factory.getFactory(factory) == Factory.BS && SysConstants.MACHINE_SHOP_3.equalsIgnoreCase(shop)) {
            sqlId = "polishingYield";
        } else {
            sqlId = "polishingYieldCreateTime";
        }
        Dao dao = DaoConfiguration.getMachineDao(factory, shop);
        return Result.success(machineKanbanService.queryEchartsBarData(dao, sqlId, shop, true));
    }

    /**
     * 成品产量
     *
     * @param shop 车间
     */
    @RequestMapping("finishYield")
    public Result finishYield(String factory, String shop) {
        Dao dao = DaoConfiguration.getDGDao(factory);
        return Result.success(machineKanbanService.queryEchartsBarData(dao, "finishYield", shop, false));
    }

    /**
     * 机加成品方棒长度数据
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("finishLenDistribution")
    public Result finishLenDistributionString(String factory, String shop) {
        return Result.success(machineKanbanService.finishLenDistribution(factory, shop));
    }

    /**
     * 成品规格分布
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("finishSpecYield")
    public Result finishSpecYield(String factory, String shop) {
        return Result.success(machineKanbanService.finishSpecYield(factory, shop));
    }
}
