package com.earlybird.collection;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String args[]) {
 
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(Collections.reverseOrder());
		tm.put(105, "Raj");
		tm.put(102, null);
		tm.put(103, "Raj2");
		tm.put(104, null);
		
		for(Map.Entry entry:tm.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
		System.out.println(tm);
	}
}
