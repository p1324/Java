package com.earlybird.string;

public class ReverseSentence {
	public static void main(String[] args) {
		String s = "this is string";
		String[] s1 = s.split(" ");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
	}
}
