package com.softura.softclinicapp.utility;


import com.softura.softclinicapp.models.Team;

import java.util.ArrayList;
import java.util.List;

public class InnerClassDemo {

public static void main(String[] args){
    //boxing
    int size=100;
    Integer sizeObj= size;

    //unboxing
    size=sizeObj;

    int data=56;
    List<Integer> list=new ArrayList<Integer>();
     //autoboxing
    list.add(data);

    Byte dataByte=56;
}

}



