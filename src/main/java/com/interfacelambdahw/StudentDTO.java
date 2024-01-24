package com.interfacelambdahw;

public class StudentDTO extends PersonDTO {

    private String grade;
    private String schoolName;

    public StudentDTO() {
    }

    public StudentDTO(String grade, String schoolName) {
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "grade='" + grade + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
