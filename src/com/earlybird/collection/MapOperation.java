package com.earlybird.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapOperation {

	public static void main(String[] args) {
		//HashMap hm= new HashMap();
		HashMap<Integer, String> hm= new HashMap<Integer, String>();
		hm.put(100,null);
		hm.put(101, null);
		hm.put(102, "Java");
		hm.put(103, "Python");
		hm.put(103, "Python1");
		
		//System.out.println(hm);//{100=null, 101=null, 102=Java, 103=Python1}
		//System.out.println(hm.get(103));//Python1
		for(Map.Entry entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		for(Integer entry:hm.keySet())
		{
			System.out.println(entry);
		
		}
		
	
		for( String entry:hm.values())
		{
			System.out.println(entry);
		}
		
		System.out.println(hm.containsKey(101));
		System.out.println(hm.containsValue("nulll"));
	}
	

}
