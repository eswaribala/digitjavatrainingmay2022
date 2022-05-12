package com.softura.softclinicapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.time.LocalDate;

@Data

public abstract class Person {

    private long mobileNo;
    private FullName name;
    private LocalDate dob;
    private Gender gender;
    private String email;
    private String adharCard;
    private Address[] addresses;

    public abstract void onBoarding();

    //concrete



}
