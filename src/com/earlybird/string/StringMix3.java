package com.earlybird.string;

public class StringMix3 {

	public static void main(String[] args) {

		String s = "Java";
		
//o/p=j2a2v2a2
		String mix = "";
		char c[] = s.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			mix = mix + c[i]; // j2a
			mix = mix + "2"; //j2a2
		}
		System.out.println(mix);
	}

}
