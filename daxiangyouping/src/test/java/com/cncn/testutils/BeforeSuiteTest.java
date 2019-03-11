package com.cncn.testutils;

import org.testng.annotations.BeforeSuite;

import com.cncn.utils.WebDriverUtil;

public class BeforeSuiteTest {
   @BeforeSuite
   public void startService(){
	   WebDriverUtil.startService("chrome");
   }
}
