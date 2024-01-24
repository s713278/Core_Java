package com.java8.functions;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> lengthFunction = (s) -> s.length();
		System.out.println(" Length of HEllo : " + lengthFunction.apply("Hello"));

		// 10 ==> 10 * 10
		Function<Integer, Integer> squareFunction = n -> {
															System.out.println(" Input number is " + n);
															return (n * n);
														};
														
		System.out.println(" Squared Result is:"+squareFunction.apply(20));

	}

}
