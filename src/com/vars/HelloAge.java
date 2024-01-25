package com.vars;
import java.util.Scanner;

public class HelloAge {
	public static void main(String[] args) {
		Integer Age=42;
		
		System.out.printf("Hello.  Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello, " + name);
		
		System.out.printf("What is your age: ");
		Integer age = Integer.parseInt(scan.nextLine());
		
		if ( age == Age ) {
			System.out.printf("The meaning of life the universe and everything is %d",Age);
		} else if (age > 0) {
			System.out.printf("That is a good age to be %d",age);
		} else {
			System.out.printf("I have no idea what age %d is.", age);
		}
		
		scan.close();
	}

}
