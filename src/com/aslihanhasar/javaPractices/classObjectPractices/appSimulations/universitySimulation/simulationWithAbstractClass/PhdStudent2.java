package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

public class PhdStudent2 extends GraduateStudent2{

    private boolean qualifyingExamTake;

    public PhdStudent2(int no, String name, int year, String dob, String major, String advisor){
        super(no, name, year, dob, major, advisor);
    }

    @Override
    public void study() {
        System.out.println("PhD Student is studying");
        writePaper();
    }

    @Override
    public void register() {
        System.out.println("PhD Student is registered to the phD degree.");
    }

    @Override
    public void writeThesis() {
        System.out.println("Student is writing thesis and do research with advisor.");
    }

    @Override
    public void meetWithAdvisor() {
        System.out.println("Master student meets with advisor "+advisor);
        writeThesis();
    }

    public void writePaper() {
        System.out.println("PhD student writes paper.");
    }
}
