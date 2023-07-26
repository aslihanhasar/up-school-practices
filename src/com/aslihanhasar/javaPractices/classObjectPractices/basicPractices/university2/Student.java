package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.university2;

public class Student {
    private String id;
    private String name;
    private Department department;
    private Professor advisor;
    private Course[] coursesTaken;

    public Student(String id, String name, Department department) {
        this.name = name;
        this.department = department;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setAdvisor(Professor advisor) {
        this.advisor = advisor;
    }

    public Professor getAdvisor() {
        return advisor;
    }
}
