package com.earlybird.programpractice;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=153;
		int last,sum=0;
		while(num>0)
		{
			last=num%10;
			sum=sum+(last*last*last);
			num=num/10;
		}
		if(sum==153)
		{
			System.out.println("num is armstrong   "+sum);
		}
		else
		{
			System.out.println("num is not armstrong   "+sum);
		}
	}

}
