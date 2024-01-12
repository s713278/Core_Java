package com.java8.features;

import java.util.DoubleSummaryStatistics;
import java.util.List;

public class StatiticsSummaryExample {

	public static void main(String[] args) {
		
		List<Employee> empList=Employee.getEmpList();
		
		DoubleSummaryStatistics stats= empList.stream()
				.map(emp->emp.getSalary())
				.peek(sal->System.out.println("Iteration #1 :"+sal))
				.mapToDouble(x->x*2)
				.peek(sal->System.out.println("Iteration #2 :"+sal))
				.summaryStatistics();
		
		System.out.println("Max :"+stats.getMax());
		System.out.println("Min :"+stats.getMin());
				//.max((sal1,sal2)-> sal1.intValue()-sal2.intValue());
		
	}

}
