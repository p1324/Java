package com.earlybird.string;

import java.util.HashSet;
import java.util.Iterator;

public class AddAllUniqueNum {

	public static void main(String[] args) {
		String input = "1,2, ,,mm,3,2,a,b,3,4";
		// output=1+2+3+4=10
		String[] allParts = input.split(",");// {"1","2"," ","3","2","a","b","3","4"}
		HashSet<String> hs = new HashSet<String>();
		for (String el : allParts) {
			hs.add(el);
		}
		System.out.println(hs);// [ , 1, a, 2, b, 3, 4]
		Iterator itr = hs.iterator();
		int sum = 0;
		while (itr.hasNext()) {
			String currentChar = itr.next().toString().replaceAll("[^0-9]", "");
			if (!currentChar.equals("")) {
				int digit = Integer.parseInt(currentChar);
				sum = sum + digit;
			}
		}
		System.out.println(sum);
		System.out.println("code complete");
	}

}
