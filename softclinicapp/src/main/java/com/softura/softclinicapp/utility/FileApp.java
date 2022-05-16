package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.dao.EmployeeDao;
import com.softura.softclinicapp.dao.EmployeeImpl;
import com.softura.softclinicapp.exceptions.UserNameException;
import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.threads.TitleThread;

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

    public static void readFileContent(){
        //reading
        EmployeeDao employeeDao=new EmployeeImpl();
        try {
            employeeDao.getEmployees();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void storeEmployeeObjects(){
        EmployeeDao employeeDao=new EmployeeImpl();
        Employee[] employees=new Employee[100];
        Employee employee=null;

        for(int i=0;i<100;i++) {

            employee = new Employee();
            employee.setUserName("employee" + i);
            employee.setPassword("Test@1213");
            employees[i]=employee;
        }
        try {
            employeeDao.addEmployeeObjects(employees);
        }
        catch(IOException ex){

        }
    }

    public static void readObjects(){
        EmployeeDao employeeDao=new EmployeeImpl();
        try {
            for(Employee emp: employeeDao.getEmployeeObjects())
            {
                System.out.println(emp);
            }
        } catch (IOException e) {

        }
    }

    public static  void main(String[] args) {

        TitleThread titleThread=new TitleThread("Beast");
        titleThread.start();


    }

}
