package com.java8.features;

import java.util.List;
import java.util.stream.Collectors;

public class EmpSalAvgByDeptExample {

	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();

		var salAverageByDept = list.stream().collect(
				Collectors.groupingBy(emp->emp.getDepartment(), Collectors.averagingDouble(emp -> emp.getSalary())));

		System.out.println(salAverageByDept);
		
		System.out.println("\n\n\n");
		
		var maxSalByDept= list.stream().collect(
				Collectors.groupingBy(emp->emp.getDepartment(), 
									 Collectors.maxBy((emp1,emp2)->(int)(emp1.getSalary()-emp2.getSalary()))
									 )
				);
		System.out.println("Max Salary By Dept:"+maxSalByDept);

	}

}
