package com.mes.timer.point.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.mes.timer.point.entity.AutomaticButtOFF;
import com.mes.timer.point.entity.AutomaticButtON;
import com.mes.timer.point.entity.AutomaticPolishingOFF;
import com.mes.timer.point.entity.AutomaticPolishingON;
import com.mes.timer.point.mapper.AutomaticButtOFFMapper;
import com.mes.timer.point.mapper.AutomaticButtONMapper;
import com.mes.timer.point.mapper.AutomaticPolishingOFFMapper;
import com.mes.timer.point.mapper.AutomaticPolishingONMapper;
import com.mes.timer.point.service.AutomaticPointService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AutomaticPointServiceImpl implements AutomaticPointService {
    private final AutomaticButtONMapper automaticButtONMapper;
    private final AutomaticButtOFFMapper automaticButtOFFMapper;
    private final AutomaticPolishingONMapper automaticPolishingONMapper;
    private final AutomaticPolishingOFFMapper automaticPolishingOFFMapper;

    /**
     * 获取自动化切方上线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    @DS("#DS")
    @Override
    public List<AutomaticButtON> getAutomaticButtONList(String DS, LocalDateTime startTime, LocalDateTime endTime) {
        LambdaQueryWrapper<AutomaticButtON> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(AutomaticButtON::getActionTime, startTime);
        queryWrapper.lt(AutomaticButtON::getActionTime, endTime);
        return automaticButtONMapper.selectList(queryWrapper);
    }

    /**
     * 获取自动化切方下线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    @DS("#DS")
    @Override
    public List<AutomaticButtOFF> getAutomaticButtOFFList(String DS, LocalDateTime startTime, LocalDateTime endTime) {
        LambdaQueryWrapper<AutomaticButtOFF> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(AutomaticButtOFF::getActionTime, startTime);
        queryWrapper.lt(AutomaticButtOFF::getActionTime, endTime);
        return automaticButtOFFMapper.selectList(queryWrapper);
    }

    /**
     * 获取自动化抛光上线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    @DS("#DS")
    @Override
    public List<AutomaticPolishingON> getAutomaticPolishingONList(String DS, LocalDateTime startTime,
                                                                  LocalDateTime endTime) {
        LambdaQueryWrapper<AutomaticPolishingON> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(AutomaticPolishingON::getActionTime, startTime);
        queryWrapper.lt(AutomaticPolishingON::getActionTime, endTime);
        return automaticPolishingONMapper.selectList(queryWrapper);
    }

    /**
     * 获取自动化抛光下线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    @DS("#DS")
    @Override
    public List<AutomaticPolishingOFF> getAutomaticPolishingOFFList(String DS, LocalDateTime startTime,
                                                                    LocalDateTime endTime) {
        LambdaQueryWrapper<AutomaticPolishingOFF> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.ge(AutomaticPolishingOFF::getActionTime, startTime);
        queryWrapper.lt(AutomaticPolishingOFF::getActionTime, endTime);
        return automaticPolishingOFFMapper.selectList(queryWrapper);
    }
}
