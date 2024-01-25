package com.arrayexamples;

import java.util.Arrays;

public class MyArrays {
	public static void main(String args[]) {
		int[] SampleInts = new int[5]; // 5 elements of 0
		SampleInts[0]=42;
		SampleInts[2]=86;
		// SampleInts[5]=83;  // Out of bounds as this is element 6
		for (int x=0; x <= SampleInts.length-1; x++) {
			// Note for condition must be -1 of the length as we count from 0 but length counts from 1
			System.out.printf("%d,",SampleInts[x]);
		}
		System.out.println("");
		
		int[] MoreInts = {3,5,7,9};
		for (int x=0; x <= MoreInts.length-1; x++) {
			System.out.printf("%d,",MoreInts[x]);
		}
		System.out.println("");
		
		int[] AnotherList = SampleInts; // reference
		System.out.println(Arrays.toString(AnotherList));
		// Change original
		SampleInts[1]=2;
		System.out.println(Arrays.toString(AnotherList));  // Note change
		
		int[] NewList = Arrays.copyOf(MoreInts, MoreInts.length);
		System.out.println(Arrays.toString(NewList));
		// Change NewList
		NewList[2]=23;
		System.out.println(Arrays.toString(NewList));
		System.out.println(Arrays.toString(MoreInts));  // Didn't change
	}
}
