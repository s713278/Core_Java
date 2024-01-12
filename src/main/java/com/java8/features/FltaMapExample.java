package com.java8.features;

import java.util.List;
import java.util.stream.Collectors;

public class FltaMapExample {

	public static void main(String[] args) {
		List<Integer> list1=List.of(1,2,3);
		List<Integer> list2=List.of(4,5,6);
		List<Integer> list3=List.of(7,8,9,10);
		
		List<List<Integer>> mainList= List.of(list1,list2,list3);
		var finalList= mainList.stream()
				.flatMap(list->list.stream())
				//.peek(t -> )
				.peek(no->System.out.println(no*2))
				.collect(Collectors.toList());
		//System.out.println("finalList \t"+finalList);
	}

}
