package com.cncn.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   @FindBy(id="j_username")
    WebElement username;
   @FindBy(id="j_password")
    WebElement password;
   @FindBy(xpath="//button[@class='login-btn']")
    WebElement loginbutton;
   @FindBy(xpath="//span[@class='login-name']")
   WebElement login_result_text;
   
   public LoginPage(WebDriver driver){
	   PageFactory.initElements(driver, this);
   }
   public void login(String urname,String psword){
	   username.sendKeys(urname);
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	   password.sendKeys(psword);
	   loginbutton.click();
   }
   public void loginAssert(String expected){
	   assertEquals(login_result_text.getText(), expected);
   }
}
