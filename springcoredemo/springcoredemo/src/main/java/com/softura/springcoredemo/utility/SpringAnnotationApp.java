package com.softura.springcoredemo.utility;

import com.softura.springcoredemo.models.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAnnotationApp {
public static void main(String[] args){
    ApplicationContext ctx=new ClassPathXmlApplicationContext(
            "spring-annotation.xml");
     Report report= (Report) ctx.getBean("report");
    DBRepository dbRepository1= (DBRepository) ctx.getBean("dbRepository");
    dbRepository1.setSchemaName("Soturadb");
    DBRepository dbRepository2= (DBRepository) ctx.getBean("dbRepository");
    dbRepository2.setSchemaName("DigitalOceanDB");

    //lambda with spring
    DataRepository dataRepository=(prescription)->{
        System.out.println(prescription);
    };

    dataRepository.write(new Prescription());

    System.out.println(dbRepository1.getSchemaName());

    ApplicationContext applicationContext=new
            AnnotationConfigApplicationContext(Surgery.class);


    Prescription prescription= (Prescription) applicationContext
            .getBean("prescription");
    prescription.setDoctorName("Vignesh");
    prescription.setMedicineName("Dolofur");

    System.out.println(prescription.getMedicineName());

}

}
