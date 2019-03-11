package com.cncn.utils;

import java.net.URL;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteLogWebDriver extends RemoteWebDriver{
   public Logger logger;
   public RemoteLogWebDriver(URL url,Capabilities cap,Class<?> clazz){
	   super(url, cap);
	   logger=LogManager.getLogger(clazz);
   }
   @Override
	public WebElement findElementByXPath(String using) {
	   try{
	   WebElement element=super.findElementByXPath(using);
	    logger.info(using+"定位已找到元素");
		return element;
	   }catch(NoSuchElementException e){
		   logger.info(using+"定位未找到元素");
		   throw e;
	   }
	}
}
