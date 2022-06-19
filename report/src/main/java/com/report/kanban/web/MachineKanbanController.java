package com.report.kanban.web;

import com.report.kanban.service.MachineKanbanService;
import com.report.sys.Factory;
import com.report.sys.SysConstants;
import com.report.utils.SysUtils;
import com.report.utils.pojo.EchartsData;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("kanban/machine")
@RequiredArgsConstructor
public class MachineKanbanController {
    private final MachineKanbanService machineKanbanService;

    /**
     * 毛棒统计
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("blankBarCount")
    public Map<String, Object> blankBarCount(String factory, String shop) {
        return machineKanbanService.blankBarCount(SysUtils.getDGDataSource(factory), shop);
    }
    /**
     * 切断产量
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("cutoffYield")
    public EchartsData cutoffYield(String factory, String shop) {
        return machineKanbanService.cutoffYield(SysUtils.getMachineDataSource(factory, shop));
    }
    /**
     * 切方产量
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("buttYield")
    public EchartsData buttYield(String factory, String shop) {
        return machineKanbanService.buttYield(SysUtils.getMachineDataSource(factory, shop));
    }
    /**
     * 抛光产量
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("polishingYield")
    public EchartsData polishingYield(String factory, String shop) {
        return machineKanbanService.polishingYield(SysUtils.getMachineDataSource(factory, shop));
    }
    /**
     * 成品产量
     *
     * @param factory 工厂
     * @param shop    车间
     */
    @RequestMapping("finishYield")
    public EchartsData finishYield(String factory, String shop) {
        return machineKanbanService.finishYield(SysUtils.getDGDataSource(factory), shop);
    }
}
