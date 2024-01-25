package com.vars;
import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {
		double num1;
		double num2;

		System.out.printf("Please enter first number: ");
		Scanner scan = new Scanner(System.in);
		num1 = Double.parseDouble(scan.nextLine());
		System.out.printf("Please enter second number: ");
		num2 = Double.parseDouble(scan.nextLine());
		
		System.out.printf("%f + %f = %f\n", num1, num2, addNumbers(num1,num2));
		System.out.printf("%f - %f = %f\n", num1, num2, subNumbers(num1,num2));
	}
	
	private static double addNumbers(double a, double b) {
		Integer c=42;
		// c is not available outside of this function
		return a+b;
	}
	
	private static double subNumbers(double a, double b) {
		return a-b;
	}
}
