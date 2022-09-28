package com.mes.timer.message.web;

import com.mes.timer.constants.Factory;
import com.mes.timer.message.service.PushMessageService;
import com.mes.timer.utils.Result;
import com.mes.timer.utils.SysUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("message")
@RequiredArgsConstructor
public class MessageController {
    private final PushMessageService pushMessageService;

    /**
     * 根据工单号获取维修工单信息
     *
     * @param key 消息主键
     */
    @GetMapping("info")
    public Result info(String factory, String key) {
        Map<String, String> info = pushMessageService.getMessageInfo(SysUtils.getMESDataSource(factory), key);
        info.put("factory", Factory.getFactory(factory).factoryName);
        return Result.success(info);
    }
}
