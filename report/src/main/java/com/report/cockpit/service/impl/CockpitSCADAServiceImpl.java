package com.report.cockpit.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.google.common.collect.Maps;
import com.report.cockpit.mapper.CockpitSCADAMapper;
import com.report.cockpit.service.CockpitSCADAService;
import com.report.utils.SysUtils;
import com.report.utils.TimeUtils;
import com.report.utils.pojo.Record;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * 驾驶舱SCADA数据service
 */
@Service
@RequiredArgsConstructor
public class CockpitSCADAServiceImpl implements CockpitSCADAService {
    private final CockpitSCADAMapper cockpitSCADAMapper;

    /**
     * 断线的工单和工步
     *
     * @param DS        数据源
     * @param startTime 开始时间
     * @param endTime   结束时间
     */
    @DS("#DS")
    @Override
    public List<Record> breakLineOrderAndStep(String DS, LocalDateTime startTime, LocalDateTime endTime) {
        Map<String, Object> param = Maps.newHashMap();
        param.put("table", getDataTable(DS));
        param.put("startTime", TimeUtils.formatTime(startTime));
        param.put("endTime", TimeUtils.formatTime(endTime));
        return cockpitSCADAMapper.breakLineOrderAndStep(param);
    }

    /**
     * 根据数据源获取scada数据表名
     *
     * @param DS 数据源
     */
    private String getDataTable(String DS) {
        if (SysUtils.DS_BS_SCADA.equals(DS)) {
            return "BS_DATA_ALL";
        }
        if (SysUtils.DS_TC_SCADA.equals(DS)) {
            return "TC_DATA_ALL";
        }
        throw new RuntimeException("工厂匹配不到对应SCADA库数据源");
    }

}
