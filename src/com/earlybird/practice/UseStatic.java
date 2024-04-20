package com.earlybird.practice;

public class UseStatic {

	int a = 10;
	int b = 20;
	
	public void show() {
		a++;
		b++;
		System.out.println(a + "---------" + b);
	}

	public static void main(String[] args) {

		UseStatic obj = new UseStatic();
		obj.show();
		UseStatic obj2 = new UseStatic();
		obj2.show();
	}

}
