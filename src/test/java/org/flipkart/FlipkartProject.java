package org.flipkart;

import org.base.CommonClass;
import org.base.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartProject extends CommonClass{
//	static WebDriver d;
//	static FlipkartProject n;
	public static RegisterPage reg;
	
	@BeforeClass
	public void launchBrowser() {
		reg = new RegisterPage();
		reg.browserLanuch();
		reg.launchURL("https://demo.guru99.com/");
	}
	
	@Test(priority=1,invocationCount = 3)
	public void enterEmail() {
			reg.findElement("xpath", "//input[@name='emailid']").click();
			reg.sendKeys("xpath", "//input[@name='emailid']", "jern@gmail.com");
			
	}
	@Test(priority=2)
	public void clickSubmit() {
//		enterEmail();
		reg.findElement("xpath", "//input[@value='Submit']").click();
	}
		
		
	
	
}
