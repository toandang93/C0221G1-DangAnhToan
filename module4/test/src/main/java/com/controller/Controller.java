package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RequestMapping(value = "")
public class Controller {

    @GetMapping(value = "/hello")
    public String test(){
        return "test";
    }
}
