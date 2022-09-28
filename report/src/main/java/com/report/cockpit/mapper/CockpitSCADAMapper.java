package com.report.cockpit.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface CockpitSCADAMapper {
    /**
     * 断线的工单和工步
     */
    List<Record> breakLineOrderAndStep(Map<String, Object> param);
}
