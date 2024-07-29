package com.earlybird.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateList {

	public static void main(String[] args) {

		List list1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 6, 7, 8));

		System.out.println("list with duplicates  "+list1);
		List  newList=new ArrayList();
		for (Object el : list1) 
		{
			
			if(!newList.contains(el))//1
			{
				newList.add(el);
			}
		}
		System.out.println("list without duplicates  "+newList);
	}

}
