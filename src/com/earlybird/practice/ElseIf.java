package com.earlybird.practice;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks between 0- 100");
		int marks = scan.nextInt();
		scan.close();

		if (marks < 35) {
			System.out.println("student is fail");
		}
		else if (marks >=35 && marks <60) {
			System.out.println("student is passed in second class");
		} else if (marks >=60 && marks <70) 
		{
			System.out.println(" student is passed in first class");
		} else if (marks >= 70 && marks <100) {
			System.out.println("student is passed in distinction");
		} else {
			System.out.println("enter marks between 0 - 100");
		}
		
	}

}
