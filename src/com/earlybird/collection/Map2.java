package com.earlybird.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "raj");
		hm.put(2, "luv");
		hm.put(3, "Dhruv");
		hm.put(4, "kush");
	
		
		for(Map.Entry<Integer, String> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		
		
		hm.remove(4);
		System.out.println(hm.get(3));
	}

}
