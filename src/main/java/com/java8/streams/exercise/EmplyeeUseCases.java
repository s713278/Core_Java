package com.java8.streams.exercise;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. Get the employees info based who Employee's gender = male and age>45
 * 2. Map & Grouping : Group By Gender
 * 3. Highest Salary Employee
 * 4. Average Salary Employee (Sum Of Employee's Salary / No Of Employees)
 * 5. Lowest Salary Employee
 */
public class EmplyeeUseCases {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmpList();
		
		List<Employee> matchedResult =
		employees.stream()
				.filter(emp -> ( emp.getGender().equalsIgnoreCase("Male") && emp.getAge() >35) )  //Intermediate Operation
				.collect(Collectors.toList());		//Terminal Operation
		
		matchedResult.forEach(emp -> System.out.println(emp));
	}

}
