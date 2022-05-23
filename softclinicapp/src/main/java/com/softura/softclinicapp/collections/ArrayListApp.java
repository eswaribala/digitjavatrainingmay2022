package com.softura.softclinicapp.collections;

import com.softura.softclinicapp.models.Department;
import com.softura.softclinicapp.models.Employee;

import java.time.LocalDate;
import java.util.*;

public class ArrayListApp {

public static void main(String[] args){

    List<Employee> employees=new ArrayList<Employee>();

    Employee employee=null;
    for(int i=0;i<100;i++){
        employee=new Employee();
        employee.setUserName("user"+i);
        employee.setPassword("Test@123");
        employee.setDepartment(Department.Lab);
        employee.setDoj(LocalDate.of(2000+new Random().nextInt(21),1+new Random().nextInt(10),
                1+new Random().nextInt(25)));
        employees.add(employee);
    }



    //sort the employees

    employees.sort(new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {

           return o1.getDoj().compareTo(o2.getDoj());
        }
    });

    //iterate the list
    Iterator<Employee> itr=employees.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
        employees.add(new Employee());
    }



}

}
