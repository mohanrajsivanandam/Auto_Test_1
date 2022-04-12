package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement sbtn;
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement qup;
	public Home_page(WebDriver d) {
		this.driver=d;
		PageFactory.initElements(driver, this);
	}
	public WebElement getSbtn() {
		return sbtn;
	}	
	public WebElement getQup() {
		return qup;
	}
	
}