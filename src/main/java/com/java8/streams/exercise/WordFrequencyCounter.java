package com.java8.streams.exercise;
import java.util.*;
import java.util.stream.Collectors;
/*
 * 1 .Write a method that counts the frequency of each word in a given List of strings and stores the result in a Map.
Input:
List : ["apple", "orange", "apple", "banana", "Orange", "Apple"]

Output:
	Map: {orange=2, apple=3, banana=1}

 */
public class WordFrequencyCounter {

    public static Map<String, Integer> countWordFrequency(List<String> words) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            // Convert to lowercase to ensure case-insensitive counting
            String cleanedWord = word.toLowerCase();

            // Update the count in the map
            frequencyMap.put(cleanedWord, frequencyMap.getOrDefault(cleanedWord, 0) + 1);
        }

        return frequencyMap;
    }

    
    public static void countWordFrequencyUsingStream(List<String> words) {
        
        words.stream()
        	.map(String ::toLowerCase)
        	.collect(Collectors.groupingBy(t -> t.toString(),Collectors.counting())).forEach((t, u) -> System.out.println(t+" "+u));;
      
    }

    public static void main(String[] args) {
        // Sample input
        List<String> inputWords = Arrays.asList("apple", "orange", "apple", "banana", "Orange", "Apple");

        // Count word frequency
        Map<String, Integer> result = countWordFrequency(inputWords);

        // Sample output
        System.out.println("Input List: " + inputWords);
        System.out.println("Word Frequency Map: " + result);
        countWordFrequencyUsingStream(inputWords);
    }
}
