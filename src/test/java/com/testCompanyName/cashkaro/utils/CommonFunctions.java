package com.testCompanyName.cashkaro.utils;

import javax.swing.JOptionPane;

public class CommonFunctions {
	
	// Function to get the catptcha text from the user and returning the same as String
	
	/**
	 * This method is used to capture the Captcha Text from the user
	 * @return
	 */
	public String getCaptchaFromUser()
	{
		String captchaValue = JOptionPane.showInputDialog("Please enter the captcha value : ");
		return captchaValue;
	}
	

}
