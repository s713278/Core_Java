package com.java8.features;

import java.util.List;
import java.util.stream.Collectors;

public class EmplGroupByGenderExample {

	public static void main(String[] args) {
		List<Employee> list=Employee.getEmpList();
		
		var grpByGender=list.stream()
			.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		var grpByGender1=list.stream()
		.collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.counting()));
		
		System.out.println(grpByGender+"\t"+grpByGender1);
	
		
	}

}
