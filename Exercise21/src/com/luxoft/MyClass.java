package com.luxoft;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class MyClass {
	public static void main(final String args[]) {
		try {
			//TODO: get the LogManager
			LogManager lm = null;
			//TODO: get the Logger with a name
			Logger logger;
			
			//TODO: attach FileHandler to the logger. Set XML formatter
			
			//TODO: set level Level.INFO to the logger
			
			
			//TODO: log some information using different log levels, Level.INFO, Level.SEVERE, etc

			logger.log(Level.INFO, "test 1");
			
			//TODO: close the file handler

		} catch (Exception e) {
			System.out.println("Exception thrown: " + e);
			e.printStackTrace();
		}
	}
}
