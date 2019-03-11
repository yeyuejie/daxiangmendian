package com.cncn.testutils;

import org.testng.annotations.AfterSuite;

import com.cncn.utils.WebDriverUtil;

public class AfterSuiteTest {
	@AfterSuite
    public void stopService(){
    	WebDriverUtil.stopService();
    }
}
