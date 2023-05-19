package org.redbus;

import org.base.CommonClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RedBusLoginPage extends CommonClass{
//	RedBusLoginPage r;
	
	@BeforeClass
	public void launchRebBus() {
//		r = new RedBusLoginPage();
		browserLanuch();
		launchURL("https://www.office.com/");
	}
	
@Test()	
	public void firstClickSingIn() throws InterruptedException {
		findElement("xpath", "//a[@id='hero-banner-sign-in-to-office-365-link']").click();
//		Thread.sleep(2000);
//		clickElement("xpath", "//input[@type='email']");
//		sendKeys("xpath", "//input[@type='email']", "jerin@gmail.com");

}
@Test(priority=1)
	public void secondClickToEnterMail() {
		waits();
		clickElement("xpath", "//input[@type='email']");
		sendKeys("xpath", "//input[@type='email']", "jerin@gmail.com");
}

@Test(priority=2)
public void thirdClickNext() {	
	findElement("xpath", "//input[@data-report-value='Submit']").click();
}
@Test(priority=3)
public void fourthEnterPassword() throws InterruptedException {
	Thread.sleep(2000);
	sendKeys("xpath", "//input[@name='passwd']" , "1236654");
}

@Test(priority=4)
public void fivthClickLogIn() {
//	String origanalerrortext = "Your account or password is incorrect. If you don't remember your password, reset it now.";
	findElement("xpath", "//input[@data-report-value='Submit']").click();
	getTextTwo("xpath", "//div[@id='passwordError']");
//	if(origanalerrortext.equalsIgnoreCase(text2)) {
//		driverClose();
//		System.out.println("Invalid Crentiacials");
//	}else {
//		getTitle();
//		driverClose();
//	}
	ifElse("Your account or password is incorrect. If you don't remember your password, reset it now.");
	
}



}





