package org.qa.opencart.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.qa.opencart.factory.DriverFactory;
import org.qa.opencart.pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	protected WebDriver driver;
	protected LoginPage lp;
	protected DriverFactory df;
	protected Properties prop;
	
	@BeforeTest
	public void setUp() {
		
		df = new DriverFactory();
		prop = df.initProp();
		driver = df.initDriver(prop);
		
		lp = new LoginPage(driver);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
