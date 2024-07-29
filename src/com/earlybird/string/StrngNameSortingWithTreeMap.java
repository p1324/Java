package com.earlybird.string;

import java.util.Map;
import java.util.TreeMap;

public class StrngNameSortingWithTreeMap {

	
	    public static void main(String[] args) {
	        String[] str = {"Amit:50", "Anil:25", "Suresh:35", "Mahesh:45", "Hitesh:10"};

	        // TreeMap to store names and their associated numbers
	        TreeMap<Integer, String> map = new TreeMap<>();

	        // Populate TreeMap with data from the array
	        for (String s : str) {
	            String[] parts = s.split(":");
	            //System.out.println(parts.length);
	            String name = parts[0];
	            int number = Integer.parseInt(parts[1]);
	            map.put(number, name);
	        }
System.out.println(map);
	        // Print the sorted names based on the TreeMap's natural ordering
	        System.out.println("Sorted names based on numbers (using TreeMap):");
	        for (Map.Entry<Integer, String> entry : map.entrySet()) {
	            System.out.println(entry.getValue()+":"+entry.getKey());
	        }
	    }
	}


