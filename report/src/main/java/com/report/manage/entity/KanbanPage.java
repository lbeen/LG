package com.report.manage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("T_MES_KANBAN_PAGE")
@Data
public class KanbanPage {
    @TableId(value = "ID",type = IdType.ASSIGN_UUID)
    private String id;
    @TableField("CREATION_TIME")
    private Date creationTime;
    @TableField("PAGE_NAME")
    private String name;
    @TableField("PAGE_RESOURCES")
    private String resources;
    @TableField("CYCLE_INTERVAL")
    private Integer interval;
    @TableField("PAGE_TIMING")
    private String timing;
    @TableField("FACTORY")
    private String factory;
    @TableField("PAGE_VERSION")
    private String version;
}
