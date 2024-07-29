package com.earlybird.collection;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWords {

	public static void main(String[] args) {
		
		String s= "This is parrot what is parrot eat mango eat mango mango";
		String[] words=s.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		for(String word:words)
		{
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);//is 2
			}
			else
			{
				hm.put(word, 1); //is=1
			}
		}
		System.out.println(hm);
	}

}
