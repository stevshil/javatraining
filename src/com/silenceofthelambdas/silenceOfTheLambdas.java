package com.myjava;

public class silenceOfTheLambdas {
	
	@FunctionalInterface
	interface processThis<T> {
		public T operation(T a, T b);
	}

	public static void main(String[] args) {
		
		// processThis add = (x,y) -> x+y;
		processThis<Integer> add = (Integer x, Integer y) -> x+y;
		processThis<String> addString = (String x, String y) -> x+y;
		
		String resultS = addString.operation("Hello"," World");
		int result = add.operation(20, 30);
		System.out.println(result);
		System.out.println(resultS);
		
		// int multiple = (int a, int b) -> a*b;
		processThis<Integer> multiply = (Integer x, Integer y) -> x*y;
		
		int c=20;
		int d=30;
		int result2 = multiply.operation(c, d);
		System.out.println(result2);
		
		// String output = (String p1, String p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);

	}

}
