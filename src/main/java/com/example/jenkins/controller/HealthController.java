package com.example.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@Component
public class HealthController {






    @GetMapping(value = "/health/check")
    public String healthCheck() {
//        Report report = new Report();
//        report.setN2(0D);
        return "SUCCESS2";
//        return 1000L;
    }



}
