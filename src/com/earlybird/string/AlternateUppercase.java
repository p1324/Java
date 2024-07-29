package com.earlybird.string;

public class AlternateUppercase {

	public static void main(String[] args) {
		String s = "Ramaakrushna";
		String s1 = s.toLowerCase();
		StringBuilder sb = new StringBuilder();
		/*
		 * i/p=Ramakrushna; o/p=RaMaKrUsHnA
		 */
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 == 0)
			{
				sb.append(s1.toUpperCase().charAt(i));
			} 
			else 
			{
				sb.append(s1.charAt(i));
			}
		}
		System.out.println(sb);
	}

}
