package com.softura.springcoredemo.utility;

import com.softura.springcoredemo.models.Prescription;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {
    public static void main(String[] args){
        Resource resource=new ClassPathResource("spring-core.xml");
        BeanFactory beanFactory=new XmlBeanFactory(resource);
        //IOC
        Prescription prescription= (Prescription) beanFactory
                .getBean("prescription");
        System.out.println(prescription);

    }
}
