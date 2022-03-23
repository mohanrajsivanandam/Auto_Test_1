package com.datadriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data {
public static void particular_cell_data() throws IOException {
	File f = new File("C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\Test_Cases\\Workbook.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheetAt(0);
	Row r = s.getRow(2);
	Cell c = r.getCell(1);
	CellType ctype = c.getCellType();
	if (ctype.equals(CellType.STRING)) {
		System.out.println("String:");
		String value_s = c.getStringCellValue();
		System.out.println(value_s);
	}else if (ctype.equals(CellType.NUMERIC)) {
		System.out.println("Numeric");
		double value_n = c.getNumericCellValue();
		int value = (int) value_n;
		System.out.println(value);	
		wb.close();
	}}

public static void Read_data_test() throws IOException {
	File f = new File("C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\Test_Cases\\Workbook.xlsx");
	FileInputStream fs = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fs);
	Sheet s = wb.getSheet("Ud");
	Row r = s.getRow(1);
	Cell c = r.getCell(0);
	CellType type = c.getCellType();
	if (type.equals(CellType.STRING)) {
		System.out.println("String");
		String stringvalue = c.getStringCellValue();
		System.out.println(stringvalue);
		
	}else if (type.equals(CellType.NUMERIC)) {
		System.out.println("Numeric");
		double numericvalue = c.getNumericCellValue();
		System.out.println(numericvalue);
	}
	wb.close();
}

public static void all_Data() throws Throwable {
	File f = new File("C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\Test_Cases\\Workbook.xlsx");
	FileInputStream fs = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fs);
	Sheet s = wb.getSheet("Ad");
//	int prs = s.getPhysicalNumberOfRows();
//	System.out.println(prs);
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row rows = s.getRow(i); // i represents Row index
		for (int j = 0; j < rows.getPhysicalNumberOfCells(); j++) {
			Cell cells = rows.getCell(j); // j represents the cell index
			CellType type = cells.getCellType();
				if (type.equals(CellType.STRING)) {
						//System.out.println("String");
						String stringCellValue = cells.getStringCellValue();
						System.out.println(stringCellValue);
				}else if (type.equals(CellType.NUMERIC)) {
						//System.out.println("Numeric");
						double numericCellValue = cells.getNumericCellValue();
						//String string2 = Double.toString(numericCellValue);
						int v = (int)numericCellValue; // narrowing type casting
						String string = Integer.toString(v);
						System.out.println(string);
				}
		}
	
	wb.close();
	}
}


public static void main(String[] args) throws Throwable {
	//particular_cell_data(); //Read_data_test();
	all_Data();
}
}