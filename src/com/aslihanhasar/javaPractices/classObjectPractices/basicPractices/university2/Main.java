package com.aslihanhasar.javaPractices.classObjectPractices.basicPractices.university2;

public class Main {
    public static void main(String[] args) {
        Professor headProfessor=new Professor("566","Alexandra Dilbert");
        Department department=new Department("Computer Engineering",headProfessor);
        Student student=new Student("5656","asli",department);
        Professor adviseeProfessor=new Professor("6565","Klara Bloom",student,department);
        Course course=new Course("6565656","cmp",department);

        System.out.println(student.getDepartment().headProfessor.name);
        System.out.println(student.getAdvisor().department.name);
    }

}
