package com.java8.streams.exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {
		
		
		IntStream.range(10, 20).forEach(value -> System.out.println(value));
		
		List<Integer> nos = IntStream.range(10, 20)
								.boxed() 							 ///It converts IntStream to Strea ino rder to call collect method
								.collect(Collectors.toList());
									
		System.out.println("List "+nos);
		
		
		
		
	}

}
