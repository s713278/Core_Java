package com.coding.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedHashMapByValue {

	public SortedHashMapByValue() {
	}

	public static Map<String, Integer> sortByValue(Map<String, Integer> scoreMap) {
		// Get sorted score in ascending order
		List<Integer> sortedScore = scoreMap.values().stream().sorted().collect(Collectors.toList());
		LinkedHashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
		Set<Entry<String, Integer>> set = scoreMap.entrySet();

		for (int i = 0; i < sortedScore.size(); i++) {
			for (Iterator<Entry<String, Integer>> it = set.iterator(); it.hasNext();) {
				Entry<String, Integer> entry = it.next();
				if (entry.getValue() == sortedScore.get(i)) {
					sortedHashMap.put(entry.getKey(), sortedScore.get(i));
					break;
				}
			}
		}
		return sortedHashMap;
	}

	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("David", 95);
		scores.put("Jane", 80);
		scores.put("Mary", 97);
		scores.put("Lisa", 78);
		scores.put("Dino", 65);
		scores.put("Venkat", 100);
		System.out.println("Before ::"+scores);
		scores = sortByValue(scores);
		System.out.println("After :"+scores);
	}

}
