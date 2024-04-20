package com.earlybird.string;
/*
 * StringBuffer s1= new StringBuffer("Java1"); 
 * System.out.println(s1.reverse());
 */

/*
 * String s1="Java";
 *  char[] ch=s1.toCharArray();
 *   System.out.println(ch); 
 *   for(int i=ch.length-1;i>=0;i--)
 *  { 
 *  System.out.print(ch[i]); 
 *  }
 * 
 */
public class StringReverse {

	public static void main(String[] args) {	
		  String s2 = "Java"; 
		  String rev = " "; 
		  for (int i = s2.length() - 1; i >= 0;i--) 
		  {
			  rev = rev + s2.charAt(i); 
		  }
		  System.out.println(rev);
		 
	}

}
