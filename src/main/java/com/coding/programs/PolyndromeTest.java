package com.coding.programs;

public class PolyndromeTest {

	public static String reverseString(String str) {
		
		StringBuffer buffer=new StringBuffer();
		for(int i=str.length()-1;i>=0;i--) {
			buffer.append(str.charAt(i));
		}
		return buffer.toString();
	}
	public static void main(String[] args) {
		System.out.println(reverseString("Swamy Kunta"));
	}

}
