package com.report.report.web;

import com.report.report.service.QMReportService;
import com.report.utils.SysUtils;
import com.report.utils.pojo.Result;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("report/qm")
@RequiredArgsConstructor
public class QMReportController {
    private final QMReportService qmReportService;

    /**
     * 断线
     */
    @GetMapping("summaryRodDetails")
    public Result summaryRodDetails(@RequestParam Map<String, Object> param) {
        return Result.success(
                qmReportService.summaryRodDetails(SysUtils.getDGDataSource(param.get("factory").toString()), param));
    }

    /**
     * 断线
     */
    //    @PostMapping("summaryRodDetailsExport")
    //    public void summaryRodDetailsExport(HttpServletResponse response, @RequestBody Map<String, Object> param) {
    @GetMapping("summaryRodDetailsExport")
    public void summaryRodDetailsExport(HttpServletResponse response, @RequestParam Map<String, Object> param) {
        qmReportService.summaryRodDetailsExport(SysUtils.getDGDataSource(param.get("factory").toString()), response,
                param);
    }
}
