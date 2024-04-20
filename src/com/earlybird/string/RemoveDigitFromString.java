package com.earlybird.string;

public class RemoveDigitFromString {
	public static void main(String[] args) {
String s= "AAaa@**-_5462";
System.out.println(s.replaceAll("\\d", ""));// remove digits
System.out.println(s.replaceAll("[0-9]", ""));// remove digits
System.out.println(s.replaceAll("[a-z]", ""));//remove small letters
System.out.println(s.replaceAll("[A-Z]", ""));//remove  capital letters
System.out.println(s.replaceAll("[a-zA-Z]", ""));// remove all letters
System.out.println(s.replaceAll("[a-zA-Z0-9]", ""));// remove all letters and digit
System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));// remove all special char
	}
}
