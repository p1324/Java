package com.earlybird.string;

public class Snippet {

	int calc() {
		try {
			return 10 / 2;
		} catch (Exception e) {
			return 20;
		}
		
		 finally { return 30; }
		 
	}
	public static void main(String[] args) {
		Snippet fr = new Snippet();
		System.out.println(fr.calc());
	}

}
