package com.mes.timer.message.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("AT_SM_PUSH_MESSAGE")
public class PushMessage {
    @TableId(value = "ATR_KEY")
    private Long atrKey;
    @TableField("CREATION_TIME")
    private LocalDateTime creationTime;
    @TableField("CONTENT_S")
    private String content;
    @TableField("LEVEL_I")
    private Integer messageLevel;
    @TableField("PUSH_I")
    private Integer push;
    @TableField("PUSH_TIME_T")
    private LocalDateTime pushTime;
    @TableField("STATUS_I")
    private Integer status;
    @TableField("SUBJECT_S")
    private String subject;
    @TableField("TYPE_I")
    private Integer type;
}
