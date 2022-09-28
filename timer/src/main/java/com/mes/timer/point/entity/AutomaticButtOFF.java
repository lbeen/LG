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
@TableName("PRODUCTB")
public class AutomaticButtOFF  implements AutomaticData {
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
    //数据
    @TableField(value = "CALWEIGHT")
    private Double calWeight;
    @TableField("STARTTIME")
    private LocalDateTime startTime;
    @TableField("ENDTIME")
    private LocalDateTime endTime;
    @TableField(value = "WIRECOST")
    private Double wireCost;
    @TableField(value = "WIRELEFT")
    private Double wireLeft;
    @TableField(value = "WIREBREAKTIMES")
    private Double wireBreakTimes;
    @TableField(value = "WIRESTART")
    private Double wireStart;
}
