package com.vars;

public class TypeConversions {
	public static void main(String[] args) {
		byte byteA = 127; // -128 to 127 : above this will generate a compile error
		short shortB = 32640; // -32,768 to 32,767
		int intC = 2_147_451_007; // -2147483648 to 2147483647
		long longD = 9223372034707324800L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float floatE = 10.32f; // 3.4e−038 to 3.4e+038
		double doubleF = 43.435344;
		double doubleTest = Double.MAX_VALUE;
		
		short shortA = byteA; // No issue putting byte into short
		// byte byteB = shortB; // IDE spots issue, but will also be a compile issue
		
		System.out.printf("Byte and short: %d\n",byteA+shortB);
		System.out.printf("Short and int: %d\n",shortB+intC);
		System.out.printf("Short and int: %d\n",intC+longD);
		
		System.out.printf("1 & 1 = %d\n", 1 & 1);
		System.out.printf("1 & 0 = %d\n", 1 & 0);
		
		// Overflow
		doubleTest += Math.pow(2.0, 969);
		System.out.println(doubleTest);
		doubleTest += Math.pow(2.0, 970);
		System.out.println(doubleTest);
		
		// Underflow - Underflow occurs when the exponent, not the value, gets too low to be represented, so 0.0 results. Divide by 2 instead to get underflow.
		doubleTest = Double.MIN_VALUE;
		System.out.println(doubleTest);
		doubleTest--;
		System.out.println(doubleTest);
		doubleTest = Double.MIN_VALUE;
		doubleTest /= 2;
		System.out.println(doubleTest);
		
		// https://stackoverflow.com/questions/48388497/overflow-and-underflow-in-java-float-and-double-data-types
		
		// Ternary
		int meaningOfLife = 42;
		int Life = 42;
		String result;
		
		result = meaningOfLife == Life ? "It is true that 42 is the meaning of Life" : "It is not the same as the meaning of Life";
		System.out.println(result);
		result = meaningOfLife == 0 ? "It is true that 42 is the meaning of Life" : "It is not the same as the meaning of Life";
		System.out.println(result);
	}
}
