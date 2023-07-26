package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.university2;

public class Department {
    String name;
    Professor headProfessor;
    Student[] students;
    Course[] courses;
    Classroom[] classrooms;

    public Department(String name,Professor headProfessor){
        this.name=name;
        this.headProfessor=headProfessor;
        headProfessor.setDepartment(this);
    }

    public Professor getHeadProfessor() {
        return headProfessor;
    }

    public void setHeadProfessor(Professor headProfessor) {
        this.headProfessor = headProfessor;
    }
}
