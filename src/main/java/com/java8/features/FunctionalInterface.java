package com.java8.features;

import java.util.function.Consumer;

/**
 * Demonstration of Functional Interface.
 * @author Mahi
 *
 */
class MyThreadImpl implements MyThread{

	@Override
	public void run() {
		System.out.println("Its child class implementation ..");
	}
	
}
public class FunctionalInterface {

	public static void main(String[] args) {
		MyThread th1 = () -> System.out.println("Its lambda expression implementation..");
		th1.run();
		th1.threadName();
		MyThread th2 = new MyThreadImpl();
		th2.run();
		
		Consumer<String> con = ( va1) -> System.out.println("Its consumer "+va1);
		con.accept("Hi ");
	}

}
