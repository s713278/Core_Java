package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumberWithStreams {

	public static void main(String[] args) {
		List<Integer> nos= Arrays.asList(1,2,3,5,7,90);
		Integer sum = nos.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("Sum \t:"+sum);
		sum = nos.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Sum \t:"+sum);
	}

}
