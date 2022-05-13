package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.exceptions.UserNameException;
import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.models.Patient;
import com.softura.softclinicapp.models.Person;

public class ExceptionDemo {

    public static void main(String[] args){

      Employee employee=new Employee();
      try {
          employee.setUserName("bala");
          System.out.println(employee.getUserName());
      }

      catch(NullPointerException | UserNameException ex){
          System.out.println(ex.getMessage());
         StackTraceElement[] stackTraceElements= ex.getStackTrace();
         for(StackTraceElement stackTraceElement:stackTraceElements){
             System.out.println(stackTraceElement.getClassName());
             System.out.println(stackTraceElement.getMethodName());
             System.out.println(stackTraceElement.getLineNumber());
             System.out.println(stackTraceElement.getFileName());
         }

      }

    }

}
