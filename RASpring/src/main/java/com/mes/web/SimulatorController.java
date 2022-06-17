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

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/simulator")
public class SimulatorController {
    private final Dao dao;

    public SimulatorController(Dao dao) {this.dao = dao;}

    @RequestMapping("resistance")
    public Result resistance() throws Exception {
        String sql = "SELECT CRYSTAL_NUMBER_S,SPARE_2_S FROM AT_PM_LINEATIONANDDETECTION";
        sql += " WHERE CREATION_TIME>SYSDATE-10 AND CREATION_TIME<SYSDATE-8 AND SPARE_2_S>3";
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

            float totalLenTBWA = 0;
            float totalLenTAWA = 0;
            float totalLenTAWB = 0;
            Map<String, Float> crystalLens = new LinkedHashMap<>();
            for (int i = 0; i < rounds.size(); i++) {
                String[] round = rounds.get(i);
                float len = Float.parseFloat(round[1]);
                if (i == 0) {
                    totalLenTAWA += len;
                    totalLenTAWB += len;
                } else if (i == rounds.size() - 1) {
                    totalLenTAWB += len;
                } else {
                    totalLenTBWA += len;
                    totalLenTAWA += len;
                    totalLenTAWB += len;
                    crystalLens.put(round[0], len);
                }
            }

            float[] attenuationTBWA = new float[6];
            float[] attenuationTAWA = new float[6];
            float[] attenuationTAWB = new float[6];
            for (int i = 0; i < 6; i++) {
                attenuationTBWA[i] = (headB[i] - tailA[i]) / totalLenTBWA;
                attenuationTAWA[i] = (headA[i] - tailA[i]) / totalLenTAWA;
                attenuationTAWB[i] = (headA[i] - tailB[i]) / totalLenTAWB;
            }

            float lenTBWA = 0;
            float lenTAWA = Float.parseFloat(rounds.get(0)[1]);
            float lenTAWB = Float.parseFloat(rounds.get(0)[1]);

            float[] lastBTBWA = headB;
            float[] lastBTAWA = new float[6];
            float[] lastBTAWB = new float[6];
            for (int i = 0; i < 6; i++) {
                lastBTAWA[i] = headA[i] - attenuationTAWA[i] * lenTAWA;
                lastBTAWB[i] = headA[i] - attenuationTAWA[i] * lenTAWB;
            }

            for (Map.Entry<String, Float> entry : crystalLens.entrySet()) {
                float len = entry.getValue();

                lenTBWA += len;
                lenTAWA += len;
                lenTAWB += len;

                float[] currentBTBWA = new float[6];
                float[] currentBTAWA = new float[6];
                float[] currentBTAWB = new float[6];
                for (int i = 0; i < 6; i++) {
                    currentBTBWA[i] = headB[i] - attenuationTBWA[i] * lenTBWA;
                    currentBTAWA[i] = headA[i] - attenuationTAWA[i] * lenTAWA;
                    currentBTAWB[i] = headA[i] - attenuationTAWB[i] * lenTAWB;
                }

                String crystalNumber = entry.getKey();
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头B尾A", lastBTBWA, currentBTBWA);
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头A尾A", lastBTAWA, currentBTAWA);
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头A尾B", lastBTAWB, currentBTAWB);

                lastBTBWA = currentBTBWA;
                lastBTAWA = currentBTAWA;
                lastBTAWB = currentBTAWB;
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

    @RequestMapping("lifetime")
    public Result lifetime() throws Exception {
        String sql = "SELECT CRYSTAL_NUMBER_S,SPARE_2_S FROM AT_PM_LINEATIONANDDETECTION";
        sql += " WHERE CREATION_TIME>SYSDATE-10 AND CREATION_TIME<SYSDATE-8 AND SPARE_2_S>3";
        List<String[]> rows = dao.queryList(sql);

        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();

        int count = 0;
        int rowIndex = 1;
        for (String[] row : rows) {
            String blankNumber = row[0];
            int normal = Integer.parseInt(row[1]);
            List<String[]> rounds = getRounds(blankNumber).subList(0, normal);
            float[] lifetimeHead = getLifetime(rounds.get(0)[0]);
            if (lifetimeHead == null) {
                continue;
            }
            float[] lifetimeTail = getLifetime(rounds.get(rounds.size() - 1)[0]);
            if (lifetimeTail == null) {
                continue;
            }

            float headA = lifetimeHead[0];
            float headB = lifetimeHead[1];
            float tailA = lifetimeTail[0];
            float tailB = lifetimeTail[1];

            writeData(sheet.createRow(rowIndex++), rounds.get(0)[0], "实测", headA, headB);

            float totalLenTBWA = 0;
            float totalLenTAWA = 0;
            float totalLenTAWB = 0;
            Map<String, Float> crystalLens = new LinkedHashMap<>();
            for (int i = 0; i < rounds.size(); i++) {
                String[] round = rounds.get(i);
                float len = Float.parseFloat(round[1]);
                if (i == 0) {
                    totalLenTAWA += len;
                    totalLenTAWB += len;
                } else if (i == rounds.size() - 1) {
                    totalLenTAWB += len;
                } else {
                    totalLenTBWA += len;
                    totalLenTAWA += len;
                    totalLenTAWB += len;
                    crystalLens.put(round[0], len);
                }
            }

            float attenuationTBWA = (headB - tailA) / totalLenTBWA;
            float attenuationTAWA = (headA - tailA) / totalLenTAWA;
            float attenuationTAWB = (headA - tailB) / totalLenTAWB;

            float lenTBWA = 0;
            float lenTAWA = Float.parseFloat(rounds.get(0)[1]);
            float lenTAWB = Float.parseFloat(rounds.get(0)[1]);

            float lastBTBWA = headB;
            float lastBTAWA = headA - attenuationTAWA * lenTAWA;
            float lastBTAWB = headA - attenuationTAWA * lenTAWB;

            for (Map.Entry<String, Float> entry : crystalLens.entrySet()) {
                float len = entry.getValue();

                lenTBWA += len;
                lenTAWA += len;
                lenTAWB += len;

                float currentBTBWA = headB - attenuationTBWA * lenTBWA;
                float currentBTAWA = headA - attenuationTAWA * lenTAWA;
                float currentBTAWB = headA - attenuationTAWB * lenTAWB;

                String crystalNumber = entry.getKey();
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头B尾A", lastBTBWA, currentBTBWA);
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头A尾A", lastBTAWA, currentBTAWA);
                writeData(sheet.createRow(rowIndex++), crystalNumber, "模拟头A尾B", lastBTAWB, currentBTAWB);

                lastBTBWA = currentBTBWA;
                lastBTAWA = currentBTAWA;
                lastBTAWB = currentBTAWB;
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



    private float[] getLifetime(String crystalNumber) throws Exception {
        ATRow row = dao.queryATRow("QM_DetectionLifetime", f -> {
            f.forColumnNameEqualTo("crystal_number", crystalNumber);
            f.forColumnNameEqualTo("detection_type", "首检");
        });
        if (row == null) {
            return null;
        }
        return new float[]{(float) row.getValue("lifetime_A"), (float) row.getValue("lifetime_B")};
    }

    private void writeData(Row row, String crystalNumber, String type, float lifetimeA, float lifetimeB) {
        row.createCell(0).setCellValue(crystalNumber);
        row.createCell(1).setCellValue(type);
        row.createCell(2).setCellValue(lifetimeA);
        row.createCell(3).setCellValue(lifetimeB);
    }

    private List<String[]> getRounds(String blankNumber) {
        String sql = "SELECT CRYSTAL_NUMBER_S,LENGTH_F FROM AT_PM_WORKBLANKLINEATION";
        sql += " WHERE WORKBLANK_NUMBER_S='" + blankNumber + "' ORDER BY CRYSTAL_NUMBER_S";
        return dao.queryList(sql);
    }

}
