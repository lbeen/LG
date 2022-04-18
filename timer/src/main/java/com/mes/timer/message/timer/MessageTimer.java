package com.mes.timer.message.timer;

import com.alibaba.fastjson.JSONObject;
import com.mes.timer.message.kk.KKUtils;
import com.mes.timer.message.kk.ws.ISysNotifyTodoWebServiceServiceStub;
import com.mes.timer.message.service.MessageService;
import com.mes.timer.sys.Factory;
import com.mes.timer.utils.CommonUtils;
import com.mes.timer.utils.Record;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class MessageTimer {
    private final static Logger logger = LoggerFactory.getLogger(MessageTimer.class);
    private final MessageService bsMessageService;
    private final MessageService tcMessageService;

    public MessageTimer(MessageService bsMessageService, MessageService tcMessageService) {
        this.bsMessageService = bsMessageService;
        this.tcMessageService = tcMessageService;
    }

    /**
     * 消息状态:代办
     */
    private static final Long STATUS_TODO = 0L;
    /**
     * 消息状态:已办
     */
    private static final Long STATUS_DONE = 1L;
    /**
     * 消息状态:删除
     */
    private static final Long STATUS_DELETE = 2L;
    /**
     * 推送状态：已推送
     */
    private static final Long PUSH_PUSHED = 1L;
    /**
     * 推送状态：推送失败
     */
    private static final Long PUSH_FAIL = 2L;

    /**
     * 推送KK消息保山
     */
//    @Scheduled(fixedDelay = 10000)
    public void sendMessageBS() {
        sendMessage(bsMessageService, Factory.BS);
    }

    /**
     * 推送KK消息腾冲
     */
//    @Scheduled(fixedDelay = 10000)
    public void sendMessageTC() {
        sendMessage(tcMessageService, Factory.TC);
    }

    /**
     * 推送KK消息
     */
    public void sendMessage(MessageService messageService, Factory factory) {
        List<Record> messages = messageService.getPushingMessages();
        if (CollectionUtils.isEmpty(messages)) {
            return;
        }

        int successCount = 0, failCount = 0;
        for (Record message : messages) {
            long key = message.getLong("atr_key");
            try {
                long status = message.getLong("status_i");

                boolean success;
                if (status == STATUS_TODO) {
                    success = pushTodo(messageService, message, factory);
                } else if (status == STATUS_DONE) {
                    success = KKUtils.todoDone(Long.toString(key), factory);
                } else if (status == STATUS_DELETE) {
                    success = KKUtils.deleteTodo(Long.toString(key), factory);
                } else {
                    success = false;
                }

                if (success) {
                    messageService.updateMessagePush(key, PUSH_PUSHED);
                    messageService.updateMessagePush(key, PUSH_PUSHED);
                    successCount++;
                } else {
                    messageService.updateMessagePush(key, PUSH_FAIL);
                    messageService.updateMessagePush(key, PUSH_FAIL);
                    failCount++;
                }
            } catch (Exception e) {
                logger.error(key + "：消息推送失败", e);
            }
        }
        logger.info("定时推送KK消息：成功【" + successCount + "】，失败【" + failCount + "】");
    }

    /**
     * 推送待办
     */
    private boolean pushTodo(MessageService messageService, Record message, Factory factory) {
        long key = message.getLong("atr_key");
        List<Record> receivers = messageService.getReceivers(key);

        if (CollectionUtils.isEmpty(receivers)) {
            logger.error(key + "：消息没有接收人");
            return false;
        }

        List<Map<String, String>> targets = receivers.stream().map(
                r -> Collections.singletonMap("PersonNo", r.getString("receiver_s"))).collect(Collectors.toList());

        ISysNotifyTodoWebServiceServiceStub.NotifyTodoSendContext context = new ISysNotifyTodoWebServiceServiceStub.NotifyTodoSendContext();
        context.setModelId(Long.toString(key));
        context.setSubject(CommonUtils.toString(message.get("SUBJECT_S")));
        context.setTargets(JSONObject.toJSONString(targets));
        context.setType(((BigDecimal) message.get("TYPE_I")).intValue());
        context.setLevel(((BigDecimal) message.get("LEVEL_I")).intValue());
        context.setCreateTime(CommonUtils.toString(message.get("CREATION_TIME")));
        return KKUtils.sendTodo(context, factory);
    }
}
