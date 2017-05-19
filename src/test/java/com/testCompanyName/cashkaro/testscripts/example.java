package com.testCompanyName.cashkaro.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class example 
 {
	
	String driverPath = "C:\\Users\\Gopi\\Documents\\MEGAsync\\Cloud Drive\\Selenium\\archive\\geckodriver-v0.8.0-win32\\";
	public WebDriver driver;
	
	@Test
	public void launchBrowser() {
		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
		driver = new FirefoxDriver();
	}

	@Test
	public void openApplication() {
		driver.navigate().to("http://www.google.com");
	}
	
	@Test
	public void closeDriver() {
		if(driver!=null) {
			driver.close();
		}
	}
}
