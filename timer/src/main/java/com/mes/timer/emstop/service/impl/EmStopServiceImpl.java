package com.mes.timer.emstop.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.mes.timer.emstop.entity.EmInfor;
import com.mes.timer.emstop.entity.IfEmStop;
import com.mes.timer.emstop.mapper.EmStopMapper;
import com.mes.timer.emstop.service.EmstopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmStopServiceImpl implements EmstopService
{
    @Resource
    EmStopMapper emStopMapper;

    @Override
    @DS("#DS")
    public List<EmInfor> getCutOffList(String DS)
    {
        return emStopMapper.getCutOffList();
    }

    @Override
    @DS("#DS")
    public List<EmInfor> getCutOnList(String DS)
    {
        return emStopMapper.getCutOnList();
    }

    @Override
    @DS("#DS")
    public List<EmInfor> getButtOnList(String DS)
    {
        return emStopMapper.getButtOnList();
    }

    @Override
    @DS("#DS")
    public List<EmInfor> getButtOffList(String DS)
    {
        return emStopMapper.getButtOffList();
    }

    @Override
    @DS("#DS")
    public List<EmInfor> getPolishingOnList(String DS)
    {
        return emStopMapper.getPolishingOnList();
    }

    @Override
    @DS("#DS")
    public List<EmInfor> getPolishingOffList(String DS)
    {
        return emStopMapper.getPolishingOffList();
    }

    @DS("#DS")
    public int SaveStopInfo(String DS,IfEmStop ifEmStop)
    {
        LambdaQueryWrapper<IfEmStop> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(IfEmStop::getStartTimeStop, ifEmStop.getStartTimeStop());
        queryWrapper.eq(IfEmStop::getEmCode, ifEmStop.getEmCode());
        if (emStopMapper.selectCount(queryWrapper)==0)
            return emStopMapper.insert(ifEmStop);

        LambdaUpdateWrapper<IfEmStop> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(IfEmStop::getStartTimeStop, ifEmStop.getStartTimeStop());
        updateWrapper.eq(IfEmStop::getEmCode, ifEmStop.getEmCode());
        updateWrapper.set(IfEmStop::getEmStopoftimeMin, ifEmStop.getEmStopoftimeMin());
        updateWrapper.set(IfEmStop::getEndTimeStop, ifEmStop.getEndTimeStop());
        updateWrapper.set(IfEmStop::getUpdateTime, ifEmStop.getUpdateTime());

        return emStopMapper.update(null , updateWrapper);
    }
}
