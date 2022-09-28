package com.mes.timer.point.service;

import com.mes.timer.point.entity.AutomaticButtOFF;
import com.mes.timer.point.entity.AutomaticButtON;
import com.mes.timer.point.entity.AutomaticPolishingOFF;
import com.mes.timer.point.entity.AutomaticPolishingON;

import java.time.LocalDateTime;
import java.util.List;

public interface AutomaticPointService {
    /**
     * 获取自动化切方上线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    List<AutomaticButtON> getAutomaticButtONList(String DS, LocalDateTime startTime, LocalDateTime endTime);

    /**
     * 获取自动化切方下线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    List<AutomaticButtOFF> getAutomaticButtOFFList(String DS, LocalDateTime startTime, LocalDateTime endTime);

    /**
     * 获取自动化抛光上线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    List<AutomaticPolishingON> getAutomaticPolishingONList(String DS, LocalDateTime startTime, LocalDateTime endTime);

    /**
     * 获取自动化抛光下线数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    List<AutomaticPolishingOFF> getAutomaticPolishingOFFList(String DS, LocalDateTime startTime, LocalDateTime endTime);
}
