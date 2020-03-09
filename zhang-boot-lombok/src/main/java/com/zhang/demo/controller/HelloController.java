package com.zhang.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Slf4j注解添加后不需要写证明log的那一行代码，默认会有一个log
 */
@RestController
@Slf4j
public class HelloController {
//    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

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
        log.trace("----------trace--------");
        log.debug("----------debug--------");
        log.info("----------info--------");
        log.warn("----------warn--------");
        log.error("----------error--------");
    }

    @RequestMapping("/user")
    public UserVO user(){
        UserVO userVO = new UserVO();
        userVO.setId(100);
        userVO.setUsername("zhang");
        return userVO;
    }
}
