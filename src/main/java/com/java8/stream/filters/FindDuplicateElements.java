package com.java8.stream.filters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> s=new HashSet<>();
		
		List<Integer> dupList =myList.stream()
		.filter(ele->!s.add(ele))
		.peek(System.out::println)
		.collect(Collectors.toList());
		
		//System.out.println("Duplicate Elements\t:"+dupList);
		

	}

}
