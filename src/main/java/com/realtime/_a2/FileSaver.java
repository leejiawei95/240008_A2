/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.realtime._a2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileSaver implements FileHandler {

    @Override
    public void storeData(String[] headers, List<Matrik> matriks) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Java parser");

        String[] titles = {"Semester", "Course", "Group", "Task"};
        for (int i = 0; i < headers.length; i++) {
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(titles[i]);
            row.createCell(1).setCellValue(headers[i]);
        }

        //static fields
        Row r6 = sheet.createRow(5);
        r6.createCell(5).setCellValue("java keyword");

        Row r7 = sheet.createRow(6);
        r7.createCell(0).setCellValue("Matrik");
        r7.createCell(1).setCellValue("LOC");
        r7.createCell(2).setCellValue("Blank");
        r7.createCell(3).setCellValue("Comment");
        r7.createCell(4).setCellValue("ActualLOC");

        //prepare keywords
        Set<String> usedKeywords = new HashSet<>();
        ExcelParser.KEYWORDS.forEach(kw -> matriks.forEach(m -> {
            if (m.getWordCount().get(kw) > 0) {
                usedKeywords.add(kw);
            }
        }));

        int currentColumn = 5;
        for (String keyword : usedKeywords) {
            r7.createCell(currentColumn).setCellValue(keyword);
            currentColumn++;
        }

        int currentRow = 7;
        for (Matrik matrik : matriks) {
            Row row = sheet.createRow(currentRow);
            row.createCell(0).setCellValue(matrik.getName());
            row.createCell(1).setCellValue(matrik.getLoc());
            row.createCell(2).setCellValue(matrik.getBlank());
            row.createCell(3).setCellValue(matrik.getComment());
            row.createCell(4).setCellValue(matrik.getActual());


            currentColumn = 5;
            for (String keyword : usedKeywords) {
                int count = matrik.getWordCount().get(keyword);
                if (count > 0) {
                    row.createCell(currentColumn).setCellValue(count);
                    currentColumn++;
                }
            }
            row.createCell(currentColumn).setCellValue(matrik.getTotal());

            currentRow++;
        }

        try {
            FileOutputStream outputStream = new FileOutputStream("result.xls");
            workbook.write(outputStream);
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
    
    
}

