package com.softura.springcoredemo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Report {

    @Autowired
    private DataRepository dataRepository;
}
