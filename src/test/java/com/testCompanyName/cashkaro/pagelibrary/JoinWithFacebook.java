package com.testCompanyName.cashkaro.pagelibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JoinWithFacebook {

	WebDriver driver;
	
	WebElement joinWithFacebookButton = driver.findElement(By.xpath(".//*[@id='close_and_go_fb']"));
	
	// Join with Facebook - Popup window contents
	
	WebElement facebookEmailOrPhoneTextbox = driver.findElement(By.xpath(".//*[@id='email']"));
	WebElement facebookPasswordTextbox = driver.findElement(By.xpath(".//*[@id='pass']"));
	WebElement facebookLoginButton = driver.findElement(By.xpath(".//*[@id='u_0_2']"));
	
	// Join with Facebook - Confirmation page contents
	
	WebElement continueAsFirstNameButton = driver.findElement(By.xpath(".//*[@id='u_0_0']"));
	WebElement cancelButton = driver.findElement(By.xpath("")); // xpath not yet updated
	WebElement editThisLink = driver.findElement(By.xpath("")); // xpath not yet updated
	
	// Join with Facebook - Merge or Create Account page
	
	WebElement yourCashkaroEmailTextbox = driver.findElement(By.xpath(".//*[@id='uname']")); 
	WebElement yourCashkaroPasswordTextbox = driver.findElement(By.xpath(".//*[@id='pwd-txt']"));
	WebElement forgotPasswordLink = driver.findElement(By.xpath(".//*[@id='forgot_pwd']"));
	WebElement LinkAccountButton = driver.findElement(By.xpath(".//*[@id='sign_in']"));
	
	WebElement signInWithFacebookButton = driver.findElement(By.xpath("html/body/div[1]/section/section/section/div[2]/a"));

}
