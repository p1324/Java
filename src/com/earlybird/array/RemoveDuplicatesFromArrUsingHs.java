package com.earlybird.array;

import java.util.HashSet;

public class RemoveDuplicatesFromArrUsingHs {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,3,4,4,5,5,6,6};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(Integer unique:a)
		{
			hs.add(unique);
		}
		System.out.println(hs);
	}

}
