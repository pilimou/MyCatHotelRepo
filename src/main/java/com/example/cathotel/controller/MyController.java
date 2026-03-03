package com.example.cathotel.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test() {
        System.out.println("Hi!");
        return "Hello World";
    }

    @RequestMapping("/hello")
    public String index() {
        System.out.println("HiHi!");
        return "Hello World";
    }
}
