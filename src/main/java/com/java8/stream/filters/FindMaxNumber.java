package com.java8.stream.filters;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMaxNumber {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> s=new HashSet<>();
		
		Integer max= myList.stream()
							.max((a,b)->a.compareTo(b))
							.get();
							
		
		System.out.println("Duplicate Elements\t:"+max);
		

	}

}
