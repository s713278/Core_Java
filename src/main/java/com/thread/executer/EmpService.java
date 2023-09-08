package com.thread.executer;
public class EmpService {
	public String getEmpName(Integer no) {

		try {
			Thread.sleep(10000);
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
