package com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.test;

import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.dao.EmployeeDao;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.domain.Employee;
import com.aslihanhasar.javaPractices.classObjectPractices.dataAccessObjects.service.EmployeeService;

public class Test {
    public static void main(String[] args) {
        EmployeeDao employeeDao=new EmployeeDao();
        EmployeeService employeeService=new EmployeeService(employeeDao);

        Employee employee=new Employee(55,"asli",2015,"software engineering","asli123");
        employeeService.createEmployee(employee);
        employeeService.changePassword(employee,"dasdsa");

    }
}
