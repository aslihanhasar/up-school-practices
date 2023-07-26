package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.dao;

import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Employee;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Entity;

public class EmployeeDao extends AbstractDao{

    @Override
    public void save(Entity entity) {
        db.save(entity);
    }
    @Override
    public void update(Entity entity) {
        db.update(entity);
    }

    @Override
    public Employee retrieve(Class cl, int id) {
        return (Employee) db.load(cl,id);
    }


}
