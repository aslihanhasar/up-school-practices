package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

public class MasterStudent2 extends GraduateStudent2{
    public MasterStudent2(int no, String name, int year, String dob, String major, String advisor){
        super(no, name, year, dob, major, advisor);
    }

    @Override
    public void register() {
        System.out.println(name+" registered to the master degree.");
    }

    @Override
    public void study() {
        System.out.println("Master student is studying");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master student meets with advisor "+advisor);
        writeThesis();
    }

    @Override
    public void writeThesis() {
        System.out.println("Master student is writing thesis.");
    }
}
