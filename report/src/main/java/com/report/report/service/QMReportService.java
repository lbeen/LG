package com.report.report.service;

import com.report.report.utils.Page;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public interface QMReportService {
    Page summaryRodDetails(String DS, Map<String, Object> param);

    void summaryRodDetailsExport(String DS, HttpServletResponse response, Map<String, Object> param);
}
