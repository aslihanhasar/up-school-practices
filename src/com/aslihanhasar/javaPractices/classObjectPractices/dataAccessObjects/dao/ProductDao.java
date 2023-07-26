package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.dao;

import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Entity;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Product;

public class ProductDao extends AbstractDao{

    @Override
    public void save(Entity entity) {
        System.out.println("Saving product entity: "+entity);
        db.save(entity);
    }

    @Override
    public void update(Entity entity) {
        System.out.println("Updating product entity: "+entity);
        db.update(entity);
    }

    @Override
    public Product retrieve(Class cl, int id) {
        System.out.println("Retrieving Product entity.");
        return (Product) db.load(cl,id);
    }
}
