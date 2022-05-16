package com.softura.softclinicapp.dao;

import com.softura.softclinicapp.models.Employee;

import java.io.IOException;

public interface EmployeeDao {

    void addEmployees(Employee[] employees) throws IOException;

    void addEmployeeObjects(Employee[] employees) throws IOException;
    void getEmployees() throws IOException;

    Employee[] getEmployeeObjects() throws IOException;
}
