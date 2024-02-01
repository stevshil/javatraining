package com.silenceofthelambdas;

public class lambs {
	
	interface processThis {
		public int operation(int a, int b);
	}
	
	public static void main(String[] args) {
		
		processThis add = (x,y) -> x+y;
		processThis subtract = (x,y) -> x-y;
		
		int result = add.operation(20,30);
		int result2 = subtract.operation(50, 20);
		
		System.out.println(result);
		System.out.println(result2);
	}
}
