package com.earlybird.string;

public class Interview3withoutStringBuilder {

	public static void main(String[] args) {

		String input = "Tomorrow";
		String output = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++)
		{
			char currentChar = input.charAt(i);
			if (currentChar == 'o') 
			{
				count++;
				for (int j = 0; j < count; j++)
					output = output + '&';
			} 
			else 
			{
				output = output + input.charAt(i);
			}
		}
		System.out.println(output);

	}

}
