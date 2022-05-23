package com.softura.softclinicapp.generics;

import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.models.Person;

public class InheritedApp {

    public static void main(String[] args){
        SubClass<String,Integer> subClass=new SubClass<String,Integer>("Softura",36587);
        SubClass<Person, Employee>   subType=new SubClass<Person,Employee>(new Employee(),new Employee());

    }

}
