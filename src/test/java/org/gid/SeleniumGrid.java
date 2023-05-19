package org.gid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	
	public static void main (String []args) throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities ();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		String nodeURL = "http://192.168.1.100.5555";
		WebDriver driver = new RemoteWebDriver(new URL(nodeURL),cap);
	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		int[] i = new int[5];
	
	}
	

}
