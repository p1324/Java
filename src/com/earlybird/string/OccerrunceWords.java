package com.earlybird.string;

public class OccerrunceWords {

	public static void main(String[] args) {
		String s= "This is java what is java is not java is";
		
		//this=1,is =2, java=2, what=1
		String s1[]=s.split(" ");
		
		for(int i=0;i<s1.length;i++)
		{
			int count=1;
			for(int j=i+1;j<s1.length;j++)
			{
				if(s1[i].equals(s1[j]))
				{
					count++;
				}				
			}
			System.out.println(s1[i]+"="+ count);//this=1,
		}

	}

}
