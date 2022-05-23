package com.softura.java8features.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
private long patientNo;
private LocalDate doa;
private String doctorName;

}
