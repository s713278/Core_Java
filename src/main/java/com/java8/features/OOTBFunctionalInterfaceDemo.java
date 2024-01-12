package com.java8.features;

import java.util.function.Predicate;

public class OOTBFunctionalInterfaceDemo {

	
	public static void main(String[] args) {
		Runnable task = () -> {
			for(int i=1;i<=10;i++) {
				System.out.println("No :"+i);
			}
		};
		Thread thread=new Thread(task);
		thread.start();
		
		Predicate<Integer> predicate = (i) -> {
			return i%2==0;
		};
		
		System.out.println("Is 245 even??"+predicate.test(245));
	}
	
	
}
