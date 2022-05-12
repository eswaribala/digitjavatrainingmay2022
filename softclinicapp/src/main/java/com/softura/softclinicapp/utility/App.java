package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.facades.EmployeeSorter;
import com.softura.softclinicapp.models.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class App {

    public static void main(String[] args){

        //sort the employees by username or by doj without modifying employee class

        Employee[] employees =new Employee[5];
        Employee employee=null;
        for(int i=0;i<5;i++){
           employee=new Employee();
           employee.setUserName("user"+i);
           employee.setPassword("Test@"+new Random().nextInt(10000));
           employee.setDepartment(Department.Lab);
           employee.setDoj(LocalDate.of(2000+new Random().nextInt(20),
                   1+new Random().nextInt(11),
                   1+new Random().nextInt(26)));
           employees[i]=employee;
        }
        System.out.println("Before Sorting....");
        for(Employee employeeObj:employees){
            System.out.println(employeeObj);
        }

        Arrays.sort(employees,new EmployeeSorter());

        System.out.println("After Sorting....");
        for(Employee employeeObj:employees){
            System.out.println(employeeObj);
        }

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.gc();
    }
}
