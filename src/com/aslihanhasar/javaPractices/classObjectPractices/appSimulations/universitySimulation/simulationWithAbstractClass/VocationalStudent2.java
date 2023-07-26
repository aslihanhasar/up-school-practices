package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

public class VocationalStudent2 extends Student2 {

    public VocationalStudent2(int no, String name, int year, String dob, String major){
        super(no, name, year, dob, major);
    }

    @Override
    public void study() {
        System.out.println("Vocational student is studying.");
    }

    @Override
    public void register() {
        System.out.println("Vocational student is registered to the associate degree ");
    }
}
