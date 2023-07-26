package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.libraryManagementSimulation;

public class LibraryWorker {
    private String name;
    private String position;

    public LibraryWorker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
    public void printWorkerInfo(){
        System.out.println("------ WORKERS INFO ------"+'\n'+
                "Worker Name: "+name+'\n'+
                "Worker position: "+position);
        System.out.println();
    }
}
