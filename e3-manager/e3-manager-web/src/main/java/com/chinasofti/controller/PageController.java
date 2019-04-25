package com.chinasofti.controller;/*
 * @author :张
 * Date  : 2019/4/24
 * @Description: PageController
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/page")
public class PageController {


    @RequestMapping("/")
    public String showIndex(){
        return "/index";
    }

    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
