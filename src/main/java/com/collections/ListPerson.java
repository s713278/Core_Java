package com.collections;

import java.util.ArrayList;
import java.util.List;


//1 . Create a list with 6 unique entries and 2 duplicate entries and Display.
//2 . Create persons groups by gender and Print the count of personse under the same gender.
//3 . Create a utility method to Identify the repeated/duplicate PersonDTO whose name ,age and gender are same.
//4 . Create a utility method to display only
//-- Females
//--Age >20 and < 30

public class ListPerson {

    public static void main(String[] args) {

        List<PersonDTO> personList = new ArrayList<>();

        personList.add(new PersonDTO("Swamy", 39, "Male"));
        personList.add(new PersonDTO("Dean", 38, "Male"));
        personList.add(new PersonDTO("Jessica", 40, "Female"));
        personList.add(new PersonDTO("Mike", 37, "Male"));
        personList.add(new PersonDTO("Rocky", 1, "Male"));
        personList.add(new PersonDTO("Tank", 9, "Male"));
        personList.add(new PersonDTO("Swamy", 38, "Male"));
    }
}
