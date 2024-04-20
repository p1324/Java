package com.earlybird.array;

public class ArraySorting {

	public static void main(String[] args) {
		int a[]= {2,3,1,52,22,11};
		int temp;
		for(int i=0;i<a.length;i++)//2
		{
			for(int j=i+1;j<a.length;j++)//1
			{
				if(a[i]>a[j])//2>3
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("sorted array in asc order");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
