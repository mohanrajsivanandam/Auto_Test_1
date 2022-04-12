package com.automation_project;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.base_class.Base_class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\src\\test\\java\\com\\automation\\feature\\Feature_File.feature",
		glue="com.stepdefinition",
		plugin="html:Cucumber_Reports/Reports"
		)
public class Test_Runner_1 {
	public static WebDriver d;
	@BeforeClass
	public static void setup() {
	d = Base_class.bc("chrome");		
	}
	@AfterClass
	public static void tear_down() {
		d.close();
	}
}
