package com.softura.springcoredemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Component
public class Prescription {
    private Date dop;
    private String doctorName;
    private String medicineName;
    private String dosage;
    private String duration;

}
