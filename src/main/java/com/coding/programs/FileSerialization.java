package com.coding.programs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private String name ;
	private transient Integer age;
	private Gender gender;
	
	public Student() {
	}
	public Student(String name, Integer age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
enum Gender{
	MALE,
	FEMALE
}
public class FileSerialization {
	
	public static void serializeObject(Object o,String fileName) {
		try {
			FileOutputStream fileOut= new FileOutputStream(new File(fileName));
			ObjectOutputStream outputStream = new ObjectOutputStream(fileOut);
			outputStream.writeObject(o);
			outputStream.close();
			fileOut.close();
			System.out.println("Writing object to file is completed.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deSerializeObject(String fileName) {
		try {
			FileInputStream fileOut= new FileInputStream(new File(fileName));
			ObjectInputStream inputStream = new ObjectInputStream(fileOut);
			if(inputStream.readObject() instanceof Student) {
				System.out.println("Deserilized object\t:"+(Student)inputStream.readObject());
			}
			inputStream.close();
			fileOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Student student = new Student("Swamy Kunta",40,Gender.MALE);
		String fileName= "C:\\Users\\Mahi\\git\\spring-java-annotation\\object.ser";
		serializeObject(student,fileName);
		deSerializeObject(fileName);
	}

}
