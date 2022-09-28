package com.mes.timer.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("T_MES_SYS_LOG")
public class SysLog {
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;
    @TableField("OPERATION_USER")
    private String user;
    @TableField("SOURCE_CLASS")
    private String clazz;
    @TableField("SOURCE_METHOD")
    private String method;
    @TableField("LOG_LEVEL")
    private Integer level;
    @TableField("LOG_CONTENT")
    private String content;
}
