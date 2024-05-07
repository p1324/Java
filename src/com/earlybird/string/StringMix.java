package com.earlybird.string;

public class StringMix {

	public static void main(String[] args) {
		String a = "abcdef";
		String b = "xyz";

		char a1[] = a.toCharArray();
		char b1[] = b.toCharArray();

		String mix = "";

		for (int i = 0; i < a1.length || i < b1.length; i++) {
			
			if (i < a1.length)
				mix = mix + a1[i];
			if (i < b1.length)
				mix = mix + b1[i];
		}
		System.out.print(mix);
	}
}
