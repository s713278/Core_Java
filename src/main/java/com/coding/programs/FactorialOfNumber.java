package com.coding.programs;

public class FactorialOfNumber {

	public static Long findFactorial(int num) {
		if(num<0) {
			return 0L;
		}
		long factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	public static Long recursiveFindFactorial(int num) {
		if(num<0) {
			return 0L;
		}
		long factorial = 1;
		if (num != 0) {
			factorial = num * recursiveFindFactorial(num - 1);
		}
		return factorial;
	}

	public static void main(String[] args) {
		System.out.println("4 findFactorial:" + findFactorial(0));
		System.out.println("4 recursiveFindFactorial :" + recursiveFindFactorial(0));

		System.out.println("\n4 findFactorial:" + findFactorial(-1));
		System.out.println("4 recursiveFindFactorial :" + recursiveFindFactorial(-1));

		System.out.println("\n4 findFactorial:" + findFactorial(5));
		System.out.println("4 recursiveFindFactorial :" + recursiveFindFactorial(5));

	}

}
