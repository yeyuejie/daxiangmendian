package com.cncn.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jacob.com.LibraryLoader;

import autoitx4java.AutoItX;

public class AddProductPage {
   @FindBy(xpath="//table/tbody/tr/td[2]/input")
   WebElement product_name;
   @FindBy(xpath="//table/tbody/tr/td[4]/input[1]")
   WebElement supplier;
   @FindBy(xpath="//table/tbody/tr/td[4]/a")
   WebElement lookfor_button;
   @FindBy(xpath="//table/tbody/tr[2]/td[2]/select[1]")
   WebElement supplier_catalog_one;
   @FindBy(xpath="//table/tbody/tr[2]/td[2]/select[2]")
   WebElement supplier_catalog_two;
   @FindBy(xpath="//table/tbody/tr[3]/td[2]/select[1]")
   WebElement platform_catalog_one;
   @FindBy(xpath="//table/tbody/tr[3]/td[2]/select[2]")
   WebElement platform_catalog_two;
   @FindBy(xpath="//table/tbody/tr[3]/td[4]/input")
   WebElement birthpalce;
   @FindBy(xpath="//table/tbody/tr[4]/td[2]/div[1]/ul/li")
   WebElement small_picture;
   @FindBy(xpath="//table/tbody/tr[5]/td[2]/div[1]/ul/li[1]")
   WebElement slide_picture;
   @FindBy(xpath="//button[@class='ui-button ui-button-primary J_add']")
   WebElement addword;
   @FindBy(xpath="//div[2]/div[2]/button[2]")
   WebElement addpictures;
   @FindBy(id="doProduct")
   WebElement to_product_setting;
   @FindBy(xpath="//input[@id='retailPrice']")
   WebElement real_price;
   @FindBy(xpath="//input[@id='primaryPrice']")
   WebElement primary_price;
   @FindBy(xpath="//input[@id='cqPrice']")
   WebElement dist_profit;
   @FindBy(xpath="//input[@id='stockNumber']")
   WebElement num;
   @FindBy(xpath="//input[@id='virtualSaleNum']")
   WebElement virtual_salenum;
   @FindBy(xpath="//table/tbody/tr[5]/td[2]/div[1]/ul/li")
   WebElement postpicture;
   @FindBy(xpath="//div[3]/div/button[1]")
   WebElement submit_button;
   
   public AddProductPage(WebDriver driver){
	   PageFactory.initElements(driver, this);
   }
   public void inputProductName(String name){
	   product_name.sendKeys(name);
   }
   public void inputSupplier(String spaccount){
	   supplier.sendKeys(spaccount);
	   lookfor_button.click();
   }
   public void selectspcatalogone(int n){
	   supplier_catalog_one.click();
	   Select select=new Select(supplier_catalog_one);
	   select.selectByIndex(n);
   }
   public void selectspcatalogtwo(int n){
	   supplier_catalog_two.click();
	   Select select=new Select(supplier_catalog_two);
	   select.selectByIndex(n);
   }
   public void inputbirthplace(String place){
	   birthpalce.sendKeys(place);
   }
   public void addSmallPicture(){
	   small_picture.click();
	   File file=new File("lib", "jacob-1.18-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX x=new AutoItX();
		x.winActivate("打开");
		x.winWaitActive("打开");
		x.controlSend("打开", "", "Edit1", "f:\\1.png");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		x.controlClick("打开", "", "Button1");
   }
   public void addSlidePicture(){
	   slide_picture.click();
	   File file=new File("lib", "jacob-1.18-x64.dll");
		System.setProperty(LibraryLoader.JACOB_DLL_PATH, file.getAbsolutePath());
		AutoItX x=new AutoItX();
		x.winActivate("打开");
		x.winWaitActive("打开");
		x.controlSend("打开", "", "Edit1", "f:\\2.jpg");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		x.controlClick("打开", "", "Button1");
   }
   
   
   public void toProductSetting(){
	   to_product_setting.click();
   }
   public void inputRealPrice(String n){
	   real_price.sendKeys(n);
   }
   public void inputPriPrice(String n){
	   primary_price.sendKeys(n);
   }
   public void inputDistProfit(String n){
	   dist_profit.sendKeys(n);
   }
   public void inputNum(String n){
	   num.sendKeys(n);
   }
   public void inputVirNum(String n){
	   virtual_salenum.sendKeys(n);
   }
   public void clickSubmit(){
	   submit_button.click();
   }
   
   
   
   
   
   
   
   
}
