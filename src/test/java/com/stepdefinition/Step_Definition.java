package com.stepdefinition;

import org.openqa.selenium.WebDriver;
import com.automation_project.Test_Runner;
import com.base_class.Base_class;
import com.configuration.reader.File_Reader_Manager;
import com.pageobject_manager.Page_Object_Manager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Definition extends Base_class{
	
	public static WebDriver d = Test_Runner.d;
	
	Page_Object_Manager pom = new Page_Object_Manager(d);
		
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		gu(File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Url());
		clickOnElement(pom.getHp().getSign_in_btn());
	}
//	@When("^user Enters the UN in UN Field$")
//	public void user_Enters_the_UN_in_UN_Field() throws Throwable {
//		sk(pom.getlp().getEmail(), File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_email());
//	}
//	@When("^user Enters the Pwd in Pwd Field$")
//	public void user_Enters_the_Pwd_in_Pwd_Field() throws Throwable {
//		sk(pom.getlp().getPass(), File_Reader_Manager.get_Instance_FRM().get_Instance_CR().get_Config_Pass());
//	}
	@When("user Enters the {string} in UN Field")
	public void user_enters_the_in_un_field(String string) {
		sk(pom.getlp().getEmail(), string);	
	}

	@When("user Enters the {string} in Pwd Field")
	public void user_enters_the_in_pwd_field(String string) {
		sk(pom.getlp().getPass(), string);
	}
	
	@Then("^user Clicks Login And Navigates To The MyAccount Page$")
	public void user_Clicks_Login_And_Navigates_To_The_MyAccount_Page() throws Throwable {
		clickOnElement(pom.getlp().getSubmit());
	}
	@When("^user Clicks on Dresses$")
	public void user_Clicks_on_Dresses() throws Throwable {
		clickOnElement(pom.getwp().getWomen());
	}
	@When("^user Clicks on Casual Dresses$")
	public void user_Clicks_on_Casual_Dresses() throws Throwable {
		clickOnElement(pom.getds().getDress());
	}
}