package com.mes.timer.point.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

/**
 * MES圆棒表
 */
@Setter
@Getter
@TableName("AT_PM_WORKBLANKLINEATION")
public class MesRound {
    @TableId(value = "ATR_KEY")
    private Long id;
    @TableField("CRYSTAL_NUMBER_S")
    private String crystalNumber;
}
