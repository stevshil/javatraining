package com.simple;
import java.util.Scanner;

public class BothHello {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Goodbye, cruel world!");
		
		moreHello();

	}
	
	private static void moreHello() {
		System.out.println("Hello.  Please enter your name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello, " + name);
		scan.close();
	}

}
