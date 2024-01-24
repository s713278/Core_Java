package com.java8.functions;

import java.util.function.Predicate;

import com.collections.PersonDTO;

public class PredicateExample {

	public static void main(String[] args) {
	
		Predicate<Integer> predicateFunction = (a)-> (a%2)==0;
		System.out.println("Is 35 even number : "+predicateFunction.test(35));
		
		String sampleStr = "I am Java";
		Predicate<String> strPredicate = (s)->(s.contains(" "));
		System.out.println(sampleStr +" Has EMPTY Space :"+strPredicate.test(sampleStr));
		
		
		
		Predicate<PersonDTO> genderPredicate = (p)-> p.getGender().equalsIgnoreCase("male");
		

	}

}
