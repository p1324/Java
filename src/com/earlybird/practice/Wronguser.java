package com.earlybird.practice;

import java.util.Scanner;

public class Wronguser {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter user");
		String user=scan.nextLine();
		System.out.println("Enter Pass");
		String pass=scan.nextLine();
		
		if(user=="Pradip") 
		{
			if(pass=="1234")
			{
				System.out.println("login successful");
			}
			else
			{
				System.out.println("Invalid Pass");
			}
			
		}
		else
		{
			System.out.println("Invalid user");
		}

	}

}
