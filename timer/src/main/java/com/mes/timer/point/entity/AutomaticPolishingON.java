package com.mes.timer.point.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.mes.timer.point.entity.base.AutomaticData;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 自动化抛光开工表
 */
@Setter
@Getter
@TableName("PRODC_FEED")
public class AutomaticPolishingON  implements AutomaticData {
    @TableField(value = "CODE")
    private String crystalNumber;
    @TableField(value = "SPEC")
    private String spec;
    @TableField(value = "WORK_SHOP")
    private String workshop;
    @TableField(value = "UPDATETIME")
    private LocalDateTime actionTime;
    @TableField(value = "MACID")
    private String equipment;
    @TableField(value = "LENGTH")
    private Double length;
}
