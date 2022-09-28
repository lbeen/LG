package com.mes.timer.message.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mes.timer.constants.Factory;
import com.mes.timer.message.entity.PushMessage;

import java.util.Map;

public interface PushMessageService extends IService<PushMessage> {
    /**
     * 根据消息key获取消息
     *
     * @param DS  数据源
     * @param key 消息主键
     */
    Map<String, String> getMessageInfo(String DS, String key);

    /**
     * 推送KK消息
     *
     * @param DS      数据源
     * @param factory 工厂
     * @return  是否还剩余数据
     */
    boolean sendMessage(String DS, Factory factory);
    /**
     * 更新消息发送状态
     *
     * @param key  消息主键
     * @param push 推送状态
     */
     void updateMessagePush(long key, Integer push);
}
