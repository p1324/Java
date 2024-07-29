package com.earlybird.string;

public class A12B123C1234 {
	// input=A12B123C1234
	//121231234
	//output=12+123+1234=
	public static void main(String[] args) {
		String input="A12B123C1234";
		for(int i=0;i<input.length();i++)
		{
			char currentChar=input.charAt(i);//A
			if(Character.isLetter(currentChar))
			{
				char ch =',';
				input=input.replace(currentChar, ch); //,12,123,1234		
			}
		}
		String[] digits=input.split(",");//["","12","123","1234"]
		int sum=0;
		for(int j=0;j<digits.length;j++)
		{
			String currentDigit=digits[j];
			if(currentDigit!="") // dont add ""
			{
			int digit=Integer.parseInt(currentDigit);// convert "12" to 12
			
			 sum=sum+digit;
			 }
		}
		System.out.println(sum);

	}

}
