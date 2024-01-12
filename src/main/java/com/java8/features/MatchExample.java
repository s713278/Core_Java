package com.java8.features;

import java.util.List;

public class MatchExample {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(2,4,6,8,9);
		
		boolean allEvenNos =list.stream().allMatch(no->no%2==0);
		
		System.out.println("allEvenNos \t"+allEvenNos);
		
		boolean isListCntainsOdd = list.stream()
									     .anyMatch(no->no%2==1);
		System.out.println("isListCntainsOdd \t"+isListCntainsOdd);
		
		boolean doesntDivByFive = list.stream()
										.noneMatch(no->no%5==0);
		System.out.println("doesntDivByFive \t"+doesntDivByFive);
	}

}
