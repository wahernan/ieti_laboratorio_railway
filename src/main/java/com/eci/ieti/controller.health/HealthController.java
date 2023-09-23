package com.eci.ieti.controller.health;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HealthController {

    @RequestMapping("/health")
    public String checkAPI(){
        return "<h1>Wilson Alirio Delgado Hernandez</h1>";
    }

}
