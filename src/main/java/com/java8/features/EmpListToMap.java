package com.java8.features;

import java.util.List;
import java.util.stream.Collectors;

public class EmpListToMap {

	public static void main(String[] args) {
		List<Employee> list = Employee.getEmpList();
		list.stream()
			.collect(Collectors.toMap(emp->emp.getId(), emp->emp.getName().toUpperCase()))
			.forEach((t, u) -> System.out.println(t+"\t"+u));
		
	}

}
