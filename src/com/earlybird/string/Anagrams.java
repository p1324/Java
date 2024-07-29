package com.earlybird.string;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s= "Grab";
		String s1="Brag";
		
		char c[]=s.toLowerCase().toCharArray();
		char c1[]=s1.toLowerCase().toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(c1);
		
		if (Arrays.equals(c, c1))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not anagram");

	}

}
