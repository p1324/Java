package com.earlybird.string;

public class RemoveAlphabet {

	public static void main(String[] args) {
		

		String s="Ja@v3a";
		 String output="";
		for(int i=0;i<s.length();i++)
		{
		  	char c=s.charAt(i);
			/*
			 * if(Character.isLetter(c)) { output=output+s.charAt(i); }
			 */
			
			
			  if(c>='a'&& c<='z'||c>='A'&&c<='Z') { output=output+s.charAt(i); }
			 
		}
		System.out.println(output);
	}

}
