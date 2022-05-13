package com.softura.softclinicapp.utility;

import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.models.Patient;
import com.softura.softclinicapp.models.Person;

public class ExceptionDemo {

    public static void main(String[] args){
        int numerator=100;
        int denominator=10;
        String appName=null;
       // Employee employee=new Patient();
        try {
            System.out.println(numerator / denominator);
            System.out.println(appName.length());
        }
        catch(ArithmeticException ex){
           System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Testing exceptions....");

    }

}
