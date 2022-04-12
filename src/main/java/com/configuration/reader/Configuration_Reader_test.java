package com.configuration.reader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader_test {
		public static Properties p;

		public Configuration_Reader_test() throws Throwable{
		File f = new File(".properties file path");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
		}

		public String get_config_url(){
		String url = p.getProperty("url");
		return url;
		}
		public String get_Config_email(){
		String email = p.getProperty("email");
		return email;
		}
		public String get_Config_password(){
		String password = p.getProperty("passwd");
		return password;
		}
		}
