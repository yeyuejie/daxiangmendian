package com.cncn.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class LoggerTest {
	@Test
	public void loggerTest01(){
		Logger logger=LogManager.getLogger();
		logger.info("易烊千玺哈哈");
		logger.error("易烊千玺ddddddd");
	}
}
