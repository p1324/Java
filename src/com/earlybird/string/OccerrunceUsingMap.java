package com.earlybird.string;

import java.util.HashMap;

public class OccerrunceUsingMap {

	public static void main(String[] args) {
		
		String s= "This is java what is java is not java is";
		String word[]=s.split(" ");
		
		HashMap<String, Integer> hm= new HashMap<String, Integer>();
		
		for(int i=0;i<word.length;i++)
		{
			//{not=1, java=3, what=1, This=1, is=4}
			//{key=value, key=value, key=value}
			
			if(hm.containsKey(word[i]))
			{
				hm.put(word[i], hm.get(word[i])+1);//hm.get(is)--->1//is=2
			}
			else
			{
				hm.put(word[i], 1);
			}
		}
		
		System.out.println(hm);
	}

}
