package com.softura.softclinicapp.dao;

import com.softura.softclinicapp.models.Employee;

import java.io.IOException;

public interface EmployeeDao {

    void addEmployees(Employee[] employees) throws IOException;

}
