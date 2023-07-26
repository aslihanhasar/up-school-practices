package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation.simulationWithAbstractClass;

import java.util.Random;

public class RegistrationOffice2 {

    public Student2 getAStudent(){
        Student2 student=null;
        Random random=new Random();
        int choice= random.nextInt(4);
        switch (choice){
            case 0->student=new VocationalStudent2(1, "James hash", 2020, "15.08.2000",
                    "Tourism Management");
            case 1->student=new MasterStudent2(4, "Ozan Toktop", 2020, "09.08.1996",
                    "Public Relations and The Media Management", "Carlos Gsoer");
            case 2->student=new UndergraduateStudent2(2, "Aslıhan Hasar", 2017, "15.07.1997",
                    "Software Engineering", "Java-Backend Developer");
            case 3->student=new PhdStudent2(5, "Jana Klan", 1990, "15.07.1970",
                    "History Science", "Srile Corfs");
        }
        return student;
    }

    public void registerStudent(Student2 student){
        student.register();
    }

}
