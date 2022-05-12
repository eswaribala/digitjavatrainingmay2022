package com.softura.softclinic.appointments.utility;

import java.time.LocalDate;

public class App {

    //class variables
    static String organizationName;
    //instance variable
    private LocalDate doa;

    public static void dataRanges(){
        //local variables;
        byte age= (byte) 128;
        System.out.println(age);

        //unicode characters
        System.out.println("\u0041");

        //variable
        String $firstName="Parameswari";
        System.out.println("First Name="+$firstName);
        String App="Clinic Application";

        //constant
        final double NORMALBODYTEMP=36.4;

        System.out.println(NORMALBODYTEMP);

        //literals

        long mobileNo=9952032876L;
        int testedData=056;
        System.out.println(testedData);
        testedData=0xFF;
        System.out.println(testedData);

        float height=168.2f;
        boolean status=true;

        //access class variable
        System.out.println(organizationName);

        //access instance variable
        System.out.println(new App().doa);


    }

    public static void main(String[] args){

        System.out.println("Started Application using Gradle.....");
        dataRanges();

    }
}


