package com.report.manage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("T_MES_KANBAN_RESOURCE")
@Data
public class KanbanResource {
    @TableId(value = "ID", type = IdType.ASSIGN_UUID)
    private String id;
    @TableField("CREATION_TIME")
    private Date creationTime;
    @TableField("RESOURCE_TYPE")
    private String type;
    @TableField("RESOURCE_NAME")
    private String name;
    @TableField("RESOURCE_LOCATION")
    private String location;
    @TableField("RESOURCE_COUNT")
    private Integer count;
    @TableField("RESOURCE_DURATION")
    private Integer duration;
    @TableField("FACTORY")
    private String factory;
}
