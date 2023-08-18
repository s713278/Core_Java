package com.java8.features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		List<Integer> list1= new ArrayList<>();
		for(int i=1;i<=20;i++) {
			list1.add(i);
		}
		
		List<?> list2= list1.stream().filter(no->(no%2==0)).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		long eventNoCount = list1.stream().filter(no->(no%2==0)).count();
		System.out.println("Even COunt \t:"+eventNoCount);
		
		Comparator<Integer> desc = (a,b)->b.compareTo(a);
		list2= list1.stream().sorted(desc).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println("Max\t:"+list1.stream().max(desc).get());
		System.out.println("Min\t:"+list1.stream().min(desc).get());
		
		Map<Integer, Integer> map = list1.stream().filter(no->no%5==0).collect(Collectors.toMap(i->i, i->i));
		System.out.println("Map\t"+map);
	}

}
