package com.softura.springcoredemo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Report {

    @Autowired
    private DataRepository dataRepository;
}
