package com.java8.features;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Define a Function that converts a String to its length
        Function<String, Integer> stringLengthFunction = s -> s.length();

        // Apply the function
        String input = "Hello, Function!";
        int length = stringLengthFunction.apply(input);

        System.out.println("Input: " + input);
        System.out.println("Length: " + length);
        
        
    }
}