package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.dao.EmployeeDao;
import com.softura.softclinicapp.dao.EmployeeImpl;
import com.softura.softclinicapp.exceptions.UserNameException;
import com.softura.softclinicapp.models.Employee;

import java.io.IOException;

public class FileApp {

    public static  void main(String[] args) {
        Employee employee=null;
        EmployeeDao employeeDao;
        try
        {
            employee=new Employee();
            employee.setUserName("eswaribala");
            employee.setPassword("Test@1213");
            employee.setEmail("param@gmail.com");
            employee.setAdharCard("A2123324");
            employeeDao=new EmployeeImpl();
            employeeDao.addEmployee(employee);

        }
        catch(UserNameException ex){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
