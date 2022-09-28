package com.mes.timer.emstop.service;

import com.mes.timer.emstop.entity.EmInfor;
import com.mes.timer.emstop.entity.IfEmStop;

import java.util.List;

public interface EmstopService
{
//    获取切断下线信息
    public List<EmInfor> getCutOffList(String DS);
    //获取切断上线信息
    public List<EmInfor> getCutOnList(String DS);

    public List<EmInfor> getButtOnList(String DS);
    public List<EmInfor> getButtOffList(String DS);
    public List<EmInfor> getPolishingOnList(String DS);
    public List<EmInfor> getPolishingOffList(String DS);

    public int SaveStopInfo(String DS, IfEmStop ifEmStop );
}
