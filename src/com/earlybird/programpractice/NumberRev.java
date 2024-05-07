package com.earlybird.programpractice;

public class NumberRev {

	public static void main(String[] args) {
		int num=123;
		int last,rev = 0;
		while(num>0)//12>0//1>0//0>0
		{
			last=num%10;//3//2//1
			rev=rev*10+last;//3//32//321
			num=num/10;//12//1//0
		}
		System.out.println(rev);
		System.out.println(1/10);//0
	}

}
