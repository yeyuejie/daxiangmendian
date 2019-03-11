package com.cncn.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest1 {
	@Test
	public void logTest001(){
		Logger logger=LogManager.getLogger("LoggerTest1");
		logger.error("大兵小将哈哈哈");
		logger.info("大兵小将infoddssss");
	}

}
