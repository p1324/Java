package com.earlybird.practice;

import java.util.Scanner;

public class Nested_If_UsingScanner {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Enter username");
		String user=scan.next();
		System.out.println("Enter pass");
		String pass=scan.next();
		scan.close();

		if (user.equals("Pradip")) {
			
			if (pass.equals("1234")) {
				System.out.println("login successful");
			} else {
				System.out.println("Invalid Pass");
			}

		} else {
			System.out.println("Invalid user");
		}

	}

}
