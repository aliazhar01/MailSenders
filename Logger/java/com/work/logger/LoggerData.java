package com.work.logger;

import org.apache.log4j.Logger;

public class LoggerData {
	static Logger logger;
	
	static {
		logger=logger.getLogger("LoggerData");
	}
	
	
	public static void main(String[] args) {
		
		logger.debug("hello");
		logger.debug("Ali");
		demo();
		
		
	}
	public static void demo() {
		logger.trace("trace");
		logger.trace("warning");
		logger.trace("info");
		logger.trace("fatal");
		
	}

}
