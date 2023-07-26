package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.university2;

public class Classroom {
    String code;
    Department department;
    Course courses;

    public Classroom(String code,Department department){
        this.code=code;
        this.department=department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }
}
