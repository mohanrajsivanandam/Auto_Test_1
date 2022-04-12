package com.configuration.reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class Config_Reader {
	public static Properties p;
	public Config_Reader() throws Throwable {
	File f = new File("C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\src\\main\\java\\com\\property_file\\pro.properties");
	FileInputStream fis = new FileInputStream(f);
	p = new Properties();
	p.load(fis);
	}
	
	public String get_config_URL() {
	String string = p.getProperty("url");
	return string;
	}
	public String get_config_username() {
		String property = p.getProperty("usname");
		return property;
	}
	public String get_config_pass() {
		String property = p.getProperty("passwd");
		return property;
	}
	
}
