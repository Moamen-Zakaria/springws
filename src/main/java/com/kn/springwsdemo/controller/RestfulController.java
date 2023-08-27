package com.kn.springwsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

    @GetMapping("hello")
    public String hello(){
        return "hello world";
    }

}
