package com.cncn.utils;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.service.DriverService;

public class WebDriverUtil {
      static DriverService service;
      static WebDriver driver;
//      public static void main(String[] args) {
//		WebDriverUtil.startService("chrome");
//		WebDriverUtil.getDriver("chrome").get("https://ddsale.cncn.net/opew/index");
//		
//	}
      public static void startService(String browser){
    	  if(browser!=null){
    		  if("chrome".equalsIgnoreCase(browser)){
    			  service=new ChromeDriverService.Builder()
    					  .usingDriverExecutable(new File("drivers\\chromedriver.exe"))
    					  .usingAnyFreePort()
    					  .build();
    		  }else if("firefox".equalsIgnoreCase(browser)){
    			  service=new GeckoDriverService.Builder()
    					  .usingDriverExecutable(new File("drivers\\geckodriver.exe"))
    					  .usingAnyFreePort()
    					  .build();
    		  }else if("ie".equalsIgnoreCase(browser)){
    			  service=new InternetExplorerDriverService.Builder()
    					  .usingDriverExecutable(new File("drivers\\IEDriverServer.exe"))
    					  .usingAnyFreePort()
    					  .build();
    		  }
    	  }
    	  try {
			service.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
      }
      public static WebDriver getDriver(String browser,Class<?> clazz){
    	  if("chrome".equalsIgnoreCase(browser)){
    		  driver=new RemoteLogWebDriver(service.getUrl(), DesiredCapabilities.chrome(),clazz);
    	  }
    	  if("firefox".equalsIgnoreCase(browser)){
    		  driver=new RemoteLogWebDriver(service.getUrl(), DesiredCapabilities.firefox(),clazz);
    	  }
    	  if("ie".equalsIgnoreCase(browser)){
    		  driver=new RemoteLogWebDriver(service.getUrl(), DesiredCapabilities.internetExplorer(),clazz);
    	  }
		return driver;
      }
      public static void stopService(){
    	  if(service!=null){
    		service.stop();  
    	  }
      }
      
}
