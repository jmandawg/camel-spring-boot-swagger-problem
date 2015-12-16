package com.example;

import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.stereotype.Component;

@Component
public class AnotherRouter extends FatJarRouter {
    

    @Override
    public void configure() {

    }
}
