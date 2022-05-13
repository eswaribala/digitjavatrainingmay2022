package com.softura.softclinicapp.exceptions;

import java.util.regex.Pattern;

public class EmployeeValidator {

    static String userNamePattern="[A-Za-z]{5,25}";

    public static boolean validateUserName(String userName){
        return Pattern.matches(userNamePattern,userName);
    }

}
