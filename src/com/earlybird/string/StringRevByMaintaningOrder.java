package com.earlybird.string;

public class StringRevByMaintaningOrder {

	public static void main(String[] args) {

		String s = "what is java";

		String[] words = s.split(" ");

		for (int i = 0; i < words.length; i++) {
			String word = words[i]; // what
			String rev = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
				//s1[i] = emp;
			}
			System.out.print(rev+" ");

		}

		/*
		 * for (String s2 : s1)
		 * 
		 * { System.out.print(s2+" "); }
		 */

	}

}
