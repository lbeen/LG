package com.mes.web;

import com.datasweep.compatibility.client.ATRow;
import com.mes.dao.Dao;
import com.mes.util.CommonUtils;
import com.mes.util.Result;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/simulator")
public class SimulatorController {
    private final Dao dao;

    public SimulatorController(Dao dao) {this.dao = dao;}

    @RequestMapping("resistance")
    public Result list() throws Exception {
        String sql = "SELECT CRYSTAL_NUMBER_S,SPARE_2_S FROM AT_PM_LINEATIONANDDETECTION";
        sql += " WHERE CREATION_TIME>SYSDATE-10 AND CREATION_TIME<SYSDATE-8 AND SPARE_2_S>3";
        //        String sql = "SELECT CRYSTAL_NUMBER_S,SPARE_2_S FROM AT_PM_LINEATIONANDDETECTION";
        //        sql += " WHERE CRYSTAL_NUMBER_S='ZTS25H2901C'";
        List<String[]> rows = dao.queryList(sql);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        int count = 0;
        int rowIndex = 1;
        for (String[] row : rows) {
            String blankNumber = row[0];
            int normal = Integer.parseInt(row[1]);
            List<String[]> rounds = getRounds(blankNumber).subList(0, normal);
            float[][] resistanceHead = getResistance(rounds.get(0)[0]);
            if (resistanceHead == null) {
                continue;
            }
            float[][] resistanceTail = getResistance(rounds.get(rounds.size() - 1)[0]);
            if (resistanceTail == null) {
                continue;
            }

            float[] headA = resistanceHead[0];
            float[] headB = resistanceHead[1];
            float[] tailA = resistanceTail[0];
            float[] tailB = resistanceTail[1];

            writeData(sheet.createRow(rowIndex++), rounds.get(0)[0], "实测", headA, headB);

            float totalLenTAWA = 0;
            float totalLenTBWA = 0;
            Map<String, Float> crystalLens = new LinkedHashMap<>();
            for (int i = 0; i < rounds.size() - 1; i++) {
                String[] round = rounds.get(i);
                float len = Float.parseFloat(round[1]);
                if (i != 0) {
                    totalLenTBWA += len;
                    crystalLens.put(round[0], len);
                }
                totalLenTAWA += len;
            }

            float[] attenuationTAWA = new float[6];
            for (int i = 0; i < 6; i++) {
                attenuationTAWA[i] = (headA[i] - tailA[i]) / totalLenTAWA;
            }
            float[] attenuationTBWA = new float[6];
            for (int i = 0; i < 6; i++) {
                attenuationTBWA[i] = (headB[i] - tailA[i]) / totalLenTBWA;
            }

            float lenTAWA = Float.parseFloat(rounds.get(0)[1]);
            float lenTBWA = 0;

            float[] lastBTAWA = new float[6];
            for (int i = 0; i < 6; i++) {
                lastBTAWA[i] = headA[i] - attenuationTAWA[i] * lenTAWA;
            }
            float[] lastBTBWA = headB;

            for (Map.Entry<String, Float> entry : crystalLens.entrySet()) {
                float len = entry.getValue();

                lenTAWA += len;
                lenTBWA += len;

                float[] currentBTAWA = new float[6];
                float[] currentBTBWA = new float[6];
                for (int i = 0; i < 6; i++) {
                    currentBTAWA[i] = headA[i] - attenuationTAWA[i] * lenTAWA;
                    currentBTBWA[i] = headB[i] - attenuationTBWA[i] * lenTBWA;
                }

                String crystalNumber = entry.getKey();
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头A尾A", lastBTAWA, currentBTAWA);
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头B尾A", lastBTBWA, currentBTBWA);

                lastBTAWA = currentBTAWA;
                lastBTBWA = currentBTBWA;
            }

            writeData(sheet.createRow(rowIndex++), rounds.get(rounds.size() - 1)[0], "实测", tailA, tailB);

            rowIndex++;
            if (++count >= 300) {
                break;
            }
        }

        workbook.write(Files.newOutputStream(Paths.get("F:1.xlsx")));

        return null;
    }

    private void writeData(Row row, String crystalNumber, String type, float[] resistanceA, float[] resistanceB) {
        row.createCell(0).setCellValue(crystalNumber);
        row.createCell(1).setCellValue(type);

        int index = 2;
        for (float value : resistanceA) {
            row.createCell(index++).setCellValue(CommonUtils.round(value, 3));
        }
        for (float value : resistanceB) {
            row.createCell(index++).setCellValue(CommonUtils.round(value, 3));
        }
    }

    private List<String[]> getRounds(String blankNumber) {
        String sql = "SELECT CRYSTAL_NUMBER_S,LENGTH_F FROM AT_PM_WORKBLANKLINEATION";
        sql += " WHERE WORKBLANK_NUMBER_S='" + blankNumber + "' ORDER BY CRYSTAL_NUMBER_S";
        return dao.queryList(sql);
    }

    private float[][] getResistance(String crystalNumber) throws Exception {
        ATRow row = dao.queryATRow("QM_DetectionResistance", f -> {
            f.forColumnNameEqualTo("crystal_number", crystalNumber);
            f.forColumnNameEqualTo("detection_type", "首检");
        });
        if (row == null) {
            return null;
        }
        float[] resistanceA = new float[]{(float) row.getValue("resistance_value_A1"),
                (float) row.getValue("resistance_value_A2"), (float) row.getValue("resistance_value_A3"),
                (float) row.getValue("resistance_value_A4"), (float) row.getValue("resistance_value_A5"),
                (float) row.getValue("resistance_value_A6")};
        float[] resistanceB = new float[]{(float) row.getValue("resistance_value_B1"),
                (float) row.getValue("resistance_value_B2"), (float) row.getValue("resistance_value_B3"),
                (float) row.getValue("resistance_value_B4"), (float) row.getValue("resistance_value_B5"),
                (float) row.getValue("resistance_value_B6")};
        return new float[][]{resistanceA, resistanceB};
    }

}
