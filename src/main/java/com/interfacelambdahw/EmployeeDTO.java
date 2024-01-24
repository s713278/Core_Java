package com.interfacelambdahw;

public class EmployeeDTO extends PersonDTO {

    private String dept;
    private String location;
    private int salary;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String dept, String location, int salary) {
        this.dept = dept;
        this.location = location;
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "dept='" + dept + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                '}';
    }
}
