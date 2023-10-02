package com.java8.stream.filters;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		List<List<Integer>> list=List.of(
				List.of(1,2),
				List.of(3,4),
				List.of(5,6),
				List.of(7,8)
				);
		
	List<Integer> conolidatedList = list.stream()
			.flatMap(subList->subList.stream())
			.collect(Collectors.toList());
	System.out.println("Conolidated List \t"+conolidatedList);
	conolidatedList.stream().forEach(t -> System.out.println(t));
	}

}
