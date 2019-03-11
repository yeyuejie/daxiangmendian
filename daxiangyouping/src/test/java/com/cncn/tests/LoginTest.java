package com.cncn.tests;

import org.testng.annotations.Test;

import com.cncn.pages.LoginPage;
import com.cncn.testutils.BaseTest;
import com.cncn.tetsdata.LoginData;

public class LoginTest extends BaseTest {

	@Test(dataProvider="test1",dataProviderClass=LoginData.class)
   public void logintest01(String name,String password){
	   driver.get("https://ddsale.cncn.net/opew/index");
	   LoginPage loginpage=new LoginPage(driver);
	   loginpage.login(name,password);
	   loginpage.loginAssert("叶月捷");
	
   }
 
}
