package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

public class Test {
    public static void main(String[] args) {
        RegistrationOffice2 registrationOffice=new RegistrationOffice2();
        Student2 student=registrationOffice.getAStudent();
        student.study();
        if(student instanceof MasterStudent2 masterStudent){
            masterStudent.setThesis("dsfsdfsdfsd");
            String thesisName=masterStudent.getThesis();
            System.out.println(thesisName);
        }
    }
}
