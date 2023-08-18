package com.java8.features;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author Mahi
 *Options
 *1. Use streams distnct method
 *2. Convert to Set
 *3. Sort and compare
 */
public class RemoveDuplicates {

	public static void removeDuplicates(List<Integer> nos) {
		nos.stream().distinct().forEach(System.out::println);;
	}

	public static void main(String[] args) {
		List<Integer> nos= Arrays.asList(1,2,3,5,7,7,90,90);
		removeDuplicates(nos);

	}

}
