package com.coding.programs;

public class FibonacciRecursive {
	public static int fibonacci(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 10; // Example: Print the first 10 numbers of the Fibonacci Series
		System.out.println("Fibonacci Series:");
		for (int i = 0; i < n; i++) {
			System.out.print(fibonacci(i) + " ");
		}
	}
}
