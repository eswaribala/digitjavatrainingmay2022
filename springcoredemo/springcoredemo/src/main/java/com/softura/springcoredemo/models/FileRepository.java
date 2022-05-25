package com.softura.springcoredemo.models;

import org.springframework.stereotype.Component;

@Component
public class FileRepository implements DataRepository{
    @Override
    public void write(Prescription prescription) {

    }
}
