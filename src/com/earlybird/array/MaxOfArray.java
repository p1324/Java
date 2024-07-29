package com.earlybird.array;

import java.util.Scanner;

public class MaxOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter array element");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		// just to print array
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
//to find max and min of array

		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {

			{
				if (a[i] > max) {
					max = a[i];
				} else if (a[i] < min) {
					min = a[i];
				}

			}

		}
		System.out.println();
		System.out.println("max of array is " + max);
		System.out.println("min of array is " + min);

	}
}
