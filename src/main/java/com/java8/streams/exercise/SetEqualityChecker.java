package com.java8.streams.exercise;
import java.util.HashSet;
import java.util.Set;

/**
 * Develop a method that checks if two Sets are equal (contain the same elements) regardless of the order. Sample input and output
 */
public class SetEqualityChecker {

    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        // Check if the sizes are equal
        if (set1.size() != set2.size()) {
            return false;
        }

        // Check if all elements of set1 are present in set2
        return set1.containsAll(set2);
    }

    public static void main(String[] args) {
        // Sample input Sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(1);
        set2.add(2);

        // Check if Sets are equal
        boolean isEqual = areSetsEqual(set1, set2);

        // Display the input Sets and result
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Are Sets Equal? " + isEqual);
    }
}
