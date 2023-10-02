package com.java8.stream.filters;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		
		Character ch=input.chars()
		.mapToObj(c->Character.valueOf((char)c))
		.toList()
		.stream()
		.collect(Collectors.groupingBy(ele->ele, LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count
		.entrySet()
		.stream()
		.filter(entry->entry.getValue()==1)
		.peek(System.out::println)
		.map(entry->entry.getKey())
		.findFirst()
		.get();
		System.out.println("First Non Repeasted Char\t:"+ch);
	}

}
