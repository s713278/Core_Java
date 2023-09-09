package com.coding.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetGreatestNumWithArrayValCombnation {

	public static String getGreatestNumWithArrayValCombnation(Integer[] array) {
		String concStr = Arrays.stream(array)
				.map(element-> String.valueOf(element))
				.collect(Collectors.joining());
		System.out.println("Concatinated Value\t: "+concStr);
		
		List<String> arrayInt=new ArrayList<>();
		
		for(int i=0;i<concStr.length();i++) {
			arrayInt.add(String.valueOf(concStr.charAt(i)));
		}
		System.out.println("Array List"+arrayInt);
		String greatestNumber= arrayInt.stream()
		.sorted((s1,s2)->s2.compareTo(s1))
		.collect(Collectors.joining());
		
		System.out.println("greatestNumber "+greatestNumber);
		return greatestNumber;
	}
	
	public static void main(String[] args) {
		Integer[] a1= {1,2,5,8,90};
		getGreatestNumWithArrayValCombnation(a1);
	}

}
