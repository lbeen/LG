package com.mes.timer.point;

import com.mes.timer.constants.Factory;
import com.mes.timer.point.service.AutomaticPointService;
import com.mes.timer.point.service.MESPointService;
import com.mes.timer.utils.SysUtils;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 过点数据定时任务
 */
@Component
@RequiredArgsConstructor
public class OverPointTimer {
    private final AutomaticPointService automaticPointService;
    private final MESPointService mesPointService;

    /**
     * 处理切方数据
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    public boolean handleButtData(Factory factory, String workshop) {
        handleData(factory, workshop, automaticPointService::getAutomaticButtONList, mesPointService::handleButtONData,
                automaticPointService::getAutomaticButtOFFList, mesPointService::handleButtOFFData);
        return false;
    }

    /**
     * 处理抛光数据
     *
     * @param factory  工厂
     * @param workshop 车间
     */
    public boolean handlePolishingData(Factory factory, String workshop) {
        handleData(factory, workshop, automaticPointService::getAutomaticPolishingONList,
                mesPointService::handlePolishingONData, automaticPointService::getAutomaticPolishingOFFList,
                mesPointService::handlePolishingOFFData);
        return false;
    }

    /**
     * 处理数据
     *
     * @param factory    工厂
     * @param workshop   车间
     * @param onGetter   自动化上线数据获取接口
     * @param onHandler  mes上线处理数据接口
     * @param offGetter  自动化下线数据获取接口
     * @param offHandler mes下线处理数据接口
     * @param <ON>       上线自动化数据类型
     * @param <OFF>      下线自动化数据类型
     */
    private <ON, OFF> void handleData(Factory factory, String workshop, AutomaticGetter<ON> onGetter,
                                      MESHandler<ON> onHandler, AutomaticGetter<OFF> offGetter,
                                      MESHandler<OFF> offHandler) {
        String machineDS = SysUtils.getMachineDataSource(factory, workshop);
        String mesDS = SysUtils.getMESDataSource(factory);
        //当前时间前两分钟往前推10分钟数据
        LocalDateTime endTime = LocalDateTime.now().minusMinutes(2);
        LocalDateTime startTime = endTime.minusMinutes(10);
        //处理上线数据
        handleData(machineDS, onGetter, startTime, endTime, mesDS, onHandler);
        //处理下线数据
        handleData(machineDS, offGetter, startTime, endTime, mesDS, offHandler);

    }

    /**
     * 处理数据
     *
     * @param machineDS 自动化数据源
     * @param getter    自动化数据获取接口
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param mesDS     MES数据源
     * @param handler   mes处理数据接口
     * @param <T>       自动化数据类型
     */
    private <T> void handleData(String machineDS, AutomaticGetter<T> getter, LocalDateTime startTime,
                                LocalDateTime endTime, String mesDS, MESHandler<T> handler) {
        List<T> automaticList = getter.get(machineDS, startTime, endTime);
        if (CollectionUtils.isEmpty(automaticList)) {
            return;
        }
        handler.handle(mesDS, automaticList);
    }

    /**
     * 自动化获取数据接口
     *
     * @param <T> 自动化数据类型
     */
    @FunctionalInterface
    private interface AutomaticGetter<T> {
        /**
         * 获取自动化数据
         *
         * @param DS        自动化数据源
         * @param startTime 开始时间
         * @param endTime   结束时间
         */
        List<T> get(String DS, LocalDateTime startTime, LocalDateTime endTime);
    }

    /**
     * mes处理数据接口
     *
     * @param <T> 自动化数据类型
     */
    @FunctionalInterface
    private interface MESHandler<T> {
        /**
         * MES处理获取自动化数据
         *
         * @param DS            MES数据源
         * @param automaticList 自动化数据
         */
        void handle(String DS, List<T> automaticList);
    }
}
