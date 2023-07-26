package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

public abstract class Student2 {
    protected int no;
    protected String name;
    protected int year;
    protected String dob;
    protected String major;

    public Student2(int no, String name, int year, String dob, String major){
        this.no=no;
        this.name=name;
        this.year=year;
        this.dob=dob;
        this.major=major;
    }

    public abstract void study();

    public abstract void register();

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", dob=" + dob +
                ", major='" + major + '\'' +
                '}';
    }
}

