package com.mes.timer.point.web;

import com.mes.timer.constants.Factory;
import com.mes.timer.constants.SysConstants;
import com.mes.timer.point.entity.AutomaticButtOFF;
import com.mes.timer.point.entity.AutomaticButtON;
import com.mes.timer.point.entity.AutomaticPolishingOFF;
import com.mes.timer.point.entity.AutomaticPolishingON;
import com.mes.timer.point.entity.MesButt;
import com.mes.timer.point.service.AutomaticPointService;
import com.mes.timer.point.service.MESPointService;
import com.mes.timer.utils.Result;
import com.mes.timer.utils.SysUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("point")
@RequiredArgsConstructor
public class OverPointController {
    private final AutomaticPointService automaticPointService;
    private final MESPointService mesPointService;

    @GetMapping("test")
    public Result test() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endTime = now.withHour(8).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime startTime = endTime.minusDays(1);

        Factory factory = Factory.BS;
        String workshop = SysConstants.MACHINE_SHOP_3;

        String machineDS = SysUtils.getMachineDataSource(factory, workshop);
        //切方上线
        List<AutomaticButtON> buttONList = automaticPointService.getAutomaticButtONList(machineDS, startTime, endTime);
        System.out.println(buttONList.size() + "\t" + buttONList.get(3).getCrystalNumber());
        //切方下线
        List<AutomaticButtOFF> buttOFFList = automaticPointService.getAutomaticButtOFFList(machineDS, startTime,
                endTime);
        System.out.println(buttOFFList.size() + "\t" + buttOFFList.get(3).getCrystalNumber());
        //抛光上线
        List<AutomaticPolishingON> polishingONList = automaticPointService.getAutomaticPolishingONList(machineDS,
                startTime, endTime);
        System.out.println(polishingONList.size() + "\t" + polishingONList.get(3).getCrystalNumber());
        //抛光下线
        List<AutomaticPolishingOFF> polishingOFFList = automaticPointService.getAutomaticPolishingOFFList(machineDS,
                startTime, endTime);
        System.out.println(polishingOFFList.size() + "\t" + polishingOFFList.get(3).getCrystalNumber());

        return Result.success();
    }

    @GetMapping("compare")
    public Result compare() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime endTime = now.withHour(8).withMinute(0).withSecond(0).withNano(0);
        LocalDateTime startTime = endTime.minusDays(1).withHour(23);

        Factory factory = Factory.BS;
        String workshop = SysConstants.MACHINE_SHOP_3;

        Map<String, LocalDateTime> machineMap = machineMap(factory, workshop, startTime, endTime);
        Map<String, LocalDateTime> mesMap = mesMap(factory, workshop, startTime, endTime);

        System.out.println(machineMap.size() + "  " + mesMap.size());
        System.out.println("自动化有MES没有");
        machineMap.forEach((c, t) -> {
            LocalDateTime mesTime = mesMap.get(c);
            if (mesTime == null || !mesTime.equals(t)) {
                System.out.println(c + "  " + t);
            }
        });
        System.out.println("MES有自动化没有");
        mesMap.forEach((c, t) -> {
            LocalDateTime machineTime = machineMap.get(c);
            if (machineTime == null || !machineTime.equals(t)) {
                System.out.println(c + "  " + t);
            }
        });

        return Result.success();
    }

    private Map<String, LocalDateTime> machineMap(Factory factory, String workshop, LocalDateTime startTime,
                                                  LocalDateTime endTime) {
        String machineDS = SysUtils.getMachineDataSource(factory, workshop);
        //        return automaticPointService.getAutomaticButtONList(machineDS, startTime, endTime).stream().collect(
        //                Collectors.toMap(AutomaticButtON::getCrystalNumber, AutomaticButtON::getActionTime,
        //                        (c1, c2) -> c1.compareTo(c2) < 0 ? c1 : c2));
        return automaticPointService.getAutomaticButtOFFList(machineDS, startTime, endTime).stream().collect(
                Collectors.toMap(AutomaticButtOFF::getCrystalNumber, AutomaticButtOFF::getActionTime));
        //        return automaticPointService.getAutomaticPolishingONList(machineDS, startTime, endTime).stream().collect(
        //                Collectors.toMap(AutomaticPolishingON::getCrystalNumber, AutomaticPolishingON::getActionTime,
        //                                                (c1, c2) -> c1.compareTo(c2) < 0 ? c1 : c2));
        //        return automaticPointService.getAutomaticPolishingOFFList(machineDS, startTime, endTime).stream().collect(
        //                Collectors.toMap(AutomaticPolishingOFF::getCrystalNumber, AutomaticPolishingOFF::getActionTime,
        //                        (c1, c2) -> c1.compareTo(c2) < 0 ? c1 : c2));
    }

    private Map<String, LocalDateTime> mesMap(Factory factory, String workshop, LocalDateTime startTime,
                                              LocalDateTime endTime) {
        String mesDS = SysUtils.getMESDataSource(factory);
        //        return mesPointService.getMesButtList(mesDS, startTime, endTime, workshop, "ON").stream().collect(
        //                Collectors.toMap(MesButt::getCrystalNumber, MesButt::getActionTime));
        return mesPointService.getMesButtList(mesDS, startTime, endTime, workshop, "OFF").stream().collect(
                Collectors.toMap(MesButt::getCrystalNumber, MesButt::getActionTime));
        //        return mesPointService.getMesPolishingList(mesDS, startTime, endTime, workshop, "ON").stream().collect(
        //                Collectors.toMap(MesPolishing::getCrystalNumber, MesPolishing::getActionTime));
        //        return mesPointService.getMesPolishingList(mesDS, startTime, endTime, workshop, "OFF").stream().collect(
        //                Collectors.toMap(MesPolishing::getCrystalNumber, MesPolishing::getActionTime,
        //                        (c1, c2) -> c1.compareTo(c2) < 0 ? c1 : c2));
    }
}
