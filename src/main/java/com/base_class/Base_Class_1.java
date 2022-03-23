package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Base_Class_1 {
//a reusable method for click(),
	//public = to be called in other classes
	//static = no need to create an object
	
	public static WebDriver d; //--- > null
	public static String value;
	public static WebDriver browser_configuration(String type) {  //----> Whatever is required we need to pass as a parameter
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			d = new ChromeDriver(); //---> WebDriver not required
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			d = new FirefoxDriver();
		}else if (type.equalsIgnoreCase("safari")) {
			System.setProperty("webdriver.safari.driver", "");
			d = new SafariDriver();
		}
	return d;
	}		
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void inputValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}
	public static void close() {
			d.close();
	}
	public static void getUrl(String url) {
		// TODO Auto-generated method stub
		d.get(url);
		d.manage().window().maximize();
	}
	public static String particular_cell_data(String path, int ri, int ci) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		Row r = s.getRow(ri);
		Cell c = r.getCell(ci);
		CellType type = c.getCellType();
		if (type.equals(CellType.STRING)) {
			value = c.getStringCellValue();
			System.out.println(value);
		}else if (type.equals(CellType.NUMERIC)) {
			double v = c.getNumericCellValue();
			int v1 = (int)v;
			value = Integer.toString(v1);
			System.out.println(value);
		}
		wb.close();
		return value;
	}
	
	
	
	
	
	
}