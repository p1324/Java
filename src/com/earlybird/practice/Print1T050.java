package com.earlybird.practice;

public class Print1T050 {

	public static void main(String[] args) {
		printNum();
	}

	public static void printNum() {
		int n = 0;
		if (n < 51) {
			
			System.out.println(n+1);
			printNum();
			n++;
		}
	}// not working
	
}
