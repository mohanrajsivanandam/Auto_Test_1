package com.configuration.reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\91735\\eclipse-workspace\\Z_Final_Project\\src\\main\\java\\com\\test_data\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String get_Config_Url() throws Throwable {
		String url = p.getProperty("url");
		return url;		
	}
	public String get_Config_email() throws Throwable {
		String email = p.getProperty("email");
		return email;		
	}
	public String get_Config_Pass() throws Throwable {
		String password = p.getProperty("passwd");
		return password;
	}
	
}
