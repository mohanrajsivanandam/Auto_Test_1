package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page{
	public WebDriver driver;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement pass;
	@FindBy(id="SubmitLogin")
	private WebElement submit;
	public Login_page(WebDriver d) {
		this.driver = d;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	@FindBy(xpath="//input[@name='passwd']")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	
	
}







//WebElement email = d.findElement(By.xpath("//input[@name='email']"));
//inputValueElement(email, "12345@123.com");
//WebElement password = d.findElement(By.xpath("//input[@name='passwd']"));
//inputValueElement(password, "12345");
//WebElement login = d.findElement(By.id("SubmitLogin"));
//clickOnElement(login);