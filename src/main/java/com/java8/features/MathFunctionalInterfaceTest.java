package com.java8.features;

public class MathFunctionalInterfaceTest {

	public static void main(String[] args) {
		MathFunctionalInterface sum = (a,b)-> {return a+b;};
		System.out.println(sum.add(10, 10));
	}

}
