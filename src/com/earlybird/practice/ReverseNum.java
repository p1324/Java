package com.earlybird.practice;

public class ReverseNum {

	public static void main(String[] args) {
		/*
		 * int n=123; int rev = 0; int last; while(n>0)//12>0 { last=n%10;//1
		 * rev=rev*10+last;//32 n=n/10;//1 } System.out.println(rev);
		 */

		int n = 123;
		
		int rev = 0;
		int last;
		String rev1="";
		while (n > 0)

		{
			last = n % 10;
			rev1 = rev1  + last;
			n = n / 10;
		}
		System.out.println(rev1);

	}

}
