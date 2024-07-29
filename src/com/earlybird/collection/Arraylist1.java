package com.earlybird.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Arraylist1 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("raj");
		l.add("dhruv");
		l.add("ak");
		l.add("Krish");
		l.add("raj");

		//System.out.println(l);// ---> [raj, dhruv, ak, Krish]
		
		/*
		 * HashSet hs = new HashSet(l); System.out.println(hs);
		 */
		
		/*
		 * for(String word:l) System.out.println(word);
		 */

		Iterator<String> itr = l.iterator();
		while (itr.hasNext())

			System.out.println(itr.next());

	}

}
