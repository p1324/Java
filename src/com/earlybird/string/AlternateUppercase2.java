package com.earlybird.string;

public class AlternateUppercase2 {
	
		
		public static void main(String[] args) {
			String r="ramkrushna"; //o/p=RaMkRuShNa 
			char []w=r.toCharArray(); 
			String c="";
			String a=""; 
			String b=""; 
			
			for (int i=0; i<r.length();i++) {
				if (i%2==0) {
					 a=a+r.charAt(i);				 
				}
				else {
					 b=b+r.charAt(i);
				}
			}
			a=a.toUpperCase();
			for(int i=0;i<a.length() || i<b.length();i++) {
				
				if(i<a.length()) {
					c=c+a.charAt(i);
				}
				else
					continue;
				if(i<b.length()) {
					c=c+b.charAt(i);
				}
				else
					continue;
			}
			System.out.println(c);
			
			
			
		
		}

	}


