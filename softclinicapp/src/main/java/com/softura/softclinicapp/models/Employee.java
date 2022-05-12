package com.softura.softclinicapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {

    private String userName;
    private String password;
    private Department department;
    private LocalDate doj;


    @Override
    public void onBoarding() {

    }


}
