package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.dao;

import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.db.*;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Entity;

public abstract class AbstractDao {
    protected DBConnection db;

    public AbstractDao(){
        ConnectionFactory factory=new ConnectionFactory();
        db=factory.getConnection();
    }

    public abstract void save(Entity entity);
    public abstract void update(Entity entity);
    public abstract Entity retrieve(Class cl,int id);
}
