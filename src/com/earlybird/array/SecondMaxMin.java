package com.earlybird.array;

public class SecondMaxMin {

	
		 public static void main(String[] args) {
		        int a[]={1,2,3,5,7,4,6};
		      //  1234567
		         for (int i = 0; i < a.length; i++) 
		        {
		            for (int j = i + 1; j < a.length; j++) 
		            {
		                if (a[i] > a[j]) 
		                {
		                   int temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		                }
		            }
		             
		        }
		        System.out.println("second lowest  "+a[1]);
		        System.out.println("Second max  "+a[a.length-2]);
		            
		        }

	}


