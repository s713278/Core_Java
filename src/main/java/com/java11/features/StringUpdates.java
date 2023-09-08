package com.java11.features;

import java.util.stream.Stream;

/**
 * Demonstration of Java 11 Features
 * 	1. String API Updates
		a. Boolean isBlank()
		b. Steam<String> lines()
		c. String strip()
			i. stripLeading()
			ii. stripTrailing()
String repeat()
 * @author Mahi
 *
 */
public class StringUpdates {

	public static void main(String[] args) {
		
		String str ="  ";
		System.out.println("isBlank\t?"+str.isBlank());
		
		String lines ="One\nTwo\nThress\nFour";
		Stream<String> linesStream = lines.lines();
		linesStream.forEach(System.out::println);
		
		System.out.println("abc".repeat(4));
	}

}
