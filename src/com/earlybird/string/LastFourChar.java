 package com.earlybird.string;

public class LastFourChar {

	public static void main(String[] args) {
		String s= "www.google.com";
		
		System.out.println(s.substring(s.length()-4, s.length())); // last four
		System.out.println(s.substring(0, 4)); // first four
		
		for(int i=s.length()-4;i<s.length();i++)
		{
			System.out.print(s.charAt(i));
		}

	}

}
