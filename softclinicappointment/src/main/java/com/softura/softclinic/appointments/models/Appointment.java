package com.softura.softclinic.appointments.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Appointment {

    private long patientMobileNo;
    private LocalDate doa;
    private String time;
    private String doctorName;

    public void validateAppointment(LocalDate doa){

        if(this.doa.isAfter(doa))
            System.out.println("Valid");
    }


}
