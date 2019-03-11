package com.cncn.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	@FindBy(xpath="//div[2]/ul/li[1]/a")
	   WebElement home_page;
	
	@FindBy(xpath="//div[2]/ul/li[2]/a")
	   WebElement fund_page;
	@FindBy(xpath="//div[3]/div[2]/ul/li[1]/a")
	   WebElement cash_management;
	@FindBy(xpath="//div[3]/div[2]/ul/li[1]/ul/li[1]/a")
	  WebElement cash_inquire;
	@FindBy(xpath="//div[3]/div[2]/ul/li[1]/ul/li[2]/a")
	  WebElement cash_check;
	@FindBy(xpath="//div[3]/div[2]/ul/li[2]/a")
	  WebElement deal_inquire;
	@FindBy(xpath="//div[3]/div[2]/ul/li[3]/a")
	  WebElement account;
	@FindBy(xpath="//div[3]/div[2]/ul/li[4]/a")
	  WebElement day_account;
	
	@FindBy(xpath="//div[2]/ul/li[3]/a")
	   WebElement user_page;
	@FindBy(xpath="//div[3]/div[2]/ul/li[1]/a")
	   WebElement usermessage_management;
	@FindBy(xpath="//div[3]/div[2]/ul/li[2]/a")
	   WebElement supplier_management;
	
    @FindBy(xpath="//div[2]/ul/li[4]/a")
       WebElement business_page;
    @FindBy(xpath="//div[3]/div[2]/ul/li[1]/a")
      WebElement product_management;
    @FindBy(xpath="//div[3]/div[2]/ul/li[1]/ul/li[1]/a")
    WebElement product_list;
    @FindBy(xpath="//div[3]/div[2]/ul/li[1]/ul/li[2]/a")
    WebElement product_check;
    @FindBy(xpath="//div[3]/div[2]/ul/li[2]/a")
    WebElement consult_appraise;
    @FindBy(xpath="//div[3]/div[2]/ul/li[3]/a")
    WebElement order_management;
    @FindBy(xpath="//div[3]/div[2]/ul/li[4]/a")
    WebElement supplier_notice;
    
    @FindBy(xpath="//div[2]/ul/li[5]/a")
       WebElement client_page;
    @FindBy(xpath="//div[3]/div[2]/ul/li[1]/a")
    WebElement notice;
    @FindBy(xpath="//div[3]/div[2]/ul/li[2]/a")
    WebElement rate;
    @FindBy(xpath="//div[3]/div[2]/ul/li[3]/a")
    WebElement message_notice;
    @FindBy(xpath="//div[3]/div[2]/ul/li[3]/a")
    WebElement message_push;
    
    @FindBy(xpath="//div[2]/ul/li[6]/a")
       WebElement system_page;
    
    public IndexPage(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
    public void gotohomepage(){
    	home_page.click();
    }
    public void gotofundpage(){
    	fund_page.click();
    }
    public void gotocashmanagement(){
    	cash_management.click();
    }
    public void gotocashinquire(){
    	cash_inquire.click();
    }
    public void gotocashcheck(){
    	cash_check.click();
    }
    public void gotodealinquire(){
    	deal_inquire.click();
    }
    public void gotoaccount(){
    	account.click();
    }
    public void gotodayaccount(){
    	day_account.click();
    }
    public void gotouserpage(){
    	user_page.click();
    }
    public void gotousermessage(){
    	usermessage_management.click();
    }
    public void gotosupplier(){
    	supplier_management.click();
    }
    public void gotobusinesspage(){
    	business_page.click();
    }
    public void gotobusinessmanagement(){
    	product_management.click();
    }
    public void gotoproductlist(){
    	product_list.click();
    }
    public void gotoproductcheck(){
    	product_check.click();
    }
    public void gotoconsult(){
    	consult_appraise.click();
    }
    public void gotoordermanagement(){
    	order_management.click();
    }
    public void gotosuppliernotice(){
    	supplier_notice.click();
    }
    public void gotoclientpage(){
    	client_page.click();
    }
    public void gotonotice(){
    	notice.click();
    }
    public void gotorate(){
    	rate.click();
    }
    public void gotomessagenotice(){
    	message_notice.click();
    }
    public void gotomessagepush(){
    	message_push.click();
    }
    public void gotosystempage(){
    	system_page.click();
    }
}
