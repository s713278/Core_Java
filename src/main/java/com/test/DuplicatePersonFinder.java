package com.test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (not shown for brevity)

    // Override equals and hashCode to compare persons based on name and age
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
}

public class DuplicatePersonFinder {
    public static List<Person> findDuplicatePersons(List<Person> persons) {
        Set<Person> uniqueSet = new HashSet<>();
        List<Person> duplicatePersons = new ArrayList<>();

        for (Person person : persons) {
            if (!uniqueSet.add(person)) {
                // If the person is not added to the set, it's a duplicate
                duplicatePersons.add(person);
            }
        }

        return duplicatePersons;
    }

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 25));
        persons.add(new Person("Jane", 30));
        persons.add(new Person("John", 25));
        persons.add(new Person("Doe", 28));
        persons.add(new Person("Jane", 30));

        List<Person> duplicatePersons = findDuplicatePersons(persons);

        System.out.println("Original List: " + persons);
        System.out.println("Duplicate Persons: " + duplicatePersons);
    }
}
