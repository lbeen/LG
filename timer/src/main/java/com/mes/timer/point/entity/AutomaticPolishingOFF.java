package com.mes.timer.point.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mes.timer.point.entity.base.AutomaticData;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 自动化抛光完工表
 */
@Setter
@Getter
@TableName("PRODUCTC")
public class AutomaticPolishingOFF  implements AutomaticData {
    @TableId(value = "CODE")
    private String crystalNumber;
    @TableField(value = "SPEC")
    private String spec;
    @TableField(value = "MACSHOP")
    private String workshop;
    @TableField(value = "CREATETIME")
    private LocalDateTime actionTime;
    @TableField(value = "MACID")
    private String equipment;
    @TableField(value = "LENGTH")
    private Double length;
    @TableField(value = "FLIGHT")
    private String flight;
    //抛光前边距
    @TableField(value = "PREWIDTH1")
    private Double beforeEdge1;
    @TableField(value = "PREWIDTH2")
    private Double beforeEdge2;
    @TableField(value = "PREWIDTH3")
    private Double beforeEdge3;
    @TableField(value = "PREWIDTH4")
    private Double beforeEdge4;
    @TableField(value = "PREWIDTH5")
    private Double beforeEdge5;
    @TableField(value = "PREWIDTH6")
    private Double beforeEdge6;
    //抛光前直径
    @TableField(value = "PREDIA1")
    private Double beforeDiameter1;
    @TableField(value = "PREDIA2")
    private Double beforeDiameter2;
    @TableField(value = "PREDIA3")
    private Double beforeDiameter3;
    @TableField(value = "PREDIA4")
    private Double beforeDiameter4;
    @TableField(value = "PREDIA5")
    private Double beforeDiameter5;
    @TableField(value = "PREDIA6")
    private Double beforeDiameter6;
    //抛光后边距
    @TableField(value = "AFTWIDTH1")
    private Double afterEdge1;
    @TableField(value = "AFTWIDTH2")
    private Double afterEdge2;
    @TableField(value = "AFTWIDTH3")
    private Double afterEdge3;
    @TableField(value = "AFTWIDTH4")
    private Double afterEdge4;
    @TableField(value = "AFTWIDTH5")
    private Double afterEdge5;
    @TableField(value = "AFTWIDTH6")
    private Double afterEdge6;
    //抛光后直径
    @TableField(value = "AFTDIA1")
    private Double afterDiameter1;
    @TableField(value = "AFTDIA2")
    private Double afterDiameter2;
    @TableField(value = "AFTDIA3")
    private Double afterDiameter3;
    @TableField(value = "AFTDIA4")
    private Double afterDiameter4;
    @TableField(value = "AFTDIA5")
    private Double afterDiameter5;
    @TableField(value = "AFTDIA6")
    private Double afterDiameter6;
}
