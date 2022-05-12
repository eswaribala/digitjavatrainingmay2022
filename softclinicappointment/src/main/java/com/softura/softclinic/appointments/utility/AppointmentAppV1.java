package com.softura.softclinic.appointments.utility;

import com.softura.softclinic.appointments.models.Appointment;
import com.softura.softclinic.appointments.models.Patient;

import java.time.LocalDate;

public class AppointmentAppV1 {

    public static void main(String[] args){
       //parameterized constructor
        Appointment appointment=new Appointment(9952032675L, LocalDate.of(2022,5,22),
                "18:30pm","Dr.Vignesh");
        appointment.validateAppointment(LocalDate.now());

        Patient patient=new Patient();

        //instanceof

        if(patient instanceof Patient)
            System.out.println("patient belongs to Patient class");
         if(appointment.getDoctorName() instanceof String)
             System.out.println("true");

    }
}
