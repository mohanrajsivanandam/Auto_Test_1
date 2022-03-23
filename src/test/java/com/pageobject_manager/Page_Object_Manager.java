package com.pageobject_manager;

import org.openqa.selenium.WebDriver;

import com.pom.Home_page;
import com.pom.Login_page;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_page hp;
	private Login_page lp;
	public Page_Object_Manager(WebDriver d) {
		this.driver=d;
	}
	public Home_page gethp() {
		hp = new Home_page(driver);
		return hp;
	}
	public Login_page getlp() {
		lp = new Login_page(driver);
		return lp;
	}
	
	
	
	
	
}
