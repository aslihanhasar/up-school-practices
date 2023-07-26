package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation;


public class Main {
    public static void main(String[] args) {
        RegistrationOffice registrationOffice=new RegistrationOffice();
        Student student=registrationOffice.getAStudent();
        System.out.println(student);

        registrationOffice.registerStudent(student);

        //MasterStudent masterStudent=(MasterStudent) student; //ClassCastException

        PhdStudent phdStudent=new PhdStudent(6,"aslıhan",2023,"15.07.1997","soft","klara",true);
        registrationOffice.printExtraInfo(student);

        /*if(student instanceof GraduateStudent g){
            g=phdStudent;
            g.writeThesis();
        }
         */
    }
}
