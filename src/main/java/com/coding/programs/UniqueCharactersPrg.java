package com.coding.programs;

import java.util.Arrays;

public class UniqueCharactersPrg {

	public static void getUniqueCharsCount(String str) {
		System.out.println("Processing .. "+str);
		int length = str.length();
		String sub = "";
		for(int i=1;i<length;i++) {
			for(int j=0 ;j<length-1 ; j++) {
				if((i+j)<=length) {
					sub = str.substring(j,i+j);
				}else {
					sub = str.substring(0,length-1);
					break;
				}
				
				System.out.println(j+""+(i+j)+"::"+sub+" \t"+sub.length());
			}
		}
		System.out.println("________________________________________");
	}
	public static void main(String[] args) {
		Arrays.asList("abcd").stream().forEach((s)->getUniqueCharsCount(s));
	}

}
