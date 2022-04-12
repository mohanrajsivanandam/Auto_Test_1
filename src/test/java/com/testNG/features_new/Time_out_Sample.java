package com.testNG.features_new;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time_out_Sample {
	private void abc() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://automationpractice.com/index.php");
	}	
	@Test(timeOut = 15000) //Always in milli seconds
	private void be() {
	abc();	
	}
}