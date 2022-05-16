package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.dao.EmployeeDao;
import com.softura.softclinicapp.dao.EmployeeImpl;
import com.softura.softclinicapp.exceptions.UserNameException;
import com.softura.softclinicapp.models.Employee;

import java.io.IOException;

public class FileApp {

    static void WriteContents(){
        Employee[] employees=new Employee[100];
        Employee employee=null;
        EmployeeDao employeeDao;
        for(int i=0;i<100;i++) {

            employee = new Employee();
            employee.setUserName("employee" + i);
            employee.setPassword("Test@1213");
            employees[i]=employee;
        }

        for(Employee employeeObj : employees){
            System.out.println(employeeObj);
        }




        try
        {
            employeeDao=new EmployeeImpl();
            employeeDao.addEmployees(employees);
        }

        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static  void main(String[] args) {

      //reading
        EmployeeDao employeeDao=new EmployeeImpl();
        try {
            employeeDao.getEmployees();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
