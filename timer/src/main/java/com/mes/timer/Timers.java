package com.mes.timer;

import com.mes.timer.constants.Factory;
import com.mes.timer.constants.SysConstants;
import com.mes.timer.emstop.EmStopPointTimer;
import com.mes.timer.message.service.PushMessageService;
import com.mes.timer.point.OverPointTimer;
import com.mes.timer.task.TaskCallable;
import com.mes.timer.utils.SysUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Timers {
    private final PushMessageService pushMessageService;
    private final OverPointTimer overPointTimer;
    private final EmStopPointTimer emStopPointTimer;

    /**
     * 推送KK消息保山
     */
    @Bean
    public TaskCallable messageSenderBS() {
        return () -> pushMessageService.sendMessage(SysUtils.DS_BS_MES, Factory.BS);
    }

    /**
     * 推送KK消腾冲
     */
    @Bean
    public TaskCallable messageSenderTC() {
        return () -> pushMessageService.sendMessage(SysUtils.DS_TC_MES, Factory.TC);
    }

    /**
     * 处理切方数据腾冲
     */
    @Bean
    public TaskCallable handleButtDataTC() {
        return () -> overPointTimer.handleButtData(Factory.TC, SysConstants.MACHINE_SHOP_1);
    }

    /**
     * 处理抛光数据腾冲
     */
    @Bean
    public TaskCallable handlePolishingDataTC() {
        return () -> overPointTimer.handlePolishingData(Factory.TC, SysConstants.MACHINE_SHOP_1);
    }

    /**
     * 处理切方数据保山一车间
     */
    @Bean
    public TaskCallable handleButtDataBS1() {
        return () -> overPointTimer.handleButtData(Factory.BS, SysConstants.MACHINE_SHOP_1);
    }

    /**
     * 处理抛光数据保山一车间
     */
    @Bean
    public TaskCallable handlePolishingDataBS1() {
        return () -> overPointTimer.handlePolishingData(Factory.BS, SysConstants.MACHINE_SHOP_1);
    }

    /**
     * 处理切方数据保山二车间
     */
    @Bean
    public TaskCallable handleButtDataBS2() {
        return () -> overPointTimer.handleButtData(Factory.BS, SysConstants.MACHINE_SHOP_2);
    }

    /**
     * 处理抛光数据保山二车间
     */
    @Bean
    public TaskCallable handlePolishingDataBS2() {
        return () -> overPointTimer.handlePolishingData(Factory.BS, SysConstants.MACHINE_SHOP_2);
    }

    /**
     * 处理切方数据保山三车间
     */
    @Bean
    public TaskCallable handleButtDataBS3() {
        return () -> overPointTimer.handleButtData(Factory.BS, SysConstants.MACHINE_SHOP_3);
    }

    /**
     * 处理抛光数据保山三车间
     */
    @Bean
    public TaskCallable handlePolishingDataBS3() {
        return () -> overPointTimer.handlePolishingData(Factory.BS, SysConstants.MACHINE_SHOP_3);
    }

    /**
     * 处理切断设备待料信息腾冲
     */
    @Bean
    public TaskCallable handleEmStopCutDateTC() {
        return () -> emStopPointTimer.handleEmStopData(Factory.TC, SysConstants.MACHINE_AREA_1);
    }

    /**
     * 处理切方设备待料信息腾冲
     */
    @Bean
    public TaskCallable handleEmStopButtDateTC() {
        return () -> emStopPointTimer.handleEmStopData(Factory.TC, SysConstants.MACHINE_AREA_2);
    }

    /**
     * 处理抛光设备待料信息腾冲
     */
    @Bean
    public TaskCallable handleEmStopPolishingDateTC() {
        return () -> emStopPointTimer.handleEmStopData(Factory.TC, SysConstants.MACHINE_AREA_3);
    }
}
