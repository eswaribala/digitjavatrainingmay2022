package com.softura.springcoredemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Treatment.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Surgery {
    private String organName;



}
