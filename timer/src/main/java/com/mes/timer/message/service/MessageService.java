package com.mes.timer.message.service;

import com.mes.timer.utils.Record;

import java.util.List;
import java.util.Map;

public interface MessageService {
    /**
     * 根据消息key获取消息
     *
     * @param key 消息主键
     */
    Record getMessageInfo(String key);

    /**
     * 获取未推送消息
     */
    List<Record> getPushingMessages();

    /**
     * 获取消息推送人
     *
     * @param key 消息主键
     */
    List<Record> getReceivers(long key);

    /**
     * 更新消息发送状态
     *
     * @param key  消息主键
     * @param push 推送状态
     */
    void updateMessagePush(long key, long push);
}
