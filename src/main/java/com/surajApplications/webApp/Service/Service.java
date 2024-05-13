package com.surajApplications.webApp.Service;

import org.springframework.stereotype.Component;

@Component
public class Service {
    
    public String hello() {
        System.out.println("Service.hello() called");
        return "Hello World!";
    }

    public String name() {
        System.out.println("Service.name() called");
        return "Suraj Kumar";
    }
}
