package com.java8.functions;

import java.time.Duration;

public class RunnableExample {

	public static void main(String[] args) {
		
		Runnable runnableThraed1 = () -> {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(Thread.currentThread().getName()+" Pushing Data To Splunk For Data  " + i);
					Thread.sleep(Duration.ofSeconds(2));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		
		Thread thread1 = new Thread(runnableThraed1, "SplunkThread");
		thread1.start();
		
		
		System.out.println("Hi,I am invoked by a thraed name :: "+Thread.currentThread().getName());
		
		
		Runnable runnableThraed = () -> {
			for (int i = 0; i < 5; i++) {
				try {
					System.out.println(Thread.currentThread().getName()+" Performing some task for data " + i);
					Thread.sleep(Duration.ofSeconds(1));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(runnableThraed, "DBThread");
		thread.start();
		
	}

}
