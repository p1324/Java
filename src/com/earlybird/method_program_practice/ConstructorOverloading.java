package com.earlybird.method_program_practice;

public class ConstructorOverloading {

	
	ConstructorOverloading(int a)
	{
		System.out.println("multiplication is "+(a*a));
	}
	
	ConstructorOverloading(int a,int b)
	{
		System.out.println("addition is "+(a+b));
	}
	public static void main(String[] args) {
		
		ConstructorOverloading obj= new ConstructorOverloading(1);
		ConstructorOverloading obj1= new ConstructorOverloading(1,2);
	}

}
