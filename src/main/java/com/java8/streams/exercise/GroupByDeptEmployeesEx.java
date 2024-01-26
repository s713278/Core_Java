package com.java8.streams.exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupByDeptEmployeesEx {

	public static void main(String[] args) {
		
		List<Employee> employees = Employee.getEmpList();
		
		Map<String, Long> deptCount =	
		employees.stream()
					 .collect(Collectors.groupingBy(emp -> emp.getDepartment(),Collectors.counting()));
		
		//System.out.println(deptCount);
		
		
		
		Map<String, List<Employee>> deptEmpMap =	
				employees.stream()
							 .collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.toList()));
		
				
		//deptEmpMap.forEach((key, value) -> System.out.println(key + " "+value));
		
		deptEmpMap.forEach((key, value) -> System.out.println(key + " "+value.stream()
																			 .map(emp ->emp.getName())
																			 .collect(Collectors.joining(" ||||| ")) ));
		
		
	//	Map<String, String> deptWiseEmpNamesMap =	
		//employees.stream()
			//.collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.toList()))
			

	}

}
