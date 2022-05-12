package com.softura.softclinicapp.facades;

import com.softura.softclinicapp.models.Employee;

import java.util.Comparator;

public class EmployeeSorter implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDoj().compareTo(o2.getDoj());
    }
}
