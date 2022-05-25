package com.softura.springcoredemo.utility;

import com.softura.springcoredemo.models.Prescription;
import com.softura.springcoredemo.models.Report;
import com.softura.springcoredemo.models.Surgery;
import com.softura.springcoredemo.models.Treatment;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAnnotationApp {
public static void main(String[] args){
    ApplicationContext ctx=new ClassPathXmlApplicationContext(
            "spring-annotation.xml");
     Report report= (Report) ctx.getBean("report");


    ApplicationContext applicationContext=new
            AnnotationConfigApplicationContext(Surgery.class);


    Prescription prescription= (Prescription) applicationContext
            .getBean("prescription");
    prescription.setDoctorName("Vignesh");
    prescription.setMedicineName("Dolofur");

    System.out.println(prescription.getMedicineName());

}

}
