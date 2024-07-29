package com.earlybird.string;

public class interview2 {

	public static void main(String[] args) {
		String input = "Tomorrow";
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (currentChar == 'o') {
				output.append("&&");
			} else {
				output.append(currentChar);
			}
		}
		System.out.println(output);

	}

}
