package com.java8.features;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (i) -> {
			return (i % 2 == 0);
		};
		
		System.out.println("Is even? "+predicate.test(10));
		System.out.println("Is even? "+predicate.test(15));
		System.out.println("Is even? "+predicate.test(18));
		
		Predicate<Integer> greater = i -> i>10;
		Predicate<Integer> dividedBy6 = i -> { return (i%6==0);};
		
		System.out.println("Greater than 10 and Divide By 6 ?\t:"+greater.and(dividedBy6).test(36));
		System.out.println("Greater than 10 and Divide By 6 ?\t:"+greater.and(dividedBy6).test(6));
		System.out.println("Greater than 10 and Divide By 6 ?\t:"+greater.and(dividedBy6).test(16));
	}

}
