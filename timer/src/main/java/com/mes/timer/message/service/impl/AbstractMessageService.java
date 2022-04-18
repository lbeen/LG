package com.mes.timer.message.service.impl;

import com.mes.timer.dao.Dao;
import com.mes.timer.message.service.MessageService;
import com.mes.timer.utils.CommonUtils;
import com.mes.timer.utils.Record;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMessageService implements MessageService {
    private static final String MAPPING_ID = "PushMessage.";

    private final Dao dao;

    public AbstractMessageService(Dao dao) {
        this.dao = dao;
    }

    /**
     * 根据消息key获取消息
     *
     * @param key 消息主键
     */
    @Override
    public final Record getMessageInfo(String key) {
        if (StringUtils.isBlank(key)) {
            return createMessage(null);
        }
        Record message = dao.getRecord(MAPPING_ID + "getMessageInfo", Long.parseLong(key));
        if (message == null) {
            return createMessage(null);
        }
        return createMessage(message);
    }

    /**
     * 查询结果封装成消息
     */
    private Record createMessage(Record message) {
        Record data = new Record();
        if (message == null) {
            data.put("subject", "");
            data.put("content", "");
        } else {
            data.put("subject", CommonUtils.toString(message.get("subject_s")));
            data.put("content", CommonUtils.toString(message.get("content_s")));
        }
        return data;
    }

    /**
     * 获取未推送消息
     */
    @Override
    public List<Record> getPushingMessages() {
        return dao.getList(MAPPING_ID + "getPushingMessages");
    }

    /**
     * 获取消息推送人
     *
     * @param key 消息主键
     */
    @Override
    public List<Record> getReceivers(long key) {
        return dao.getList(MAPPING_ID + "getReceivers", key);
    }

    /**
     * 更新消息发送状态
     *
     * @param key  消息主键
     * @param push 推送状态
     */
    @Override
    public void updateMessagePush(long key, long push) {
        Map<String, Object> param = new HashMap<>();
        param.put("key", key);
        param.put("push", push);
        dao.update(MAPPING_ID + "updateMessagePush", param);
    }
}
