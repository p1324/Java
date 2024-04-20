package com.earlybird.oops;

public class MethodOverloading {

	public void add() {
		System.out.println("addition is " + (1 + 2));
	}

	public void add(int a, int b) {
		System.out.println("addition of a and b is " + (a + b));
	}

	public void add(int a, int b, int c) {
		System.out.println("addition of a ,c and b is " + (a + b + c));
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add();
		obj.add(2, 4);
		obj.add(3,4,5);
	}

}
//overloading  = same method name diff argument (within class)
//overriding =same method name same arguments    (parent-child)
