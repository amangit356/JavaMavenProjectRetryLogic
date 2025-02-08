package org.qa.opencart.tests;

import org.qa.opencart.base.BaseTest;
import org.qa.opencart.constant.AppConstants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void verifyLoginPageTitle() {
		
		String title = lp.getLoginPageTitle();
		
		Assert.assertEquals(title, AppConstants.LOGIN_PAGE_TITLE);
	}
	
	@Test
	public void verifyLoginPageUrl() {
		
		Assert.assertEquals(lp.getLoginPageUrl(), "https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	
	@Test(priority = 2)
	public void verifyLoginFunctionality() {
		/**
		 * If user wants to get username & password through properties file
		 */
		//lp.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		/**
		 * If user wants to pass username & password through maven command
		 */
		
		lp.doLogin(System.getProperty("username"), System.getProperty("password"));
	}


}
