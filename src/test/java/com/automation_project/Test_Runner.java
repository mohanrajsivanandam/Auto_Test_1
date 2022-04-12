package com.automation_project;
//Outside the Runner

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base_class.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\com\\automation\\feature\\Feature_File.feature",
		glue = "com.stepdefinition",
		monochrome = true,
		dryRun = false, //before the running checks the feature file and step definition file from features and glue.
		publish = true, // strict for info-cukes.   after the running checks the feature file and step definition file from features and glue and throw an error, not undefined as in dryRun.
		plugin = {"html:CucumberReports/thirdReport.html",
				"json:JsonReports/1stjasonreport.json",
				"pretty", //prints in console
				//"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport.html"
				//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:ExtentReport.html/ExtentReport1.html"
		}
		//tags="~@men"
		//tags=("@Men")
		)
public class Test_Runner {
	//Inside the Runner
		public static WebDriver d;

		@BeforeClass
		public static void set_Up() {
			d= Base_class.bc("chrome");
		}
		@AfterClass
		public static void tear_Down() {
			d.close();
		}
}