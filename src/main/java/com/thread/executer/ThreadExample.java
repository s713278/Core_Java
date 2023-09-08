package com.thread.executer;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		executorService.submit(() -> System.out.println("Thread: " + Thread.currentThread().getName()));

		Future<Integer> future = executorService.submit(() -> {
			System.out.println("I am callable task!!");
			return 2;
		});

		try {
			System.out.println(future.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}finally {
			executorService.shutdown();
		}
		
	}

}
