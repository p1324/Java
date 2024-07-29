package com.earlybird.string;

public class Interview {

	public static void main(String[] args) {
		String input = "Tomorrow";
		String output = input.replace('o', '&');
		System.out.println(output);
		
		String s= "This is java what is java";
		System.out.println(s.replaceAll(" ", ""));
		//way2
		String[] words= s.split(" ");
		for(String word:words)
		System.out.print(word);
		
		

	}
}
