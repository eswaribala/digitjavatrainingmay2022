package com.softura.springcoredemo.models;

import org.springframework.stereotype.Component;

@Component
public interface DataRepository {

    void write(Prescription prescription);
}
