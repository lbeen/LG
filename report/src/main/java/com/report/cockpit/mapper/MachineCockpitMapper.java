package com.report.cockpit.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MachineCockpitMapper {
    /**
     * 设备维修总时长
     */
    Double totalEquipmentMaintenanceTime(Map<String, Object> param);

    /**
     * 设备维修用时
     */
    List<Record> equipmentMaintenanceTime(Map<String, Object> param);

    /**
     * 设备待料总时长
     */
    Double totalEquipmentWaitingTime(Map<String, Object> param);

    /**
     * 待料时间
     */
    List<Record> equipmentWaitingTime(Map<String, Object> param);

    /**
     * 设备总数
     */
    Double equipmentCount(Map<String, Object> param);

    /**
     * 交料总长度
     */
    Double totalPayLength(Map<String, Object> param);

    /**
     * 交料详情
     */
    List<Record> payLengthByReason(Map<String, Object> param);
}
