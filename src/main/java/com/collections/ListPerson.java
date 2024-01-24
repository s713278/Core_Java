package com.collections;

import java.util.*;


//1 . Create a list with 6 unique entries and 2 duplicate entries and Display.
//2 . Create persons groups by gender and Print the count of personse under the same gender.
//3 . Create a utility method to Identify the repeated/duplicate PersonDTO whose name ,age and gender are same.
//4 . Create a utility method to display only
//-- Females
//--Age >20 and < 30


public class ListPerson {


    public static void main(String[] args) {


        // #1
        List<PersonDTO> personList = new ArrayList<>();

        personList.add(new PersonDTO(1, "Swamy", 39, "Male"));
        personList.add(new PersonDTO(2, "Dean", 38, "Male"));
        personList.add(new PersonDTO(3, "Jessica", 40, "Female"));
        personList.add(new PersonDTO(4, "Mike", 37, "Male"));
        personList.add(new PersonDTO(5, "Jessica", 40, "Female"));
        personList.add(new PersonDTO(6, "Rocky", 1, "Male"));
        personList.add(new PersonDTO(7, "Tank", 9, "Male"));
        personList.add(new PersonDTO(8, "Swamy", 39, "Male"));
        personList.add(new PersonDTO(9, "Makayla", 26, "Female"));
        personList.add(new PersonDTO(10, "Karen", 29, "Female"));

        for (PersonDTO person : personList) {
            System.out.println("Person :" + person.toString());
        }
        System.out.println("-----------2--------------");
        //#2

        List maleList = new ArrayList<>();
        List femaleList = new ArrayList<>();
        Map<String, List> genderMap = new HashMap<>();

        for (PersonDTO person : personList) {
            if (person.getGender().equals("Male")) {
                maleList.add(person);
            } else {
                femaleList.add(person);
            }
            genderMap.put("Men", maleList);
            genderMap.put("Females", femaleList);
        }
        System.out.println("Number of men: " + genderMap.get("Men").size());
        System.out.println("Number of women: " + genderMap.get("Females").size());


        Iterator iterator = genderMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "  ---   " + entry.getValue());
        }
        System.out.println("----------3---------------");
        //#3
        List<Object> samePersonList = new ArrayList<>();
        Set<PersonDTO> personSet = new HashSet<PersonDTO>();
        Set<PersonDTO> duplicatePersonsSet = new HashSet<PersonDTO>();
        for (int i = 0; i < personList.size(); i++) {
            if (personSet.add(personList.get(i))) {
                personSet.add(personList.get(i));
            } else {
                duplicatePersonsSet.add(personList.get(i));
            }
        }
        System.out.println(" Duplicate Set Size :" + duplicatePersonsSet.size());
        System.out.println("List Size :" + personList.size());
        System.out.println("----------4---------------");
        //#4
        // List<Object> femaleList = new ArrayList<>();

        for (PersonDTO person : personList) {
            if (person.getGender().equals("Female") && person.getAge() > 20 && person.getAge() < 30) {
                femaleList.add(person);
            }
        }
        System.out.println("---------5----------------");
        //5
        Map<Integer, PersonDTO> idMap = new HashMap<>();
        for (PersonDTO person : personList) {
            idMap.put(person.getId(), person);
        }

        Iterator iterator1 = idMap.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator1.next();
            System.out.println(entry.getKey() + "  ---   " + entry.getValue());
        }
        System.out.println("-----------6--------------");


        //6
        Iterator iterator2 = idMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            System.out.println(entry.getKey());
        }
        System.out.println("----------7---------------");

        //7
        Integer oldest = 0;


        Iterator iterator3 = idMap.entrySet().iterator();
        PersonDTO oldestPerson = null;
        while (iterator3.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator3.next();
            PersonDTO person = (PersonDTO) entry.getValue();
            if (person.getAge() > oldest) {
                oldest = person.getAge();
                oldestPerson = person;
            }
        }
        System.out.println(oldestPerson);
    }
}
