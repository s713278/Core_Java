package com.coding.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInArray {
	
	/**
	 * <p>
	 * </p>
	 * @param arry
	 * @return
	 */
	public static Map<Integer, Integer> getDuplicateElements(Integer[] arry) {

		Map<Integer, Integer> map = new LinkedHashMap<>();
		for (int number : arry) {
				map.put(number, map.getOrDefault(number, 0) + 1);
		}
		for(Entry<Integer, Integer> entry : map.entrySet())
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ,");
			}
		return map;
	}
	
	/**
	 * <p>
	 * 
	 * </p>
	 * @param arry
	 * @return
	 */
	public static Set<Integer> getDuplicatedElementsUsingStream(Integer[] arry) {
		Set<Integer> duplicateItems= new HashSet<>();
		Set<Integer> duplicateItems1= Arrays.asList(arry).stream().
				filter(n-> (duplicateItems.add(n)==false)).
				collect(Collectors.toSet());
		System.out.println("Duplicate Numbers: \t"+duplicateItems1);
		return duplicateItems1;
	}
	
	public static Map<Integer, Long> getElementsCount(Integer[] arry) {
		Map<Integer, Long> map= Arrays.asList(arry).stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()));
		return map;
	}

	public static void main(String[] args) {
		Integer[] arry = { 1, 2, 3, 5, 7, 8, 1, 5, 10, 90 };
		System.out.println("\nDuplicated Count By Number :" + getDuplicateElements(arry));
		System.out.println("\nDuplicated Count By Number :" + getDuplicatedElementsUsingStream(arry));
		System.out.println("\nElements Count Map :" + getElementsCount(arry));
	}

}
