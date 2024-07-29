package com.earlybird.array;

import java.util.HashMap;
import java.util.Map;

public class FindUnique {

	public static void main(String[] args) {

		int numbers[] = { 4, 5, 5, 7, 6, 6, 7, 4, 9, 5 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (Integer number : numbers) 
		{
			if (hm.containsKey(number))
			{
				hm.put(number, hm.get(number) + 1);
			} 
			else
			{
				hm.put(number, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("Uniuqe element is  "+entry.getKey());
			}
		}
	}
}
