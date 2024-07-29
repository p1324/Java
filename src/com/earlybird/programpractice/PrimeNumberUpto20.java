package com.earlybird.programpractice;

public class PrimeNumberUpto20 {

	public static void main(String[] args) {
		
		int n = 1,count = 0;
		while(n<=20)
		{
			//System.out.println(n);
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;	
				}
			}
			if(count==2)
			{
				System.out.println(n+ " is prime number");
			}
			
			  else { System.out.println(n +" is not prime number"); }
			 
		n++;
		count=0;
		}
	}
}
