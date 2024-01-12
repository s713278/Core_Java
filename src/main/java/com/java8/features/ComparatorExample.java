package com.java8.features;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Integer> list=List.of(2,4,6,8,9);
		
		Optional<Integer> min =list.stream()
								.min((a,b)->a-b);
		
		System.out.println("Min Number: \t"+(min.isPresent()?min.get():-1));
		
		List<Employee> empList=Employee.getEmpList();
		
		DoubleSummaryStatistics stats= empList.stream()
				.map(emp->emp.getSalary())
				.mapToDouble(x->x)
				.summaryStatistics();
		
		System.out.println("Max :"+stats.getMax());
		System.out.println("Min :"+stats.getMin());
				//.max((sal1,sal2)-> sal1.intValue()-sal2.intValue());
		
	}

}
