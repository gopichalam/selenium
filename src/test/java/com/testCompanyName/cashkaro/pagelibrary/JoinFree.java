package com.testCompanyName.cashkaro.pagelibrary;


import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JoinFree {
	
	WebDriver driver;
	
	static Logger log = Logger.getLogger(JoinFree.class.getName());
	
	By joinFreeButtonAtTop = By.xpath("html/body/div[1]/header/div/div[1]/div/nav/ul/li[4]/a");	
	By joinFreeButtonAtMiddle = By.xpath("html/body/div[1]/section[1]/section[1]/div/section/section[2]/p[6]/a[1]");
	
	By fullNameTextbox = By.xpath(".//*[@id='firstname']");
	By emailAddressTextbox = By.xpath(".//*[@id='email']");
	By confirmEmailTextbox = By.xpath(".//*[@id='con_email']");
	By passwordTextbox = By.xpath(".//*[@id='pwd-txt']");
	By captchaTextbox = By.xpath(".//*[@id='to_be_check']");
	By termsAndConditionsCheckbox = By.xpath(".//*[@id='terms_conditions']");
	By joinFreeNowButton = By.xpath(".//*[@id='join_free_submit']");
	
	public JoinFree(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/**
	 * This method is used to enter the Full Name in the Full Name Textbox
	 * @param fullName
	 */
	public void enterInFullNameTextbox (String fullName)
	{
		log.info("Enter Name in Full Name textbox");
		driver.findElement(fullNameTextbox).sendKeys(fullName);
		
	}
	
	/**
	 * This method is used to enter the Email address in the Email address textbox
	 * @param emailAddress
	 */
	public void enterInEmailAddressTextbox (String emailAddress)
	{
		log.info("Enter Email Address in Email Address textbox");
		driver.findElement(emailAddressTextbox).sendKeys(emailAddress);
	}
	
	/**
	 * This method is used to Enter the email address in the Confirm Email textbox
	 * @param emailAddress
	 */
	public void enterInConfirmEmailTextbox (String emailAddress)
	{
		log.info("Enter Email Address in Confirm Email textbox");
		driver.findElement(confirmEmailTextbox).sendKeys(emailAddress);
	}
	
	/**
	 * This method is used to enter the password in the Password Textbox
	 * @param password
	 */
	public void enterInPasswordTextbox (String password)
	{
		log.info("Enter the password");
		driver.findElement(passwordTextbox).sendKeys(password);
	}
	
	/**
	 * This method is used to enter the Captcha text in the Captcha Text Box
	 * @param captcha
	 */
	public void enterInCaptchaTextbox (String captcha)
	{
		log.info("Enter the captcha text");
		driver.findElement(captchaTextbox).sendKeys(captcha);
	}
	
	/**
	 * This method is used to Select the Terms and Conditions checkbox if it is NOT selected
	 */
	public void selectTermsAndConditionsCheckbox ()
	{
		if (!driver.findElement(termsAndConditionsCheckbox).isSelected()) // Need to update the code to select the checkbox
		{
			log.info("Select the Terms and Conditions checkbox");
			driver.findElement(termsAndConditionsCheckbox).submit();
		}
	}
	/**
	 * This method is used to UnSelect the Terms and Conditions checkbox if is Selected
	 */
	public void UnSelectTermsAndConditionsCheckbox ()
	{
		if (driver.findElement(termsAndConditionsCheckbox).isSelected()) // Need to update the code to select the checkbox
		{
			log.info("UnSelect the Terms and Conditions checkbox");
			driver.findElement(termsAndConditionsCheckbox).submit();
		}
	}
	/**
	 * This method is used to click the Join Free Now Button
	 */
	public void clickJoinFreeNowButton ( )
	{
		log.info("Click the Join Free Now button");
		driver.findElement(joinFreeNowButton).click();
	}
	
	/*
	 * This method is used to click the Join Free button at top of the home page.
	 */
	public void clickJoinFreeButtonAtTop()
	{
		log.info("Clicking the Join Free button at top");
		driver.findElement(joinFreeButtonAtTop).click();
	}
	
	/*
	 * This method is used to click the Join Free button at Middle of the home page.
	 */
	public void clickJoinFreeButtonAtMiddle()
	{
		log.info("Clicking the Join Free button at Middle");
		driver.findElement(joinFreeButtonAtMiddle).click();
	}
}
