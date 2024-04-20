package com.earlybird.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicateFromListUsingHashset {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList();
		al.add("java");
		al.add(null);
		al.add("java");
		al.add(null);

		
		  Iterator itr=al.iterator();
		  System.out.println("list with duplicates :-->  "); while(itr.hasNext())
		  System.out.print(" "+itr.next());
		 
		
		
		HashSet hs= new HashSet(al);
		//Iterator itr1=hs.iterator();
		System.out.println();
		System.out.println("list without duplicates :-->  ");
		//while(itr1.hasNext())
			//System.out.print("  "+itr1.next());
		System.out.println(hs);
	}

}
