package com.softura.java8features.utility;

import com.softura.java8features.interfaces.AppointmentFacade;
import com.softura.java8features.models.Appointment;
import com.softura.java8features.models.SofturaOTPGenertaor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args){

        //existing
        Runnable runnable=()->{
            System.out.println(Thread.currentThread().getName());
        };

        runnable.run();

        //custom function interface

      List<Appointment> appointmentList=new ArrayList<Appointment>();
      Appointment appointment=null;
      for(int i=0;i<100;i++){
          appointment=new Appointment();
          appointment.setPatientNo(new Random().nextInt(100000000));
          appointment.setDoa(LocalDate.now());
          appointment.setDoctorName("doctor"+new Random().nextInt(1000));
          appointmentList.add(appointment);
      }

        Comparator<Appointment> comparator=(a1,a2)->{
         return (int) (a1.getPatientNo()-a2.getPatientNo());
        };
      //sort the appointment
      appointmentList.sort(comparator);

      for(Appointment appt:appointmentList)
          System.out.println(appt);


      System.out.println(new SofturaOTPGenertaor().getOTP());

    }

}
