package com.vars;
import java.util.Scanner;

public class HelloAge2 {
	public static void main(String[] args) {
		Integer coolAge=42;
		Integer ageIn=0;
		
		System.out.printf("Hello.  Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello, " + name);
		
		System.out.printf("What is your age: ");
		try {
			ageIn = Integer.parseInt(scan.nextLine());
		} catch(Exception e) {
			System.out.println("You did not enter a number, doh!");
			System.out.printf("This is the reason: %s\n", e.toString());
			// We could just exist here with an error - OS requires > 0
			// System.exit(1);
		}
		
		if ( ageIn == coolAge ) {
			System.out.printf("The meaning of life the universe and everything is %d",ageIn);
		} else if (ageIn > 0) {
			System.out.printf("That is a good age to be %d",ageIn);
		} else if ( ageIn == 0 ) {
			System.out.println("Hey new born!");
		} else {
			System.out.printf("I have no idea what age %d is.", ageIn);
		}
		
		scan.close();
	}

}
