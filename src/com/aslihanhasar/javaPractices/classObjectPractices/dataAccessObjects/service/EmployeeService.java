package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.service;


import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.dao.AbstractDao;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.dao.EmployeeDao;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Employee;

public class EmployeeService {
    private AbstractDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao){
        this.employeeDao=employeeDao;
    }

    public void changePassword(Employee employee, String newPassword){
        employee.setPassword(newPassword);
        employeeDao.update(employee);
    }

    public void createEmployee(Employee employee){
        employeeDao.save(employee);
    }
}
