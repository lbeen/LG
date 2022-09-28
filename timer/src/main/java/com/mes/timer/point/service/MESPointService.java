package com.mes.timer.point.service;

import com.mes.timer.point.entity.AutomaticButtOFF;
import com.mes.timer.point.entity.AutomaticButtON;
import com.mes.timer.point.entity.AutomaticPolishingOFF;
import com.mes.timer.point.entity.AutomaticPolishingON;
import com.mes.timer.point.entity.MesButt;
import com.mes.timer.point.entity.MesPolishing;

import java.time.LocalDateTime;
import java.util.List;

public interface MESPointService {
    /**
     * MES处理自动化切方上线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    void handleButtONData(String DS, List<AutomaticButtON> automaticList);

    /**
     * MES处理自动化切方下线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    void handleButtOFFData(String DS, List<AutomaticButtOFF> automaticList);

    /**
     * MES处理自动化抛光上线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    void handlePolishingONData(String DS, List<AutomaticPolishingON> automaticList);

    /**
     * MES处理自动化抛光下线数据
     *
     * @param DS            MES数据源
     * @param automaticList 自动化数据
     */
    void handlePolishingOFFData(String DS, List<AutomaticPolishingOFF> automaticList);

    /**
     * 获取MES切方数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param workshop  车间
     * @param status    状态
     */
    List<MesButt> getMesButtList(String DS, LocalDateTime startTime, LocalDateTime endTime, String workshop,
                                 String status);

    /**
     * 获取MES抛光数据
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     * @param workshop  车间
     * @param status    状态
     */
    List<MesPolishing> getMesPolishingList(String DS, LocalDateTime startTime, LocalDateTime endTime, String workshop,
                                           String status);
}
