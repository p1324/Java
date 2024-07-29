package com.earlybird.string;

public class StringParts {

	public static void main(String[] args) {
		String str[]= {"amit:3","dilip:9","asha:5","raj:1"};
		//int numberOfWords = 0;
		String name="";
		int number=0;
		for(String s:str)
		{
			String[] parts=s.split(":");
			// numberOfWords=parts.length; //2 
			 name=parts[0];
			 number=Integer.parseInt(parts[1]);
			 
			 System.out.println(name +"   and  " +number);
			 
		}
	//System.out.println(name);
		//System.out.println(numberOfWords);//2
	}

}
