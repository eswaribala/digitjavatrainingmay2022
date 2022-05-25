package com.softura.springcoredemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Data
@NoArgsConstructor
@AllArgsConstructor
//@Component("treatment1")
//@Component
@Configuration
public class Treatment {
    //@Autowired(required = false)
    //@Qualifier("prescription1")
    @Autowired
    private Prescription prescription;


    @Bean("prescription")
    public Prescription getPrescription(){
        return new Prescription();
    }


}
