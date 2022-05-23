package com.softura.softclinicapp.collections;

import com.softura.softclinicapp.models.Department;
import com.softura.softclinicapp.models.Employee;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueDemo {

    public static void main(String[] args){
//natural ordering
        PriorityQueue<Employee> employees=new PriorityQueue<Employee>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getDoj().compareTo(o2.getDoj());
            }
        });
        Employee employee=null;
        for(int i=0;i<100;i++){
            employee=new Employee();
            employee.setUserName("user"+i);
            employee.setPassword("Test@123");
            employee.setDepartment(Department.Lab);
            employee.setDoj(LocalDate.of(2000+new Random().nextInt(21),1+new Random().nextInt(10),
                    1+new Random().nextInt(25)));
            employees.offer(employee);
        }

        while(!employees.isEmpty()){
            System.out.println(employees.poll());
        }

    }
}
