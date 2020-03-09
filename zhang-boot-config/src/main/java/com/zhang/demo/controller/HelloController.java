package com.zhang.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${zhang.msg}")
    private String msg;

    @RequestMapping("getMsg")
    public String getMsg(){
        return msg;
    }

    @RequestMapping("/hello")
    public String helloController(){
        return "Hello word";
    }
}
