package cz.jakubstastny;

import org.apache.log4j.Logger; 
import org.apache.log4j.PropertyConfigurator;

public class Main {

	private static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		PropertyConfigurator.configureAndWatch("log4j.properties");
		
	    logger.trace("Trace Message!");
	    logger.debug("Debug Message!");
	    logger.info("Info Message!");   // log4j.propersties -> log4j.appender.A1.Threshold=INFO
	    logger.warn("Warn Message!");
	    logger.error("Error Message!");
	    logger.fatal("Fatal Message!");

	}

}
