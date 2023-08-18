package com.java8.features;
public interface MyThread{
	void run();
	default void  threadName() {
		System.out.println(this);
	}
}
