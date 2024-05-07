package com.earlybird.string;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDupUsingSet {

	public static void main(String[] args) {
		String s="Programming";
		char[] c = s.toCharArray();
		
		LinkedHashSet<Character> hs= new LinkedHashSet<Character>();
		
		for(Character unique:c)
		{
			hs.add(unique);
		}
   // System.out.println(hs);
		//String u="";
		StringBuilder sb= new StringBuilder();
		Iterator itr=hs.iterator();
		while(itr.hasNext())
		{
			//System.out.print(itr.next());
			//u=u+itr.next();
			sb.append(itr.next());
		}
		//System.out.println(u);
		System.out.println(sb);
	}

}
