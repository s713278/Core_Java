package com.java8.streams.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {
		
		List<Integer> listOfString = new ArrayList<>();
		listOfString.add(2);
		listOfString.add(3);
		listOfString.add(4);
		
		List<Integer> squaredResultList = listOfString.stream()
														.map(t -> t*t)
														.collect(Collectors.toList());
		System.out.println("squaredResultList "+squaredResultList);
		

		
		
		List<List<Integer>> listOfLists = new ArrayList<>();
		
		listOfLists.add(List.of(1,2));
		listOfLists.add(List.of(3,4));
		listOfLists.add(List.of(5,6));
		listOfLists.add(List.of(3,4));
		
		List<Integer> squaredResultList_2 =listOfLists.stream()
													.flatMap(subList -> subList.stream())
													.map(num -> num*num)
													.collect(Collectors.toList());
		System.out.println("squaredResultList_2 "+squaredResultList_2);
		
		
		//Unique Data Set
		List<Integer> uniqueList =			listOfLists.stream()
											.flatMap(subList -> subList.stream())
											.distinct()
											.collect(Collectors.toList());
		System.out.println("UniqueList "+uniqueList);
											
		
		//Sum of all numbers
		int sum = listOfLists.stream().flatMap(t ->t.stream() ).collect(Collectors.summingInt(value -> value)).intValue();
		System.out.println(" Sum :"+sum);
		
		
	}

}
