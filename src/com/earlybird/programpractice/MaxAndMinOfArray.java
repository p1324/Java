package com.earlybird.programpractice;

import java.util.Arrays;

public class MaxAndMinOfArray {

	public static void main(String[] args) {

		int a[] = { 6, 7, 1, 2, 3, 4, 5, 9, 0 };

		// write code to print max and min number from array

		Arrays.sort(a);
		// System.out.println(a.length);
		System.out.println("min of array is " + a[0]);
		System.out.println("max of array is " + a[a.length - 1]);
		for (Integer p : a)
			System.out.print(p);
	}

}
