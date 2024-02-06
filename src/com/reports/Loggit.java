package com.myjava;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Logme {

	public static void main(String[] args) {
		
		FileHandler fh;
		Logger logger = Logger.getLogger("MyLog");
		String abc = "xyz";
		
		System.out.println( abc.length() );
		
		logger.setLevel(Level.WARNING);
		
		try {
			fh = new FileHandler("C:\\Users\\wasadmin\\MyLog2.xml");
			logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			XMLFormatter formatterXML = new XMLFormatter();
			fh.setFormatter(formatterXML);
		} catch (IOException e) {
			System.out.println("ERROR: "+e.toString());
		}
		
		logger.severe("Oh no PANIC!");
		logger.warning("That was a close call");
		logger.info("Nothing to worry about, move a long");

	}

}
