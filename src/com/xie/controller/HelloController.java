package com.xie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("请求进入hello....");
        return "rello";   //必须和xxx.jsp名字一样
    }

    @RequestMapping("/reg")
    public String reg() {
        System.out.println("请求进入hello....");
        return "reg";   //必须和xxx.jsp名字一样
    }
}
