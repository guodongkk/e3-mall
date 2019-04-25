package com.chinasofti.controller;/*
 * @author :张
 * Date  : 2019/4/24
 * @Description: HelloController
 */


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){

        return "haha,我来了！";
    }
}
