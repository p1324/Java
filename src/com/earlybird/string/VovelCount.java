package com.earlybird.string;

public class VovelCount {

	public static void main(String[] args) {
	String s="abhgdfwueioitquibcnh";
	
	String consonant="";
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
		{
			continue;
		}
		else
		{
			consonant=consonant+s.charAt(i);
		}
	}
	System.out.println(consonant);
	
	
	
	  s=s.replaceAll("[^aeiou]","" ); 
	  System.out.println(s);
	 
	}

}
