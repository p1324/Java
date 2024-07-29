package com.earlybird.string;

public class A2B3C4 {

	public static void main(String[] args) {

		String input = "a2b3c4";
		char[] allchar = input.toCharArray();
		
		for (int i = 0; i < allchar.length; i++) 
		{
			char currentChar = input.charAt(i);//a
			if (Character.isLetter(currentChar)) 
			{
				int count = 0;
				char nextChar = input.charAt(i + 1);//2
				
				count = Character.getNumericValue(nextChar);//count=2
				
				for (int j = 0; j < count; j++) 
				{
					System.out.print(currentChar);//aa
				}
			}
		}

	}

}
