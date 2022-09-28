package com.mes.timer.message.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mes.timer.message.entity.PushMessage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PushMessageMapper extends BaseMapper<PushMessage> {
    /**
     * 获取未推送消息
     */
    List<PushMessage> getPushingMessages(int limit);

    /**
     * 获取消息推送人
     *
     * @param key 消息主键
     */
    List<String> getReceivers(long key);
}
