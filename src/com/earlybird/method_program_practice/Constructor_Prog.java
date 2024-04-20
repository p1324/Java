package com.earlybird.method_program_practice;

public class Constructor_Prog {
int a;
int b;// declaration
	public Constructor_Prog() {
		 a=10;// initialization
		 b=10;//initialization
		System.out.println("this is constructor");
		
	}
	public void add()
	{
		int c= a+b;
		System.out.println("addition is "+ c);
	}
	public static void main(String[] args) {
		
		Constructor_Prog  obj= new Constructor_Prog();
		obj.add();
	}

}
