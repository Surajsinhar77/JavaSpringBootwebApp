package com.surajApplications.webApp.Conroller;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.surajApplications.webApp.Service.Service;


@RestController
@RequestMapping("/api")
public class Controller {

    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String hello() {
        return service.hello();
    }

    @RequestMapping("/name")
    public String name() {
        return service.name();
    }
}
