package com.earlybird.string;

public class Interview3 {

	public static void main(String[] args) {
		String input = "Tomorrow";
		//output=T&m&&rr&&&w

		StringBuilder output = new StringBuilder();
		
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (currentChar == 'o') {
				{
					count++;
					for(int j=0;j<count;j++)
					output.append("&");										
				}
				
			} else {
				output.append(currentChar);
			}
		}
		System.out.println(output);


	}

}
