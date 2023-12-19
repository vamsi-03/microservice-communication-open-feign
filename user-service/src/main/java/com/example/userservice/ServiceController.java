package com.example.userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service2")
public class ServiceController {


    @Autowired
    ServiceInterface connect;

    @GetMapping("/say")
    public String welcomeGenerator()
    {
        return "Hello from Service 2";
    }
    @GetMapping("/department")
    public String Service1() {
        return connect.department();
    }
}
