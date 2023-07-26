package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.libraryManagementSimulation;

public class User {
    private String name;
    private String email;
    private int age;

    public User(String name,String email,int age){
        this.name=name;
        this.email=email;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printUserInfo(){
        System.out.println("------- USERS INFO -------"+'\n'+
                "User name : "+name+'\n'+
                "User email : "+email+'\n'+
                "User age : "+age);
        System.out.println();
    }

}
