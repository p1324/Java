package com.earlybird.string;

public class RemoveDuplicates2 {

	public static void main(String[] args) {

		String s = "abcabcdefdef";
		//output =abcdef


		String unique = "";

		for (int i = 0; i < s.length(); i++) {
			char c=s.charAt(i);
			//indexof method returns the index of the given char,
			//if given char is not present in string then returns -1
			
			if(unique.indexOf(c)==-1)	
				unique=unique+c;	//abc		
		}
		System.out.println(unique);

	}
}
