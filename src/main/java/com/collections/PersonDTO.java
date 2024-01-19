package com.collections;

public class PersonDTO {

	private String name;
	private int age;
	private String gender;
<<<<<<< HEAD


	public PersonDTO(){ super(); }

	public PersonDTO( String name, int age, String gender){
=======
	
	public PersonDTO(String name, int age, String gender) {
		super();
>>>>>>> 4d6c852ea0e77e5fa63d2b7d92e46ea4dd826ae3
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
<<<<<<< HEAD

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


=======
	
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
	    public int hashCode() {
	        return 31 * name.hashCode() + age;
	    }
	 
	@Override
	public boolean equals(Object obj) {
		PersonDTO personDTO = (PersonDTO)obj;
		if(this.getName().equals(personDTO.getName()) && this.getAge() == personDTO.getAge()) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
//1 . Create a list with 6 unique entries and 2 duplicate entries and Display.
//2 . Create persons groups by gender and Print the count of personse under the same gender.
//3 . Create a utility method to Identify the repeated/duplicate PersonDTO whose name ,age and gender are same.
//4 . Create a utility method to display only
		//-- Females
		//--Age >20 and < 30
	
	
>>>>>>> 4d6c852ea0e77e5fa63d2b7d92e46ea4dd826ae3
}
