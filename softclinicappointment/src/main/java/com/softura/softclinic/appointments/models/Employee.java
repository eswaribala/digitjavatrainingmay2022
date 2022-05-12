package com.softura.softclinic.appointments.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {

    static String clinicName="VEB DENTAL CARE";
    static {
        System.out.println("Accessing Employee Static Block"+clinicName);
    }
    private String userName;
    private String password;

    {
        System.out.println("User Name"+userName);
    }

}
