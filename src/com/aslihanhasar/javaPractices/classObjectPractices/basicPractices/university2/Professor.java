package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.university2;

public class Professor {
    String id;
    String name;
    Department department;
    Student advisee;
    Course[] coursesGiven;

    public Professor(String id,String name){
        this.id=id;
        this.name=name;
    }

    public Professor(String id,String name,Student advisee,Department department){
        this(id,name);
        this.advisee=advisee;
        this.department=department;
        advisee.setAdvisor(this);
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
