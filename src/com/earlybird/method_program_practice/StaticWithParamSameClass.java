package com.earlybird.method_program_practice;

public class StaticWithParamSameClass {
	public static void add(int a) {
		int sum;
		sum = a + a;
		System.out.println("sum of a and a is " + sum);
	}
	public static void sub(int a,int b) {
		int sub;
		sub = a - b;
		System.out.println("sub of a and b is " + sub);
	}

	public static void main(String[] args) {
		add(11);
		sub(20, 11);
	}

}
