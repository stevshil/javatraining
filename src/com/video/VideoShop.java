package com.video;

import com.video.Manager.*;

public class VideoShop {
	public static void main(String[] args) {
		Video newRelease;
		newRelease = new Video("Lord of the Rings");
		
		newRelease.setPrice(3.99f);
		System.out.println("The movie title is: " + newRelease.getTitle());
		
		double total = 0;
		total += newRelease.getPrice();
		Customer currentCustomer = new Customer("Bob");
		currentCustomer.rent(newRelease);
		
		newRelease.totalCustomers();
		System.out.println("Total customers from Customer: " + currentCustomer.getNumberOfCustomers());
		
		Video newRelease2 = new Video("Tron");
		Video sciFiHit = newRelease;
		
		System.out.println("of appears at position: "+ newRelease.getTitle().indexOf("of"));  // Start count from 0 as it is an array of characters
		System.out.printf("The character at position %d is %c\n", newRelease.getTitle().indexOf("of"), newRelease.getTitle().charAt(newRelease.getTitle().indexOf("of")));
		
		Manager john = new Manager("John");
		System.out.println("Store manager is: " + john.getManager());
		
		Integer i = 1; // Integer object, like String
		int j = i; // Unbox i to a primitive
		i++;
		Integer result = i +2;
		int dual = i + result; // 2 wrapper objects into a primitive
		// j.intValue(); // j is a primitive
		i.intValue();
		
		// Class method called
		System.out.println("Number of videos: " + Video.getNumberOfVideos());
		System.out.println("classMethod called with 2 and 3: " + Video.classMethod(2, 3));
	}
}
