package com.earlybird.array;

public class SimilarValuesInBothArray {

	public static void main(String[] args) {
		int a[]= {2,6,7,8,6,7};
		int b[]= {9,3,4,7,2};
		
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
