package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicateExample {

	public static void main(String[] args) {

		List<PersonDTO> personsList =new ArrayList<>();
		personsList.add(new PersonDTO("Swamy", 39, "Male"));
		personsList.add(new PersonDTO("Ram", 20, "Male"));
		personsList.add(new PersonDTO("Shyam", 45, "Male"));
		personsList.add(new PersonDTO("John", 15, "Male"));
		personsList.add(new PersonDTO("Ram", 20, "Male"));
		personsList.add(new PersonDTO("Swamy", 39, "Male"));
		
		
		Set<PersonDTO> duplicatePerson = new HashSet<>();
		for(PersonDTO dto : personsList) {
			if(false == duplicatePerson.add(dto)) {
				System.out.println("Duplicate Person Hashcode ::"+dto.hashCode() );
			}else {
				System.out.println("Unique Person Hashcode ::"+dto.hashCode() );
			}
			
		}
	}

}
