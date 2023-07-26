package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.db;

import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Employee;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Entity;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Product;

public class DBConnection {
    public void save(Object o) {
        System.out.println("Saving object: "+o);
    }
    public void update(Object o) {
        System.out.println("Updating object: "+o);
    }

    public Entity load(Class c,int id){
        System.out.println("Retrieving object by id: " + id);
        Entity e;
        if(c.getName().equalsIgnoreCase("com.aslihanhsr.oop.dataAccessObjects.domain.Product"))
            e = new Product(id, "11111111", "A pen.", 2.19, 0.01);
        else
            e = new Employee(id, "Ali", 4, "Production", "xxx");
        return e;
    }
}
