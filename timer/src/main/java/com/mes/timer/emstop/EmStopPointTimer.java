package com.mes.timer.emstop;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import com.mes.timer.constants.Factory;
import com.mes.timer.emstop.entity.EmInfor;
import com.mes.timer.emstop.entity.IfEmStop;
import com.mes.timer.emstop.service.EmstopService;
import com.mes.timer.utils.SysUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Date;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class EmStopPointTimer
{
    private  final EmstopService emstopService;

    public  boolean handleEmStopData(Factory factory, String workarea)
    {
        String machineDS = SysUtils.getMESDataSource(factory);

        List<EmInfor> offList = Collections.emptyList();
        List<EmInfor> onList = Collections.emptyList();
        if (workarea.equals("1"))
        {
            offList= emstopService.getCutOffList(machineDS);
            onList= emstopService.getCutOnList(machineDS);
        }
        if (workarea.equals("2"))
        {
            offList= emstopService.getButtOffList(machineDS);
            onList= emstopService.getButtOnList(machineDS);
        }
        if (workarea.equals("3"))
        {
            offList= emstopService.getPolishingOffList(machineDS);
            onList= emstopService.getPolishingOnList(machineDS);
        }

        for (EmInfor cutoff:offList )
        {
            for (EmInfor cuton: onList)
            {
                if (cutoff.getEquipment().equals(cuton.getEquipment()))
                {
                    Date offtime=cutoff.getActionTime();
                    Date ontime=cuton.getActionTime();
                    Date nowtime = DateUtil.date();
                    if (ontime.getTime() > offtime.getTime())
                    {
                        continue;
                    }
                    else{
                            long betweenmin=DateUtil.between(offtime,nowtime, DateUnit.MINUTE);
                            IfEmStop ifEmStop=new IfEmStop();
                            ifEmStop.setEmCode(cutoff.getEquipment());
                            ifEmStop.setEmArea(Long.parseLong(workarea));
                            ifEmStop.setEmStopoftimeMin(betweenmin);
                            ifEmStop.setStartTimeStop(cutoff.getActionTime());
                            ifEmStop.setEndTimeStop(nowtime);
                            ifEmStop.setEndCrystalNumber(cutoff.getCrystalNumber());
                            ifEmStop.setUpdateTime(nowtime);
                            if (betweenmin >10 )
                            {
                                emstopService.SaveStopInfo(machineDS,ifEmStop);
                                log.info(ifEmStop.getEmCode() + ":设备待料信息写入成功");
                            }
                    }
                }
            }
        }

        return  true;
    }
}
