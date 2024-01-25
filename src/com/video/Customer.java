package com.video;

public class Customer {
	private String name;
	private Video rentedVideo;
	// The protected variable can be used by any class in this video package, a class variable - can be used without object
	protected static Integer numberOfCustomers=0;
	
	public static Integer getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer(String nameIn) {
		name = nameIn;
		numberOfCustomers++;
	}
	
	public void rent(Video rentedVideoIn) {
		rentedVideo = rentedVideoIn;
	}
}