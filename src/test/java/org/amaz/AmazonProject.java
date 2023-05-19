package org.amaz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProject {
	WebDriver d;
@BeforeMethod
	public void launchBrowser() {
WebDriverManager.chromedriver().setup();
d = new ChromeDriver();
	}
@BeforeMethod
	public void launchUrl() {
		d.get("https://www.amazon.in/");
	}
@Test	
	public void testCaseOne() {
		WebElement find = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));	
		find.sendKeys("IOS Apple");
		d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
//		find.click();
	}

@AfterMethod
public void testCaseTwo() {
	WebElement find = d.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));	
//	find.sendKeys("IOS Apple");
	find.click();
//	d.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
}

@AfterMethod
	public void close() {
		d.close();
	}
	
	
}
