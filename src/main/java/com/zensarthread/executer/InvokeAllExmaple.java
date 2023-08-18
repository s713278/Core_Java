package com.zensarthread.executer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class EmpService {
	public String getEmpName(Integer no) {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (no % 3 == 0)
			return "K Swamy";

		if (no % 2 == 0)
			return "K Chetan Dutta";

		if (no % 2 == 5)
			return "K Kushika Dutta";

		return "K Ram";
	}
}

public class InvokeAllExmaple {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		List<Callable<String>> listOfCallables = Arrays.asList(
				()-> {return new EmpService().getEmpName(10);},
				()-> {return new EmpService().getEmpName(7);},
				()-> {return new EmpService().getEmpName(3);},
				()-> {return new EmpService().getEmpName(25);}
				);
		try {
			List<Future<String>> futureResult= executorService.invokeAll(listOfCallables);
			futureResult.stream().forEach((future)->{try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}});
		} catch(Exception e) {
		
			e.printStackTrace();
		}
		
	}
}
