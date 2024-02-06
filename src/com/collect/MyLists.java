package com.myjava;

public class MyLists {
	public static void main(String[] args) {
		int[] numArray = new int[10];
		int digits[] = new int[10];
//		int[] moreNums = new int[]; // Not valid must supply a dimension.
//		int[] moreNums = digits.clone(); // Use clone to make a copy
		int[] moreNums = digits; // Reference to the same array.
		
		for (int x = 0; x <= digits.length - 1; x++ ) {
			digits[x]=x;
		}
		
		moreNums[6] = 42;
		
		System.out.println(digits[6]);
		
		for (int i : moreNums) {
			System.out.println(i);
		}
		
		System.out.println(args[0]+"-"+args[1]);
	}
}
