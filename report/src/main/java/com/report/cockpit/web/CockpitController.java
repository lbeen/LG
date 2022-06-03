package com.report.cockpit.web;

import com.report.cockpit.service.CockpitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("cockpit")
public class CockpitController {
    private final CockpitService cockpitService;

    public CockpitController(CockpitService cockpitService) {
        this.cockpitService = cockpitService;
    }

    /**
     * 获取投料量和毛棒产量
     */
    @GetMapping("/feedingAndFinish")
    public Map<String, Double> feedingAndFinish() {
        return cockpitService.feedingAndFinish();
    }

    /**
     * 获取方棒单产
     */
    @GetMapping("/squareSingleYield")
    public Map<String, Object> squareSingleYield() {
        return cockpitService.squareSingleYield();
    }

    /**
     * 机加物料周转天数
     */
    @GetMapping("/turnoverDays")
    public Map<String, Object> turnoverDays() {
        return cockpitService.turnoverDays();
    }

    /**
     * 寿命大于150占比
     */
    @GetMapping("/machineOnline48")
    public Map<String, Object> machineOnline48() {
        return cockpitService.machineOnline48();
    }


    /**
     * 断线
     */
    @GetMapping("/breakLine")
    public Map<String, Object> breakLine() {
        return cockpitService.breakLine();
    }

    /**
     * 切方产能
     */
    @GetMapping("/buttYield")
    public Map<String, Object> buttYield() {
        return cockpitService.buttYield();
    }

    /**
     * 寿命大于150占比
     */
    @GetMapping("/lifetimeGt150")
    public Map<String, Object> lifetimeGt150() {
        return cockpitService.lifetimeGt150();
    }


    /**
     * 抛光产能
     */
    @GetMapping("/polishingYield")
    public Map<String, Object> polishingYield() {
        return cockpitService.polishingYield();
    }

    /**
     * 单晶8小时在线
     */
    @GetMapping("/singleOnline8")
    public Map<String, Object> singleOnline8() {
        return cockpitService.singleOnline8();
    }
}
