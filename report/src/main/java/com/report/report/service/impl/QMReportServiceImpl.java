package com.report.report.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.report.report.mapper.QMReportMapper;
import com.report.report.service.QMReportService;
import com.report.report.utils.Page;
import com.report.report.utils.ReportUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class QMReportServiceImpl implements QMReportService {
    private final QMReportMapper qmReportMapper;

    @DS("#DS")
    public Page summaryRodDetails(String DS, Map<String, Object> param) {
        return ReportUtils.getPage(qmReportMapper::summaryRodDetailsCount, qmReportMapper::summaryRodDetails, param);
    }

    @DS("#DS")
    public void summaryRodDetailsExport(String DS, HttpServletResponse response, Map<String, Object> param) {
        String[] heads = {"序号", "晶编", "规格", "划线段数", "车间", "重量", "无位错长度"};
        ReportUtils.export(response, qmReportMapper::summaryRodDetailsExport, param, heads);
    }
}
