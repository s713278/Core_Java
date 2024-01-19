package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> studentMarks = new HashMap<>();
		
		studentMarks.put("John", 150); //Entry#1
		studentMarks.put("Gary", 10); //Entry#1
		studentMarks.put("David", 120); //Entry#1
		
		System.out.println("Only Keys :"+studentMarks.keySet());
		
		System.out.println("Only Values :"+studentMarks.values());
		
		System.out.println("Only Entries :"+studentMarks.entrySet());
		
		
		Iterator<String> it= studentMarks.keySet().iterator();
		System.out.println(it);
	
		while(it.hasNext()) {
			String element = it.next();
			System.out.println(element + " " +element.toUpperCase());
		}
		
		
		
		List<Entry<String, Integer>> listOfEntries = new ArrayList<>(studentMarks.entrySet());
		for(Entry<String, Integer> entry: listOfEntries) {
			System.out.println(entry.getKey() + " "+entry.getValue() );
		}
		
	}

}
