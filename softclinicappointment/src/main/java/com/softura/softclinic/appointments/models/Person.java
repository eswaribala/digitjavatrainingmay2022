package com.softura.softclinic.appointments.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor

public class Person {
    int personId=67;

   static {
       System.out.println("Accessing Person class");
   }

   Person(){
       System.out.println("Accessing Person Constructor.....");
   }
    private String name;
    private LocalDate dob;
    private String email;

    {
        System.out.println("PersonId"+personId);
    }
}
