package com.java8.features;

import java.util.List;
import java.util.stream.Collectors;

public class ListToString {

	public static void main(String[] args) {
		List<String> list=List.of("swamy","kunta","ramya","chetan","kushika");
		StringBuilder builder=new StringBuilder();
		String csvNames=list.stream()
			//.map(t -> t)
			.collect(Collectors.joining(","));
			
		
		System.out.println("\n\n"+csvNames);
	}

}
