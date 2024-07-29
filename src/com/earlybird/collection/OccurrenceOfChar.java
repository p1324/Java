package com.earlybird.collection;

import java.util.HashMap;

public class OccurrenceOfChar {

	public static void main(String[] args) {
		String s="Ramkrushna"; // r =2 a=2 m=1
		char[] c=s.toLowerCase().toCharArray();
		
		HashMap<Character,Integer> hm= new HashMap<Character, Integer>();
		for(Character ch:c)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}

}
