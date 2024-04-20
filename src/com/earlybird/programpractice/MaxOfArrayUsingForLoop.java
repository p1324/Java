package com.earlybird.programpractice;

public class MaxOfArrayUsingForLoop {
	public static void main(String[] args) {
		int a[] = { 6, 7, 1, 2, 3, 4, 9 };
		System.out.println(a);

		int maxOfArray = a[0];
		int minOfArray = a[0];

		for (int i = 1; i < a.length; i++) {

			if (a[i] > maxOfArray) {
				maxOfArray = a[i];
			}

			if (a[i] < minOfArray) {
				minOfArray = a[i];
			}
		}
		System.out.println("max of array " + maxOfArray);
		System.out.println("min of array " + minOfArray);
	}

}
