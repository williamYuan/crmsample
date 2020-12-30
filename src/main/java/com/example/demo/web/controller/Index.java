package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

    @RequestMapping({"/", "/index", "/aa"})
    public String index(){
        return "index";
    }

    @RequestMapping("/gride")
    public String demo_gride(){
        return "gride";
    }
}
