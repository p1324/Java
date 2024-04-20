package com.earlybird.practice;

public class Nonstatic {

	int a = 10;   // non static global variable
	static int b = 10;  // static global variable
	public static void main(String[] args) {

		// System.out.println(a);
		// can not access non static variable in static method.

		// static int z=10;
		// can not declare static variable in static method

		System.out.println(b);// can access only static variable in static method
		
		Nonstatic obj= new Nonstatic();
		obj.show();
	}

	public void show() {
		System.out.println(a);// can access non static variable
		System.out.println(b);// can access static variable
		// Non static method can access both static and non static variable.
		
		//static int x =10;
		// can not declare static variable in non static method
		//In short we can not declare static variable within any method scope.
	}
	

}
