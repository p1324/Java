package com.earlybird.string;

public class AddNumFromString {

	public static void main(String[] args) {
		String s= "abc1425";
		String s1=s.replaceAll("[a-z]", "");
		System.out.println("numbers in string--->"+s1);
		int num=Integer.parseInt(s1);
		int sum = 0,last;
		
		while(num>0)
		{
			last=num%10;
			sum=sum+last;
			num=num/10;
		}
System.out.println("sum of all number present in a string:--> "+sum);
	}

}
