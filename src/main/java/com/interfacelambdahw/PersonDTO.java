package com.interfacelambdahw;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class PersonDTO {

    private String firstName;
    private String lastName;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birdobthDay;

    public PersonDTO() {
    }

    public PersonDTO(String firstName, String lastName, Date birdobthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birdobthDay = birdobthDay;
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

    public Date getBirdobthDay() {
        return birdobthDay;
    }

    public void setBirdobthDay(Date birdobthDay) {
        this.birdobthDay = birdobthDay;
    }

    @Override
    public String toString() {
        return "Person1DTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birdobthDay=" + birdobthDay +
                '}';
    }
}
