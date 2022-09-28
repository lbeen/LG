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
@TableName("IF_CCS_BUTT_WIP")
public class MesButt implements MesPointData {
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
    @TableField(value = "LENGTH_BUTT")
    private Double length;
    @TableField(value = "STATU")
    private String status;
    @TableField("RECEIVE_TAG")
    private String receiveTag;
    @TableField(value = "FLIGHT")
    private String flight;
    @TableField(value = "DATA_TYPE")
    private Integer dataType;
    //备注
    //数据
    @TableField(value = "LINE_LOSS")
    private String lineLoss;
    @TableField(value = "INIT_LINE_LOSS")
    private String initLineLoss;
    @TableField(value = "END_LINE_LOSS")
    private String endLineLoss;
    @TableField(value = "CONSUMPTION")
    private String consumption;
    @TableField("START_TIME")
    private LocalDateTime startTime;
    @TableField("END_TIME")
    private LocalDateTime endTime;
    @TableField(value = "BOLT_NUMBER")
    private Double boltNumber;
}
