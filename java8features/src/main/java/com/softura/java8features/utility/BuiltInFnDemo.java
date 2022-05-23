package com.softura.java8features.utility;

import com.softura.java8features.interfaces.OTPGenerator;
import com.softura.java8features.interfaces.TriFunction;
import com.softura.java8features.models.Appointment;
import com.softura.java8features.models.SofturaOTPGenertaor;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.*;

public class BuiltInFnDemo {

    public static void main(String[] args){
        //Function

        Function<Appointment, Boolean> function=(appointment)->{
            boolean status=false;
            if(appointment.getPatientNo()>0)
                status=true;
            return status;
        };

      System.out.println(function.apply(new Appointment(284892, LocalDate.now(),"doctor1")));

     //BiFunction
        BiFunction<Appointment,LocalDate,Boolean> biFunction=(appointment, localDate) -> {
            boolean status=false;
            if(appointment.getDoa().isAfter(localDate))
                status=true;
            return status;
        };

        System.out.println(biFunction.apply(new Appointment(284892, LocalDate.now(),
                "doctor1"),LocalDate.now()));


       //TriFunction
        TriFunction<Appointment,LocalDate,String,Boolean> triFunction=(appointment, localDate, doctorName) -> {
            boolean status=false;
            if((appointment.getDoa().isAfter(localDate)) &&  doctorName.equals("doctor1")) {
                status = true;
            }
            return status;
        };

        System.out.println(triFunction.apply(new Appointment(284892, LocalDate.now(),
                "doctor1"),LocalDate.now(),"doctor1"));


       //consumer
        Consumer<Appointment> consumer=(appointment -> {
            System.out.println(appointment);
        }) ;

        consumer.accept(new Appointment(284892, LocalDate.now(),
                "doctor1"));


        //Supplier
        //instance
        //constructor reference
        Supplier<Appointment> supplier=Appointment::new;

        System.out.println(supplier.get().getPatientNo());

        //static method reference
        Supplier<Integer> otpSupplier= OTPGenerator::getOTPValue;

        System.out.println(otpSupplier.get());


        Supplier<SofturaOTPGenertaor> otpInstanceSupplier= SofturaOTPGenertaor::new;

        System.out.println(otpInstanceSupplier.get().getOTP());


        //predicate
        Predicate<Appointment> predicate=(appointment)->{
           return appointment.getPatientNo()>0;
        };

        predicate.test(new Appointment(284892, LocalDate.now(),
                "doctor1"));


        //method reference

        Function<Integer,String> functionToString=Integer::toBinaryString;
        System.out.println(functionToString.apply(new Random().nextInt(10)));




    }
}
