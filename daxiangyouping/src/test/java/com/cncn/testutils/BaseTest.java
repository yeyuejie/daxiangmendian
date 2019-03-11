package com.cncn.testutils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cncn.utils.WebDriverUtil;

public class BaseTest {
	public WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		driver=WebDriverUtil.getDriver("chrome",this.getClass());
		driver.manage().timeouts().implicitlyWait(3L, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
   
}
