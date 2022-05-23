package com.softura.java8features.utility;

import com.softura.java8features.models.Appointment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StreamDemo {

    public static void main(String[] args){

        List<Appointment> appointmentList=new ArrayList<Appointment>();
        Appointment appointment=null;
        for(int i=0;i<100;i++){
            appointment=new Appointment();
            appointment.setPatientNo(new Random().nextInt(100000000));
            appointment.setDoa(LocalDate.now());
            appointment.setDoctorName("doctor"+new Random().nextInt(1000));
            appointmentList.add(appointment);
        }

        //stream
       int count= (int) appointmentList.stream()
                .sorted((a1,a2)->{
            return (int) (a1.getPatientNo()-a2.getPatientNo());
        })
                .map(a->a.getPatientNo())
                .filter(a->a>7000000)
                .count();
       System.out.println(count);

    }


}
