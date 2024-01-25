package com.video.Manager;

import com.video.Video;

public class Manager {
	private String name;
	private String storeName;
	
	public Manager(String nameIn) {
		name = nameIn;
	}
	
	public void setStore(String storeName) {
		// Using this as we are using the same name for the variables, so we differentiate class from parameter
		this.storeName = storeName;
	}
	
	public String getManager() {
		return name;
	}
	
	public String getStore() {
		return storeName;
	}
}