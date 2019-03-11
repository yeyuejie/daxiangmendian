package com.cncn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {
   @FindBy(xpath="//div[3]/div[1]/div[1]/form/div/button")
   WebElement addbutton;
   
   public ProductListPage(WebDriver driver){
	   PageFactory.initElements(driver, this);
   }
   public void gotoAddProduct(){
	   addbutton.click();
   }
}
