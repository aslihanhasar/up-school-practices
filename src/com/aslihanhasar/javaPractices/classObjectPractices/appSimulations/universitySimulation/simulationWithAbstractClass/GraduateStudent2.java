package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

public abstract class GraduateStudent2 extends Student2 {
    protected String advisor;
    protected String thesis;

    public GraduateStudent2(int no, String name, int year, String dob, String major,String advisor){
        super(no, name, year, dob, major);
        this.advisor=advisor;
    }

    public abstract void meetWithAdvisor();

    public abstract void writeThesis();

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getThesis() {
        return thesis;
    }

    public void setThesis(String thesis) {
        this.thesis = thesis;
    }
}
