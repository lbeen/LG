package com.mes.timer.message.web;

import com.mes.timer.message.service.MessageService;
import com.mes.timer.sys.Factory;
import com.mes.timer.utils.Record;
import com.mes.timer.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {
    private final MessageService bsMessageService;
    private final MessageService tcMessageService;

    public MessageController(MessageService bsMessageService, MessageService tcMessageService) {
        this.bsMessageService = bsMessageService;
        this.tcMessageService = tcMessageService;
    }

    /**
     * 根据工单号获取维修工单信息
     *
     * @param key 消息主键
     */
    @RequestMapping("info")
    public Result info(String factory, String key) {
        Factory factoryEnum = Factory.getFactory(factory);
        Record info = factoryEnum == Factory.TC ? tcMessageService.getMessageInfo(
                key) : bsMessageService.getMessageInfo(key);
        info.put("factory", factoryEnum.factoryName);
        return Result.success(info);
    }
}
