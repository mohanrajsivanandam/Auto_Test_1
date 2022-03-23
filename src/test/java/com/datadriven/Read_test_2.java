package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_test_2 {
public static void main(String[] args) throws Throwable {
	File f = new File("C:\\Users\\91735\\Videos\\Captures\\Project Training Suriya\\17D\\Test Cases.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	
	Cell c = wb.getSheetAt(0).getRow(3).getCell(6);
//	Sheet s = wb.getSheetAt(1);
//	Row r = s.getRow(0);
//	Cell c = r.getCell(0);
	
	//Numeric or String
	
	CellType ct = c.getCellType();
	
	if (ct.equals(CellType.STRING)) {
		System.out.println("String");
		String stringCellValue = c.getStringCellValue();
		System.out.println(stringCellValue);
	}else if (ct.equals(CellType.NUMERIC)) {
		System.out.println("Numeric");
		double numericCellValue = c.getNumericCellValue();
		int v = (int) numericCellValue;
		String string = Integer.toString(v);		
		System.out.println(string);
	}	
	wb.close();
}
}
