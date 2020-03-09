package com.zhang.demo.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

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

    @RequestMapping("/log")
    public  void log(){
        logger.trace("----------trace--------");
        logger.debug("----------debug--------");
        logger.info("----------info--------");
        logger.warn("----------warn--------");
        logger.error("----------error--------");
    }
}
