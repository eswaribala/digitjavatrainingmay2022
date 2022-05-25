package com.softura.springcoredemo.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DBRepository implements  DataRepository{
    @Override
    public void write(Prescription prescription) {

    }
}
