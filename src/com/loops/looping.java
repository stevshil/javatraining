package com.loops;

import java.util.Scanner;

public class looping {
	public static void main(String[] args) {
		
		// For loop
		for ( int i = 0; i < 10; i++ ) {
			// Declare the starting variable and value
			// Declare the logic that causes the loop to stop
			// Declare what happens to change the variable
			System.out.println("The value of i is: "+i);
			// The loop runs 10 times printing 0 - 9
		}
		
		// While loop that exits when user specifies 'n'
		char response = 'y';
		Scanner scan = new Scanner(System.in);
		
		while ( response == 'y' ) {
			System.out.printf("Again (y/n)? ");
			response = scan.nextLine().charAt(0);
		}
		
		System.out.println("Thank you");
		
		double numA = 5;
		while ( numA > 0 ) {
			numA*=0.5;
			System.out.println(numA);
		}
	}
}
