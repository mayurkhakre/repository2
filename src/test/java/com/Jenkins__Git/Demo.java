package com.Jenkins__Git;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void imagetest0(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///E:/mayurjava/offline%20website/index.html");
	WebElement img = driver.findElement(By.xpath("/html/body/div/center/img"));
	Assert.assertEquals(img.isDisplayed(),true);}

	 @Test 
		public void logintest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("file:///E:/mayurjava/offline%20website/index.html");
	    WebElement email=driver.findElement(By.xpath("//input[@class='form-control' and @type='text']"));
		email.sendKeys("kiran@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[contains(@id,'p')]"));
		password.sendKeys("123456");
		WebElement signin = driver.findElement(By.xpath("//button"));
		signin.click();
		
		Thread.sleep(1000);
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl , "file:///E:/mayurjava/offline%20website/pages/examples/dashboard.html");
	 }
	

}
