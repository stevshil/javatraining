package com.simple;
import java.util.Scanner;

public class SayHello {
	public static void main(String[] args) {
		System.out.println("Hello.  Please enter your name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hello, " + name);
		scan.close();
	}

}
