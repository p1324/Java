package com.earlybird.string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s = "jajajakakalalalamamn";
		char[] c = s.toCharArray();
		LinkedHashSet hs = new LinkedHashSet();
		for (int i = 0; i < c.length; i++) {
			hs.add(c[i]);
		}
		System.out.println(hs);
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next());
		}
	}
}
