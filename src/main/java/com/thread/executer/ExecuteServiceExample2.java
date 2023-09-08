package com.thread.executer;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecuteServiceExample2 {

	public static void main(String[] args) {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println("availableProcessors : " + availableProcessors);
		ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);

		Integer[] empIds = { 1, 80, 89, 45, 9, 63,8,00 ,9,7,6};

		Future<String> futureResult = null;
		EmpService empService = new EmpService();
		Map<Integer, Future<String>> resultMap = new HashMap<>();
		for (Integer empID : empIds) {
			futureResult = executorService.submit(() -> empService.getEmpName(empID));
			resultMap.put(empID, futureResult);
		}

		System.out.println("************");
		System.out.println("");
		Boolean allDone = Boolean.FALSE;
		do {
			System.out.println(" All tasks are completed?? :" + allDone);
			for (Entry<Integer, Future<String>> entry : resultMap.entrySet()) {
				try {
					System.out.println("Entry :" +entry.getKey()+"   \t:Value:"+ entry.getValue().get());
					if(entry.getValue().isDone()) {
						allDone = Boolean.TRUE;
						continue;
					}else {
						allDone = Boolean.FALSE;
						break;
					}
				} catch (InterruptedException | ExecutionException e) {
					e.printStackTrace();
				}
			}

		} while (!allDone);
		
		if(allDone) {
			System.out.println(" All tasks are completed?? :" + allDone);
			executorService.shutdown();
		}
		
	}
}
