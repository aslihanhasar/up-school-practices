package com.aslihanhasar.javaPractices.classObjectPractices.appSimulations.universitySimulation;

import java.util.Random;

public class RegistrationOffice {

    public Student getAStudent() {
        Student student = null;
        Random random = new Random();
        int i = random.nextInt(6);
        switch (i) {
            case 0 -> student = new Student(0, "Ebrar", 2026, "11.12.2010", "Language");
            case 1 -> student = new VocationalStudent(1, "James hash", 2020, "15.08.2000",
                    "Tourism Management");
            case 2 -> student = new UndergraduateStudent(2, "Aslıhan Hasar", 2017, "15.07.1997",
                    "Software Engineering", "Java-Backend Developer");
            case 3 ->
                    student = new GraduateStudent(2, "Aslıhan Hasar", 2017, "15.07.1997",
                            "Software Engineering", "Akın Kaldıroğlu");
            case 4 ->
                    student = new MasterStudent(4, "Ozan Toktop", 2020, "09.08.1996",
                            "Public Relations and The Media Management", "Carlos Gsoer");
            case 5 ->
                    student = new PhdStudent(5, "Jana Klan", 1990, "15.07.1970",
                            "History Science", "Srile Corfs", true);
        }
        return student;
    }

    public void registerStudent(Student student) {
        student.register();
    }

    public void printExtraInfo(Student student){
        if(student instanceof MasterStudent m){
            m.setThesis("Metaverse");
            String thesisName=m.getThesis();
            System.out.println("Thesis Name: "+thesisName);
        }else if(student instanceof PhdStudent p){
            p.setThesis("Historical Things");
        }else if(student instanceof UndergraduateStudent ug){
            String minor=ug.getMinor();
            System.out.println(student.name+"'s minor area: "+minor);
        }else if(student instanceof VocationalStudent v){
            System.out.println("Vocational faculty is very far away from here.");
        }else if(student instanceof GraduateStudent g){
            System.out.println(student.name+" will graduate this year.");
        }else{
            System.out.println(student.name+" won the university.");
        }
    }
}
