package com.nsu;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp{
	
	String id;
	String firstName;
	String lastName;
	
	public Emp() {
		
	}
	public Emp(String id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
public class EmpTest {

	public static void main(String[] args) {
		
		Emp e1 = new Emp("1","Vera","Shankara");
		Emp e2 = new Emp("2","NBC","University");
		Emp e3 = new Emp("3","Swamy","Kunta");
		
		List<Emp> empList = new ArrayList<Emp>();
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		List<String> namesList=  new ArrayList<String>();
		
		for(int i=0 ;i<empList.size() ;i++) {
			namesList.add(empList.get(i).getFirstName()+"_"+empList.get(i).getLastName());
		}
		
		System.out.println("Names List\t"+namesList);
		System.out.println("***************Java 1.8 Feature ::Names\t::");
		empList.stream().map(e->e.getFirstName()+"_"+e.getLastName()).forEach(System.out::println);
		Map<String,String> empNamesMap= empList.stream().collect(Collectors.toMap(emp->emp.getId(), emp->(emp.getFirstName()+" "+emp.getLastName())));
		System.out.println("empNamesMap \t::"+empNamesMap);
		
		Map<String,Emp> empMaps= empList.stream().collect(Collectors.toMap(emp->emp.getId(), emp->emp));
		System.out.println("empMaps \t::"+empMaps);
		
		Map<String,Emp> empMaps1= empList.stream().collect(Collectors.toMap(Emp::getId, emp->emp));
		System.out.println("empMaps \t::"+empMaps);
		
	}

}
