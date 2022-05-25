package com.softura.java8features.utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args){

        List<String> names=new ArrayList<>();
        names.add("Anitha");
        names.add("Malini");
        names.add("Jayan");
        names.add("Subbu");

        //null pointer object pattern
     Optional<String> result=  names.stream().filter(n->n.startsWith("B")).findFirst();



    }
}
