package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;


public class UndergraduateStudent2 extends Student2{
    protected String minor;

    public UndergraduateStudent2(int no, String name, int year, String dob, String major,String minor){
        super(no, name, year, dob, major);
        this.minor=minor;
    }

    @Override
    public void study() {
        System.out.println("Undergraduate student is studying in "+getMinor());
    }

    @Override
    public void register() {
        System.out.println("Undergraduate student is registered to the academic courses.");
    }

    public String getMinor() {
        return minor;
    }

    public void setMinor(String minor) {
        this.minor = minor;
    }
}
