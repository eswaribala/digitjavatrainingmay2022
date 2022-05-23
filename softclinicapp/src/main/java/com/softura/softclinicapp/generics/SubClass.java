package com.softura.softclinicapp.generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


public class SubClass<T,V> extends SuperClass<T>{

    private V subData;

    public SubClass(T superData, V subData) {
        super(superData);
        this.subData = subData;
    }
}
