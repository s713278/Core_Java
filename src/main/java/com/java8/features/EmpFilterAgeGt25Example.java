package com.java8.features;

import java.util.List;
import java.util.stream.Collectors;

//Prg for filterig the employees based on age
public class EmpFilterAgeGt25Example {

	public static void main(String[] args) {
		
		List<Employee> list=Employee.getEmpList();
		list.stream().filter(emp->emp.getAge()>25).forEach(System.out::println);
		
		var filteredList= list.stream().filter(emp->emp.getAge()>25).collect(Collectors.toList());
		System.out.println("=============================================================");
		for(var empp:filteredList) {
			System.out.println(empp);
		}

	}

}
