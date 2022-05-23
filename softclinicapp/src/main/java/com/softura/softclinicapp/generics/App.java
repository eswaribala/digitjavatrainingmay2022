package com.softura.softclinicapp.generics;

import com.softura.softclinicapp.models.Department;
import com.softura.softclinicapp.models.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


@AllArgsConstructor
@NoArgsConstructor
public class App<E>  {

    private List<E> data;


    public void setData(List<E> value){
        this.data=value;
    }

    public List<E> getData(){
      return data;
    }


   public static  void main(String[] args){

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
       App<Employee> appEmployee=new App<Employee>(employees);
       appEmployee.data.sort(new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.getDoj().compareTo(o2.getDoj());
           }
       });

       List<String> trainees=new ArrayList<String>();
       App<String> appString=new App<String>(trainees);
      appString.data.sort(new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {
              return o1.compareTo(o2);
          }
      });

   }



}
