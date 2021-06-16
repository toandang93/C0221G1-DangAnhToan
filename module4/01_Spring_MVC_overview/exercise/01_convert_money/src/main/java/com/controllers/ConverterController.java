package com.controllers;

import com.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @Autowired
    IConvertService convertService;
    @GetMapping
    public String comeHome(){
        return "home";
    }
    @PostMapping("abc")
    public String convert(@RequestParam double money, double typeMoney,double typeMoney1, Model model){
        double result = convertService.change(money,typeMoney,typeMoney1) ;
        model.addAttribute("result",result);
        return "home";
    }
}
