package com.testCompanyName.cashkaro.testscripts;

import java.io.IOException;

import org.testng.annotations.*;

import com.testCompanyName.cashkaro.pagelibrary.JoinFree;
import com.testCompanyName.cashkaro.testbase.TestBase;
import com.testCompanyName.cashkaro.utils.CommonFunctions;

public class TC001_JoinFree extends TestBase{
	
	JoinFree joinFree;

	@BeforeClass
	
	public void setUp() throws IOException
	{
		init();
	}
	
	@Test
	
	public void testJoinFreeUsingButtonAtTop() throws InterruptedException
	{
	joinFree = new JoinFree(driver);
	CommonFunctions commonFunctions = new CommonFunctions();
	
	joinFree.clickJoinFreeButtonAtTop();
	joinFree.enterInFullNameTextbox("Gokulhassan Gopinath");
	joinFree.enterInEmailAddressTextbox("gokulhassanclothing@gmail.com");
	joinFree.enterInConfirmEmailTextbox("gokulhassanclothing@gmail.com");
	joinFree.enterInPasswordTextbox("test@123");
	String captchaText = commonFunctions.getCaptchaFromUser();
	joinFree.enterInCaptchaTextbox(captchaText);
	joinFree.selectTermsAndConditionsCheckbox();
	joinFree.clickJoinFreeNowButton();
	Thread.sleep(3000);
	
	}
	@AfterClass
	
	public void quitBrowser()
	{
		driver.close();
		driver.quit();
	}

}
