package com.java8.streams.exercise;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1. filter() : Get the employees info based who Employee's gender = male and
 * age>45
 *  2. Transform to Map where Key is id and value is employee object.
 *  3. Transform to Map where Key is id and value should emp name 
 *  4. Group By Gender and Count of each group 
 *  5. Group By 'department' and Count of each group 
 *  6. Highest Salary Employee 
 *  7. Average Salary Employee (Sum Of
 *  8. Emp Salary Statistics 
 *  9. Age Statistics
 *  10. From list of emp objects ,I wanted list of emplyee names
 */
public class EmplyeeUseCases {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmpList();

		// 1. Get the employees info based who Employee's gender = male and age>45
		List<Employee> matchedResult = employees.stream()
												.filter(emp -> (emp.getGender().equalsIgnoreCase("Male") && emp.getAge() > 35)) // Intermediate// Operation
												.collect(Collectors.toList()); // Terminal Operation

		//matchedResult.forEach(emp -> System.out.println(emp));

		
		// 2. Transform to Map where Key is id and value is employee object.
		Map<Integer, Employee> empMap = employees.stream()
												  .collect(Collectors.toMap(emp -> emp.getId(), emp -> emp));
		//empMap.forEach((key, value) -> System.out.println("KEY ::"+key +" -- VALUE :: "+value));
		
		
		//3. Transform to Map where Key is id and value should emp name
		Map<Integer, String> empNamesMap = employees.stream()
														  .collect(Collectors.toMap(emp -> emp.getId(), emp -> emp.getName()));
		//empNamesMap.forEach((key, value) -> System.out.println("KEY ::"+key +" -- VALUE :: "+value));
		
		
		//4. Group By Gender and Count of each group
		System.out.println("================ Group By Gender and Count of each group   ==================");
		Map<String,Long> groupByGenderMap =
		employees.stream().
						collect(Collectors.groupingBy(emp->emp.getGender(), Collectors.counting()));
		//System.out.println(" Result" +groupByGenderMap);
		
		
		// 6.  Highest Salary Employee
		Employee maxSalEmpDetails =employees.stream()
				.collect(Collectors.maxBy((o1, o2) ->(int) (o1.getSalary() - o2.getSalary()))).get();
				
		System.out.println("  Highest Salary Employee ::"+maxSalEmpDetails);
		
		
		// 7. Average Salary Employee (Sum Of
		Double empAvgSal= employees.stream()
				.collect(Collectors.averagingDouble(emp -> emp.getSalary()));
		
		System.out.println(" Average Salary ::"+empAvgSal);
		
		
		//8. Salary Statistics
		DoubleSummaryStatistics statistics = employees.stream()
				.collect(Collectors.summarizingDouble(emp -> emp.getSalary()));
		
		System.out.println("Salary Statistics: : Max Salary :"+statistics.getMax() + "   Avg Salary :"+statistics.getAverage() + "   No Of Employees :"+statistics.getCount());

		
		//9. Age Statistics
		IntSummaryStatistics statistics_1 = employees.stream()
				.collect(Collectors.summarizingInt(emp -> emp.getAge()));
		
		System.out.println("Age Statistics :: "+statistics_1);
		
		
		//10. From list of emp objects ,I wanted list of emplyee names
		List<String> namesList=
			employees.stream()
					.map(emp -> emp.getName())
					.collect(Collectors.toList());
		System.out.println("namesList :"+namesList);
		namesList.forEach(t -> System.out.println(t));
	}

}
