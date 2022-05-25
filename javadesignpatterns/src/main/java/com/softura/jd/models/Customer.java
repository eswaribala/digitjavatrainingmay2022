package com.softura.jd.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements  Cloneable{

    private long customerId;
    private String name;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
