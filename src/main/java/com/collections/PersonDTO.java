package com.collections;

public class PersonDTO {

	private String name;
	private int age;
	private String gender;


	public PersonDTO(){ super(); }

	
	public PersonDTO(String name, int age, String gender) {
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "PersonDTO{" +
				"name='" + name + '\'' +
				", age=" + age +
				", gender='" + gender + '\'' +
				'}';
	}

}
