package com.report.report.mapper;

import com.report.utils.pojo.Record;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface QMReportMapper {
    int summaryRodDetailsCount(Map<String, Object> param);

    List<Record> summaryRodDetails(Map<String, Object> param);

    List<Record> summaryRodDetailsExport(Map<String, Object> param);
}
