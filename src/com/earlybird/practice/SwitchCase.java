package com.earlybird.practice;

import java.util.Scanner;

public class SwitchCase {
	
	public static void day( String day)
	{
		switch (day) {
		case "sunday":
			System.out.println("today is sunday");
			break;
		case "monday":
			System.out.println("today is monday");
			break;
		case "tuesday":
			System.out.println("today is tuesday");
			break;
		case "wednesday":
			System.out.println("today is wednesday");
			break;
		case "thursday":
			System.out.println("today is thursday");
			break;
		case "friday":
			System.out.println("today is friday");
			break;
		case "saturday":
			System.out.println("today is saturday");
			break;
		default:
			System.out.println("invalid case");
		}	
	}
	public static void main(String[] args) {
		//String day = "sunday";
		//SwitchCase obj=new SwitchCase();
		//obj.day(day);
		Scanner scan = new Scanner(System.in);
		System.out.println("enetr day");
		String day=scan.next();

		day(day);
	}
}
