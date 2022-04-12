package com.runner_class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Runner_class_test {
	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\91735\\eclipse-workspace\\MiniProject1\\Driver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	
	d.get("http://automationpractice.com/index.php?id_product=1&controller=product#/color-orange/size-l");
	d.manage().window().maximize();
	
//	WebElement orangedress = d.findElement(By.xpath("(//img[@title='Faded Short Sleeve T-shirts'])[1]"));
//	orangedress.click();
	
	d.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
	
	WebElement size = d.findElement(By.xpath("//select[@name='group_1']"));
	Select s4 = new Select(size);
	s4.selectByValue("3");
	
	WebElement addtocart = d.findElement(By.xpath("//span[text()='Add to cart']"));
	addtocart.click();
	
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebElement proceed1 = d.findElement(By.xpath("//a[@title='Proceed to checkout']"));
	proceed1.click();

	WebElement proceed2 = d.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
	proceed2.click();

	d.findElement(By.id("email")).sendKeys("12345@123.com");
	d.findElement(By.id("passwd")).sendKeys("12345");
	d.findElement(By.name("SubmitLogin")).click();
	
	d.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	d.findElement(By.id("cgv")).click();
	
	d.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']")).click();
	d.findElement(By.xpath("//a[@title='Pay by bank wire']")).click();
	d.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
	
	TakesScreenshot ts = (TakesScreenshot)d;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("C:\\Users\\91735\\eclipse-workspace\\Runner_Class\\Screenshots\\Runner_Class_1st_Run");
	FileUtils.copyFile(source, dest);	
}
}
