package com.earlybird.string;

public class a2b44c3 {

	public static void main(String[] args) {
		String str = "a2b44c3";
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) 
			{
					temp = temp + ch;
					System.out.println(temp);
			} 
			
			  else 
			  { 
				  sum =sum+ Integer.parseInt(temp); 
				  System.out.println(sum);
			  temp = "0"; 
			  }
			 
		}
		sum += Integer.parseInt(temp);
		System.out.println(sum);
	}

}
