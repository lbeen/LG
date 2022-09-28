package com.report.cockpit.service;

import com.report.utils.pojo.Record;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 驾驶舱SCADA数据service
 */
public interface CockpitSCADAService {
    /**
     * 断线的工单和工步
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    List<Record> breakLineOrderAndStep(String DS, LocalDateTime startTime, LocalDateTime endTime);
}
