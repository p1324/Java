package com.earlybird.programpractice;

public class Armstrong {

	public static void main(String[] args) {
		
		int num=153;//1^3+5^3+3^3//1+125+27=153
		int last,sum=0;
		while(num>0)
		{
			last=num%10;  //3 5 1
			sum=sum+(last*last*last);//27+125+1
			num=num/10;//0
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
