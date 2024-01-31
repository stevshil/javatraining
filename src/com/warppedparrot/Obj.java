package com.warppedparrot;

public class Obj {
	public static void main(String[] args) {
		Object myvideo = new Video("Tron");
		Object x = new Object();
		// myvideo.getTitle(); // Generates compile error as getTitle() undefined
		String theTitle=((Video)myvideo).getTitle(); // Works OK as we need to explicitly cast the object
		System.out.println(theTitle);
		
		if (myvideo instanceof Video) {
			System.out.println("The variable myvideo is an instance of Video class");
		} else {
			System.out.println("The variable myvideo is NOT an instance of Video class");
		}
		
		if (x instanceof Video) {
			System.out.println("The variable x is an instance of Video class");
		} else {
			System.out.println("The variable x is NOT an instance of Video class");
		}
	}
}