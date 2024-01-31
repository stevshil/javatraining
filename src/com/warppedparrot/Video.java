package com.warppedparrot;

public class Video {
	// Private variables are encapsulated and can only be seen and used in this class
	private String title;
	private float price;
	
	private static Integer numberOfVideos=0;
	
	// Class method
	public static Integer getNumberOfVideos() {
		return numberOfVideos;
	}
	
	// Simple constructor
	public Video(String titleIn) {
		// No need to use this as variables are different names
		title = titleIn;
		numberOfVideos++;
	}
	
	// Override of constructor
	public Video(String title, float priceIn) {
		// Use of this to call the other constructor first.
		this(title);
		price = priceIn;
	}
	
	public void setPrice(float priceIn) {
		price = priceIn;
	}
	
	public String getTitle() {
		return title;
	}
	
	public float getPrice() {
		return price;
	}
}