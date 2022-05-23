package com.softura.softclinicapp.generics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


public class SuperClass<T> {

    protected T superData;

    public SuperClass(T superData) {
        this.superData = superData;
    }
}
