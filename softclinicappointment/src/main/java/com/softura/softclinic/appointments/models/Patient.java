package com.softura.softclinic.appointments.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient extends Person{
    private long patientNo;

    //has relationship
    Appointment[] appointments;
}
