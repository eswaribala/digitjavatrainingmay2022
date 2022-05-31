package com.softura.healthcareapi.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Endpoint(id = "hc")
@Component
public class HealthCareEndPoint {
    @Autowired
    private ApplicationContext applicationContext;

    @ReadOperation
    @Bean
    public String[] getBeanDefinitions(){
        return this.applicationContext.getBeanDefinitionNames();
    }

}
