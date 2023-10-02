package com.java8.features;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Example 1: Summing all elements in the stream
        Optional<Integer> sum = numbers.stream()
                .reduce((a, b) -> a * b);

        if (sum.isPresent()) {
            System.out.println("Sum of elements: " + sum.get());
        } else {
            System.out.println("The stream is empty.");
        }

        // Example 2: Providing an initial value (identity) and using reduce
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product of elements: " + product);
    }
}
