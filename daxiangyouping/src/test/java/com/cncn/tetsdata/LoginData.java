package com.cncn.tetsdata;

import org.testng.annotations.DataProvider;

public class LoginData {
	 @DataProvider(name="test1")
	    public Object[][] creatData1(){
	    	return new Object[][]{
	    		{"yyj1","1234567"}
	    	};
	    }
    
	 
	 @DataProvider(name="excel_data")
	 public Object[][] ExcelData(){
		  return ReadExcelData.getExcelData("login.xlsx");
	 }
}
