package com.softura.springcoredemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dbRepository")
@Primary
@Data
@AllArgsConstructor
@NoArgsConstructor
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DBRepository implements  DataRepository{
    private String schemaName;
    @Override
    public void write(Prescription prescription) {

    }
}
