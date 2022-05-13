package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.exceptions.UserNameException;
import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.models.Patient;
import com.softura.softclinicapp.models.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) throws IOException {
    File file= new File("F:\\digitjavatrainingmay2022\\intellijprojects\\softclinicapp\\src\\main\\java\\com\\softura\\softclinicapp\\utility", "ExceptionDemo.java");



    Employee[] employees=new Employee[1];

      Employee employee=new Employee();
      employees[0]=employee;
      try {
          employee.setUserName("balasubramaniam");
          System.out.println(employee.getUserName());
          System.out.println(employees[1]);
      }

      catch(NullPointerException | UserNameException  ex){
          System.out.println(ex.getMessage());
         StackTraceElement[] stackTraceElements= ex.getStackTrace();
         for(StackTraceElement stackTraceElement:stackTraceElements){
             System.out.println(stackTraceElement.getClassName());
             System.out.println(stackTraceElement.getMethodName());
             System.out.println(stackTraceElement.getLineNumber());
             System.out.println(stackTraceElement.getFileName());
         }

      }

      catch(Exception ex){
          System.out.println(ex);
      }
        FileReader fileReader=null;
        try{

            try{
                fileReader=new FileReader(file);
                String n[]= new String[args.length];
                System.out.println(n[0]);	}
            catch(ArrayIndexOutOfBoundsException ae){
                System.out.println("Out of bounds");}
        }
        catch(NegativeArraySizeException ne){
            System.out.println("Array size cannot be negative");
        }
        finally{
            System.out.println("File Closing....");
            fileReader.close();
        }




    }

}
