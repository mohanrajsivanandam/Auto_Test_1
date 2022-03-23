package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_test_1 {
public static void main(String[] args) throws Throwable {
//	File f = new File("C:\\Users\\91735\\Videos\\Captures\\Project Training Suriya\\17D\\Workbook.xlsx");
//	FileInputStream fis = new FileInputStream(f);
//	Workbook wb = new XSSFWorkbook(fis);
//	Sheet cs = wb.createSheet("Mohan");
//	Row r = cs.createRow(0);
//	Cell cc = r.createCell(1);
//	cc.setCellValue("Success!!!");
	
	File f = new File("C:\\Users\\91735\\Videos\\Captures\\Project Training Suriya\\17D\\Workbook.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
//	Sheet cs = wb.createSheet("Mohan");
//	Row cr = cs.createRow(0);
//	Cell cc = cr.createCell(1);
//	cc.setCellValue("Success!!!");
	
	wb.createSheet("Mohan2").createRow(0).createCell(0).setCellValue("Name");
	wb.getSheet("Mohan2").getRow(0).createCell(1).setCellValue("Marks");
	wb.getSheet("Mohan2").createRow(1).createCell(0).setCellValue("Mohan");
	wb.getSheet("Mohan2").getRow(1).createCell(1).setCellValue(100);
	
	//wb.getSheetAt(0).createRow(0).createCell(2).setCellValue("Comments"); // ----->Overrides the data from createRow(0);
	
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	wb.close();	
	System.out.println("Write Successful");
}
}
