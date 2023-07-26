package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.university2;

public class Course {
    String code;
    String name;
    Professor professor;
    Department department;
    Classroom classroom;
    Student[] students;

    public Course(String code,String name,Department department){
        this.code=code;
        this.name=name;
        this.department=department;
    }

    public Course(String code,String name,Department department,Classroom classroom){
        this(code,name,department);
        this.classroom=classroom;

    }
}
