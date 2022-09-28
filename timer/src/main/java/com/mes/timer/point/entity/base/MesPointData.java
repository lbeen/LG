package com.mes.timer.point.entity.base;

import java.time.LocalDateTime;

/**
 * MES过点表
 */
public interface MesPointData {
    /**
     * 设置晶编
     */
    void setCrystalNumber(String crystalNumber);

    /**
     * 设置规格
     */
    void setSpec(String spec);

    /**
     * 设置车间
     */
    void setWorkshop(String workshop);

    /**
     * 设置时间
     */
    void setActionTime(LocalDateTime actionTime);

    /**
     * 设置设备编号
     */
    void setEquipment(String equipment);

    /**
     * 设置长度
     */
    void setLength(Double length);

    /**
     * 设置状态
     */
    void setStatus(String status);

    /**
     * 设置接收状态
     */
    void setReceiveTag(String receiveTag);

    /**
     * 设置备注4
     */
    void setDataType(Integer dataType);
}
