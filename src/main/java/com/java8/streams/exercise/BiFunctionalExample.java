package com.java8.streams.exercise;

import java.util.function.BiFunction;

public class BiFunctionalExample {

	public static void main(String[] args) {
		BiFunction<String, String, String> addFunction=(s1,s2)->(s1+" "+s2);
		System.out.println("Result \t"+ addFunction.apply("Swamy", "Kunta"));
		
		BiFunction<Integer, Integer, Integer> macFunction = (a,b)-> Math.max(a, b);
		System.out.println("Maximum Number : "+macFunction.apply(100, 200));
		
		BiFunction<Integer, Integer, Integer> minFunction = Math::min;
		System.out.println("Minimum Number : "+minFunction.apply(100, 200));
		
		// Example 3: BiFunction to find the maximum of two numbers
        BiFunction<Integer, Integer, Integer> maxFunction = Math::max;
        int result3 = maxFunction.apply(8, 12);
        System.out.println("Maximum of two numbers: " + result3);
    }
			

}
