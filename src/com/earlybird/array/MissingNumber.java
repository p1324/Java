package com.earlybird.array;

import java.util.Arrays;

public class MissingNumber {

	//1 2 3 5 6  given ---> sum=17
	
	//1 2 3 4 5 6= n(n+1)/2    =6(7)/2=42/2=21 --- expected
	
	//given sum- expected sum=21-17= 4
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
	//	Arrays.sort(a);
		int max=a[a.length-1];
		
		int expectedSum=max*(max+1)/2; //21
		int actualSum=0;
		
		for (int i=0;i<a.length;i++)
		{
			actualSum=actualSum+a[i]; //1+2+3+5+6=17
		}
		
		int missingNumber=expectedSum-actualSum;
		
		System.out.println("missing nuber is "+missingNumber);

	}

}
