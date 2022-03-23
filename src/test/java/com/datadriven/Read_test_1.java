package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_test_1 {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\91735\\Videos\\Captures\\Project Training Suriya\\17D\\Test Cases.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Cell c = wb.getSheetAt(0).getRow(2).getCell(6);
	CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			String value = c.getStringCellValue();
			System.out.println(value);
		}else if (type.equals(CellType.NUMERIC)) {
			double value = c.getNumericCellValue();
			System.out.println(value);
		}
	
	
	
}
}
