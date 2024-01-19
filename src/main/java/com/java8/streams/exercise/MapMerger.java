package com.java8.streams.exercise;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a program that merges two Maps, combining values for common keys and adding new keys from both Maps.
 */
public class MapMerger {

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>(map1);

        // Merge values for common keys
       // map2.forEach((key, value) -> mergedMap.merge(key, value, Integer::sum));
        
        for(Iterator<String> it= map1.keySet().iterator() ;it.hasNext() ;) {
        	String key = it.next();
        	if(map2.containsKey(key)) {
        		mergedMap.put(key, map1.get(key)+map2.get(key));
        	}else {
        		mergedMap.put(key, map1.get(key));
        	}
        	//Remove from map2
        	map2.remove(key);
        }
        //Add left over map2 entries to mergedMap
        mergedMap.putAll(map2);
        return mergedMap;
    }

    public static void main(String[] args) {
        // Sample input Maps
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("apple", 3);
        map1.put("banana", 2);
        map1.put("orange", 5);
        map1.put("straberry", 5);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 2);
        map2.put("grape", 4);
        map2.put("banana", 1);
        map2.put("guava", 5);

        // Merge Maps
        Map<String, Integer> mergedMap = mergeMaps(map1, map2);

        // Display the input and merged Maps
        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Merged Map: " + mergedMap);
        
        /*
         * Map 1: {banana=2, orange=5, apple=3, straberry=5}
Map 2: {grape=4, guava=5}
Merged Map: {banana=3, orange=5, apple=5, straberry=5, grape=4, guava=5}
         */
    }
}
