package com.earlybird.array;

import java.util.Scanner;

public class DynamicArr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
	
	 for (int i=0;i<size;i++)
	 {
		 a[i]=sc.nextInt();
	 }
	 
	 System.out.println("array elements are  ");
		
		  for(int i =0;i<size;i++)
		  { 
			  System.out.println(a[i]);
	      }
		 
	 
		/*
		 * for(int el:a) System.out.println(el);
		 */
	}

}
