package com.softura.jd.utility;

import com.softura.jd.models.Customer;

public class App {

    public static void main(String[] args){
        //prototype design

        Customer customer=new Customer(1,"Param");
        System.out.println(customer);
        //cloning
        try {
            Customer customer1= (Customer) customer.clone();
            customer.setName("Eswari");
            System.out.println(customer1);
            System.out.println(customer);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
