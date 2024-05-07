package com.earlybird.array;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		Arrays.sort(a);
		int max=a[a.length-1];
		
		int expectedSum=max*(max+1)/2;
		int actualSum=0;
		
		for (int i=0;i<a.length;i++)
		{
			actualSum=actualSum+a[i];
		}
		
		int missingNumber=expectedSum-actualSum;
		
		System.out.println("missing nuber is "+missingNumber);

	}

}
