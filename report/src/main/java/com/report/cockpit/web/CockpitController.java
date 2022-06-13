package com.report.cockpit.web;

import com.report.cockpit.service.CockpitService;
import com.report.utils.web.EchartsData;
import com.report.utils.web.EchartsPieData;
import com.report.utils.web.EchartsSingleData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("cockpit")
@RequiredArgsConstructor
public class CockpitController {
    private final CockpitService cockpitService;

    /**
     * 寿命大于150占比
     */
    @GetMapping("/lifetimeGt150")
    public EchartsSingleData lifetimeGt150() {
        return cockpitService.lifetimeGt150();
    }

    /**
     * 断线
     */
    @GetMapping("/breakLine")
    public EchartsData breakLine() {
        return cockpitService.breakLine();
    }

    /**
     * 获取投料量和方棒产量
     */
    @GetMapping("/feedingAndFinish")
    public Map<String, Double> feedingAndFinish() {
        return cockpitService.feedingAndFinish();
    }

    /**
     * 获取方棒单产
     */
    @GetMapping("/squareSingleYield")
    public EchartsData squareSingleYield() {
        return cockpitService.squareSingleYield();
    }

    /**
     * 获取方棒单产
     */
    @GetMapping("/singleYield")
    public EchartsData singleYield() {
        return cockpitService.singleYield();
    }

    /**
     * 获取方棒单产
     */
    @GetMapping("/machineYield")
    public EchartsData machineYield() {
        return cockpitService.machineYield();
    }

    /**
     * 机加物料周转天数
     */
    @GetMapping("/turnoverDays")
    public EchartsData turnoverDays() {
        return cockpitService.turnoverDays();
    }

    /**
     * 寿命大于150占比
     */
    @GetMapping("/machineOnline48")
    public EchartsData machineOnline48() {
        return cockpitService.machineOnline48();
    }

    /**
     * 单晶8小时在线
     */
    @GetMapping("/singleOnline8")
    public EchartsPieData singleOnline8() {
        return cockpitService.singleOnline8();
    }
}
