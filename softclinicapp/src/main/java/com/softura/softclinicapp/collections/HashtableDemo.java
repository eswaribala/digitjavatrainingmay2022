package com.softura.softclinicapp.collections;

import com.softura.softclinicapp.models.Department;
import com.softura.softclinicapp.models.Employee;

import java.time.LocalDate;
import java.util.*;

public class HashtableDemo {

    public static void main(String[] args){
        Hashtable<Long,Employee> employees= new Hashtable<Long, Employee>();

        Employee employee=null;
        for(long i=0;i<100;i++){
            employee=new Employee();
            employee.setUserName("user"+i);
            employee.setPassword("Test@123");
            employee.setDepartment(Department.Lab);
            employee.setDoj(LocalDate.of(2000+new Random().nextInt(21),1+new Random().nextInt(10),
                    1+new Random().nextInt(25)));
            employees.put(i,employee);
        }



        //Map.Entry

         Iterator itr=employees.entrySet().iterator();
        Map.Entry<Long,Employee> emps=null;
        while(itr.hasNext()){
            emps= (Map.Entry<Long, Employee>) itr.next();
            System.out.println(emps.getKey()+","+emps.getValue());

        }



    }
}
