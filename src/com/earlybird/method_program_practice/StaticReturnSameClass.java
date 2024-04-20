package com.earlybird.method_program_practice;

public class StaticReturnSameClass {
	public static int multi(int a, int b) {
		int mul;
		mul = a * b;
		return mul;
	}

	public static int add() {
		
		return 10+20;
	}
	public static void main(String[] args) {
		System.out.println("multiplication is "+ multi(2, 4));
	int out = add();
	System.out.println("addition is "+out);
	}

}
