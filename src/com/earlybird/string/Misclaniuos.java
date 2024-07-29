package com.earlybird.string;

public class Misclaniuos {

	public static void main(String[] args) {

		String s = "what is java";
		
		/*
		 * // o/p= avaj si tahw
		 * 
		 * String rev = ""; for (int i = s.length() - 1; i >= 0; i--)
		 * 
		 * { rev = rev + s.charAt(i); } System.out.println(rev);
		 */
		String s1 = "what is java";
		//o/p= java is what
		
		String[] s2=s1.split(" ");
		
		for(int i=s2.length-1;i>=0;i--)
		{
			System.out.print(s2[i]+" ");
		}		
		
	}

}
