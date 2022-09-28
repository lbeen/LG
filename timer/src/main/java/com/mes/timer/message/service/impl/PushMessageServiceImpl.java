package com.mes.timer.message.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Maps;
import com.mes.timer.constants.Factory;
import com.mes.timer.message.entity.PushMessage;
import com.mes.timer.message.kk.KKUtils;
import com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub;
import com.mes.timer.message.mapper.PushMessageMapper;
import com.mes.timer.message.service.PushMessageService;
import com.mes.timer.utils.TimeUtils;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PushMessageServiceImpl extends ServiceImpl<PushMessageMapper, PushMessage> implements PushMessageService {
    private final static Logger logger = LoggerFactory.getLogger(PushMessageServiceImpl.class);

    /**
     * 一次任务最大取数据条数
     */
    private static final int LIMIT = 20;

    /**
     * 消息状态:代办
     */
    private static final int STATUS_TODO = 0;
    /**
     * 消息状态:已办
     */
    private static final int STATUS_DONE = 1;
    /**
     * 消息状态:删除
     */
    private static final int STATUS_DELETE = 2;
    /**
     * 推送状态：已推送
     */
    private static final int PUSH_PUSHED = 1;
    /**
     * 推送状态：推送失败
     */
    private static final int PUSH_FAIL = 2;

    /**
     * 根据消息key获取消息
     *
     * @param DS  数据源
     * @param key 消息主键
     */
    @DS("#DS")
    @Override
    public Map<String, String> getMessageInfo(String DS, String key) {
        if (StringUtils.isBlank(key)) {
            return createMessage(null);
        }
        PushMessage message = getById(Long.parseLong(key));
        if (message == null) {
            return createMessage(null);
        }
        return createMessage(message);
    }

    /**
     * 查询结果封装成消息
     */
    private Map<String, String> createMessage(PushMessage message) {
        Map<String, String> data = Maps.newHashMap();
        if (message == null) {
            data.put("subject", "");
            data.put("content", "");
        } else {
            data.put("subject", message.getSubject());
            data.put("content", message.getContent());
        }
        return data;
    }

    /**
     * 推送KK消息
     */
    @DS("#DS")
    public boolean sendMessage(String DS, Factory factory) {
        List<PushMessage> messages = baseMapper.getPushingMessages(LIMIT);
        if (CollectionUtils.isEmpty(messages)) {
//            logger.info(DS + " scan messages:0");
            return false;
        }

        int successCount = 0, failCount = 0;
        for (PushMessage pushMessage : messages) {
            long key = pushMessage.getAtrKey();
            try {
                int status = pushMessage.getStatus();

                boolean success;
                if (status == STATUS_TODO) {
                    success = pushTodo(pushMessage, factory);
                } else if (status == STATUS_DONE) {
                    success = KKUtils.todoDone(Long.toString(key), factory);
                } else if (status == STATUS_DELETE) {
                    success = KKUtils.deleteTodo(Long.toString(key), factory);
                } else {
                    success = false;
                }

                if (success) {
                    updateMessagePush(key, PUSH_PUSHED);
                    successCount++;
                } else {
                    updateMessagePush(key, PUSH_FAIL);
                    failCount++;
                }
            } catch (Exception e) {
                logger.error(key + ":KK push fail", e);
            }
        }
        logger.info(DS + " push KK:success[" + successCount + "],fail[" + failCount + "]");
        return messages.size() >= LIMIT;
    }

    /**
     * 推送待办
     */
    private boolean pushTodo(PushMessage pushMessage, Factory factory) {
        List<String> receivers = baseMapper.getReceivers(pushMessage.getAtrKey());
        if (CollectionUtils.isEmpty(receivers)) {
            logger.error(pushMessage.getAtrKey() + "：no receivers");
            return false;
        }
        List<Map<String, String>> targets = receivers.stream().map(
                receiver -> Collections.singletonMap("PersonNo", receiver)).collect(Collectors.toList());

        ISysNotifyTodoWebServiceServiceStub.NotifyTodoSendContext context = new ISysNotifyTodoWebServiceServiceStub.NotifyTodoSendContext();
        context.setModelId(Long.toString(pushMessage.getAtrKey()));
        context.setSubject(pushMessage.getSubject());
        context.setTargets(JSONObject.toJSONString(targets));
        context.setType(pushMessage.getType());
        context.setLevel(pushMessage.getMessageLevel());
        context.setCreateTime(TimeUtils.formatTime(pushMessage.getCreationTime()));
        return KKUtils.sendTodo(context, factory);
    }

    /**
     * 更新消息发送状态
     *
     * @param key  消息主键
     * @param push 推送状态
     */
    public void updateMessagePush(long key, Integer push) {
        LambdaUpdateWrapper<PushMessage> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(PushMessage::getAtrKey, key);
        updateWrapper.set(PushMessage::getPush, push);
        updateWrapper.set(PushMessage::getPushTime, LocalDateTime.now());
        update(updateWrapper);
    }
}
