package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_test_2 {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\91735\\Videos\\Captures\\Project Training Suriya\\17D\\Workbook.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	wb.getSheet("Light").createRow(0).createCell(0).setCellValue("S.No.");
	wb.getSheet("Light").getRow(0).createCell(1).setCellValue("Name");
	wb.getSheet("Light").createRow(1).createCell(0).setCellValue(1);
	wb.getSheet("Light").getRow(1).createCell(1).setCellValue("Mohan");
	wb.getSheet("Light").createRow(2).createCell(0).setCellValue(2);
	wb.getSheet("Light").getRow(2).createCell(1).setCellValue("Jeni");
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();
	System.out.println("Creation Successful");
}
}