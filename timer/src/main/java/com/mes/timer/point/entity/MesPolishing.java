package com.mes.timer.point.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mes.timer.point.entity.base.MesPointData;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * MES抛光过点表
 */
@Setter
@Getter
@TableName("IF_CCS_POLISHING_WIP")
public class MesPolishing implements MesPointData {
    @TableId(value = "IF_ID")
    private Long id;
    @TableField(value = "CRYSTAL_NUMBER")
    private String crystalNumber;
    @TableField(value = "PART_NUMBER")
    private String spec;
    @TableField(value = "MACSHOP")
    private String workshop;
    @TableField("ACTION_TIME")
    private LocalDateTime actionTime;
    @TableField(value = "EQUIPMENT")
    private String equipment;
    @TableField(value = "POLISHING_LENGTH")
    private Double length;
    @TableField(value = "STATU")
    private String status;
    @TableField("RECEIVE_TAG")
    private String receiveTag;
    @TableField(value = "FLIGHT")
    private String flight;
    @TableField(value = "DATA_TYPE")
    private Integer dataType;
    //抛光前边距
    @TableField(value = "BEFORE_EDGE1")
    private Double beforeEdge1;
    @TableField(value = "BEFORE_EDGE2")
    private Double beforeEdge2;
    @TableField(value = "BEFORE_EDGE3")
    private Double beforeEdge3;
    @TableField(value = "BEFORE_EDGE4")
    private Double beforeEdge4;
    @TableField(value = "BEFORE_EDGE5")
    private Double beforeEdge5;
    @TableField(value = "BEFORE_EDGE6")
    private Double beforeEdge6;
    //抛光前直径
    @TableField(value = "BEFORE_DIAMETER1")
    private Double beforeDiameter1;
    @TableField(value = "BEFORE_DIAMETER2")
    private Double beforeDiameter2;
    @TableField(value = "BEFORE_DIAMETER3")
    private Double beforeDiameter3;
    @TableField(value = "BEFORE_DIAMETER4")
    private Double beforeDiameter4;
    //抛光后边距
    @TableField(value = "AFTER_EDGE1")
    private Double afterEdge1;
    @TableField(value = "AFTER_EDGE2")
    private Double afterEdge2;
    @TableField(value = "AFTER_EDGE3")
    private Double afterEdge3;
    @TableField(value = "AFTER_EDGE4")
    private Double afterEdge4;
    @TableField(value = "AFTER_EDGE5")
    private Double afterEdge5;
    @TableField(value = "AFTER_EDGE6")
    private Double afterEdge6;
    //抛光后直径
    @TableField(value = "AFTER_DIAMETER1")
    private Double afterDiameter1;
    @TableField(value = "AFTER_DIAMETER2")
    private Double afterDiameter2;
    @TableField(value = "AFTER_DIAMETER3")
    private Double afterDiameter3;
    @TableField(value = "AFTER_DIAMETER4")
    private Double afterDiameter4;
    @TableField(value = "AFTER_DIAMETER5")
    private Double afterDiameter5;
    @TableField(value = "AFTER_DIAMETER6")
    private Double afterDiameter6;
}
