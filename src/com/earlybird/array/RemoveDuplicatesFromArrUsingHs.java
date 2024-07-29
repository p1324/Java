package com.earlybird.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicatesFromArrUsingHs {

	public static void main(String[] args) {
		Integer a[] = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 8, 8, 8, 9, 9, 9 };
		// ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(a));
		HashSet<Integer> hs = new HashSet<Integer>(Arrays.asList(a));
		/*
		 * for (Integer unique : a) { hs.add(unique); }
		 */

		/*
		 * for(int i=0;i<a.length;i++) { hs.add(a[i]); }
		 * 
		 */
		/*
		 * Iterator itr = hs.iterator(); 
		 * while (itr.hasNext())
		 *  {
		 * System.out.println(itr.next().toString());
		 *  }
		 */
		 System.out.println(hs);
	}

}
