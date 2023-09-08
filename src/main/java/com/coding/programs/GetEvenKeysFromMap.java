package com.coding.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class GetEvenKeysFromMap {

	public static Map<Integer,String> getListFromMap(Map<Integer, String> map){
		
		Map<Integer,String> evenKeys= map.entrySet()
				.stream()
				.filter(entry->(entry.getKey()%2==0))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		
		return evenKeys;
	}
	
	
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Thress");
		map.put(4, "Four");
		
		System.out.println("Values from Map ::"+getListFromMap(map));
	}

}
