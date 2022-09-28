package com.report.report.utils;

import com.report.utils.pojo.Record;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ReportUtils {
    public static Page getPage(Function<Map<String, Object>, Integer> countFun,
                               Function<Map<String, Object>, List<Record>> listFun, Map<String, Object> param) {
        Integer count = countFun.apply(param);
        if (count == null || count <= 0) {
            return Page.empty();
        }

        int page = toInt(param.remove("page"), 1);
        int pageSize = toInt(param.remove("pageSize"), 50);

        int start = pageSize * (page - 1);
        int end = start + pageSize;
        param.put("start", start);
        param.put("end", end);
        return Page.create(count, listFun.apply(param));
    }

    private static int toInt(Object object, int defaultValue) {
        if (object == null) {
            return defaultValue;
        }
        return Integer.parseInt(object.toString());
    }

    public static void export(HttpServletResponse response, Function<Map<String, Object>, List<Record>> dataFun,
                              Map<String, Object> param, String[] heads) {
        List<Record> list = dataFun.apply(param);

        try (Workbook wb = new XSSFWorkbook(); ServletOutputStream os = response.getOutputStream()) {
            Sheet sheet = wb.createSheet();

            Row headRow = sheet.createRow(0);
            for (int i = 0; i < heads.length; i++) {
                headRow.createCell(i).setCellValue(heads[i]);
            }

            int rowIndex = 1;
            for (Record record : list) {
                Row row = sheet.createRow(rowIndex);

                int cellIndex = 0;
                for (Object value : record.values()) {
                    setCellValue(row.createCell(cellIndex), value);

                    cellIndex++;
                }

                rowIndex++;
            }

//            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setContentType("application/octet-stream;charset=UTF-8");

            response.setHeader("Content-Disposition", "attachment;filename=1.xlsx");
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");

            wb.write(os);
            os.flush();

            System.out.println("导出成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void setCellValue(Cell cell, Object value) {
        if (value == null) {
            return;
        }
        if (value instanceof BigDecimal) {
            cell.setCellValue(((BigDecimal) value).doubleValue());
            return;
        }
        if (value instanceof Number) {
            cell.setCellValue(new BigDecimal(value.toString()).doubleValue());
            return;
        }
        cell.setCellValue(value.toString());
    }
}
