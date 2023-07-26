package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.libraryManagementSimulation;

public class Author{
    private String name;

    public Author(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public void printAuthorInfo(){
        System.out.println("------ AUTHORS INFO ------"+'\n'+
                "Author name: "+name);
        System.out.println();
    }
}
