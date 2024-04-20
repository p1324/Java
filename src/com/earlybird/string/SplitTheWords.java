package com.earlybird.string;

public class SplitTheWords {

	public static void main(String[] args) {

		String s = "I am the java lang";
		
		String[] words = s.split(" ");

		/*
		 * for (String oneByOne : words)
		 *  System.out.println(oneByOne);
		 */
		
		for(int i=0; i<words.length;i++)
		{
			System.out.println(words[i]);
		}
	}

}
