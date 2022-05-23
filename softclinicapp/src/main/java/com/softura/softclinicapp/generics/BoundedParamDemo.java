package com.softura.softclinicapp.generics;

import com.softura.softclinicapp.models.Employee;
import com.softura.softclinicapp.models.Patient;
import com.softura.softclinicapp.models.Person;

public class BoundedParamDemo {

    private Person person;
    //bounded by super type
    <T extends Person> BoundedParamDemo(T obj){
            this.person=obj;
    }


    public static void main(String[] args){

        BoundedParamDemo boundedParamDemo=new BoundedParamDemo(new Employee());
        boundedParamDemo=new BoundedParamDemo(new Patient());


    }

}
