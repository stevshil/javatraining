package com.reports;

import java.util.logging.*;

public class reporting {
	public static void main(String[] args) {
		
		FileHandler fh;
		Logger logger = Logger.getLogger("MyLog");
		
		logger.severe("Oh no PANIC!");
		logger.info("Nothing to worry about, all is good");
		
		logger.setLevel(Level.WARNING);
		
		try {
			fh = new FileHandler("C:\\Users\\shill\\MyLog.log",true);
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();  
			fh.setFormatter(formatter);
		} catch(java.io.IOException e) {
			System.out.println("Failed to create/write to logfile: "+e);
		}
        
        logger.warning("That was a close call");
	}
}
