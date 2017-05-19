package com.testCompanyName.cashkaro.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	public static Properties Repository = new Properties();
	public File f;
	public FileInputStream FI;
	public WebDriver driver;
	
	public void init() throws IOException
	{
		loadPropertiesFile();
		
		driver = selectBrowser(Repository.getProperty("browser"));
		System.out.println("URL is " + Repository.getProperty("url"));
		driver.get(Repository.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void loadPropertiesFile()
	{
		f= new File(System.getProperty("user.dir") + "//src//test//java//com//testCompanyName//cashkaro//config//config.properties");
		try {
			
			FI = new FileInputStream(f);		
			Repository.load(FI);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public WebDriver selectBrowser(String browser)
	{
		if (browser.equals("firefox") || browser.equals("FIREFOX"))
		{
			

			System.setProperty("webdriver.gecko.driver", Repository.getProperty("geckodriver_path"));	

			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			return driver;
			
		}
		else if (browser.equals("chrome") || browser.equals("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver", Repository.getProperty("chromedriver_path"));		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			return driver;
			
		}
		
		else if (browser.equals("ie") || browser.equals("IE"))
		{
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
			return driver;
			
		}
		return null;
	}
}
