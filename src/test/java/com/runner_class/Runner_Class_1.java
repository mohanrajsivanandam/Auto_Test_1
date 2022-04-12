package com.runner_class;

import org.openqa.selenium.WebDriver;
import com.base_class.Base_Class_1;
import com.pageobject_manager.Page_Object_Manager;

public class Runner_Class_1 extends Base_Class_1{
	public static WebDriver d = browser_configuration("chrome");
	public static void main(String[] args) throws Throwable {
	Page_Object_Manager pom = new Page_Object_Manager(d);
	pom.getlp().getEmail().click();
	getUrl("http://automationpractice.com/");
	clickOnElement(pom.getHp().getSign_in_btn());
	inputValueElement(pom.getlp().getEmail(), particular_cell_data("C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\Test_Cases\\Test Cases.xlsx", 2, 6));
	inputValueElement(pom.getlp().getPass(), particular_cell_data("C:\\Users\\91735\\eclipse-workspace\\Automation_Project_Maven1\\Test_Cases\\Test Cases.xlsx", 3, 6));
	clickOnElement(pom.getlp().getSubmit());
	close();
}
}