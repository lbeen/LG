package com.report.kanban.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName("T_MES_KANBAN_PAGE")
@Data
public class KanbanPage {
    @TableId("ID")
    private String id;
    @TableField("CREATION_TIME")
    private Date creationTime;
    @TableField("PAGE_NAME")
    private String name;
    @TableField("PAGE_RESOURCES")
    private String resources;
    @TableField("CYCLE_INTERVAL")
    private int interval;
    @TableField("PAGE_TIMING")
    private String timing;
    @TableField("FACTORY")
    private String factory;
    @TableField("PAGE_VERSION")
    private String duration;
}
