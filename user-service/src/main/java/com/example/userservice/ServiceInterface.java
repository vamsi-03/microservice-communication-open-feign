package com.example.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "department-service", url = "localhost:8080/department")
public interface ServiceInterface {
    @GetMapping("hello")
    public String department();
}
