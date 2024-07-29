package com.earlybird.string;

public class StringSpecial {

	public static void main(String[] args) {
		

//write java program for below scinario:
//input- i am#$@! ram
//output- i ma#$@! mar
		
		String s="am@#$%";
	
		
		String spcl=s.replaceAll("[a-zA-Z0-9]", "");
		
		if(spcl.isEmpty())
		{
			System.out.println(spcl+"spcl is empty");
		}
		else
		{
			System.out.println("spcl is not empty-->   "+spcl);
		}
		
		
		
		// split words  by space and store in array
		// take words from array one by one and reverse them
		//before reversing the word check if it conatin special char

	}

}
