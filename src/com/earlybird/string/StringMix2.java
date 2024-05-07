package com.earlybird.string;

public class StringMix2 {
	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz";

		String mix = "";

		for (int i = 0; i < a.length() || i < b.length(); i++) {
			
			if (i < a.length())
				mix = mix + a.charAt(i);
			if (i < b.length())
				mix = mix + b.charAt(i);
		}
		System.out.print(mix);
	}
}
