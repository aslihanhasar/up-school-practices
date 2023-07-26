package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.db;

public class ConnectionFactory {

    public DBConnection getConnection(){
        return new DBConnection();
    }
}
