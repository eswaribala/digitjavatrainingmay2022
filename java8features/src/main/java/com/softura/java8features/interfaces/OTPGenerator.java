package com.softura.java8features.interfaces;

import java.util.Random;

public interface OTPGenerator {

    //default methods

    default int getOTP(){

        return new Random().nextInt(999999);
    }

    static int getOTPValue(){
        return new Random().nextInt(999999);
    }

}
