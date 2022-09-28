package com.mes.timer.point.entity.base;

import java.time.LocalDateTime;

/**
 * 自动化工序表
 */
public interface AutomaticData {
    /**
     * 获取晶编
     */
    String getCrystalNumber();

    /**
     * 获取规格
     */
    String getSpec();

    /**
     * 获取车间
     */
    String getWorkshop();

    /**
     * 获取时间
     */
    LocalDateTime getActionTime();

    /**
     * 获取设备编号
     */
    String getEquipment();

    /**
     * 获取长度
     */
    Double getLength();
}
