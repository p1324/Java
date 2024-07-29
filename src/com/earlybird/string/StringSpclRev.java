package com.earlybird.string;

public class StringSpclRev {
	public static void main(String[] args) {
		String s = "I am@#$% java";
		String[] words = s.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String spcl = word.replaceAll("[a-zA-Z0-9]", "");

			if (spcl.isEmpty()) 
			{
				String rev = "";
				for (int j = word.length() - 1; j >= 0; j--) 
				{
					rev = rev + word.charAt(j);
				}
				System.out.print(rev + " ");
			}
			else {
				String rev = "";
				String wordWithoutSpcl=word.replaceAll("[^a-zA-Z0-9]", "");
				for (int k = wordWithoutSpcl.length() - 1; k >= 0; k--) 
				{
					rev = rev + wordWithoutSpcl.charAt(k);
				}
				System.out.print(rev+spcl + " ");
			}
		}

	}

}
