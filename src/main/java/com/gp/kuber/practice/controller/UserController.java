package com.gp.kuber.practice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class UserController {

    @GetMapping("/user")
    public String getMethodName() {
        System.out.println("User endpoint call");
        return new String("William");
    }
    

}
