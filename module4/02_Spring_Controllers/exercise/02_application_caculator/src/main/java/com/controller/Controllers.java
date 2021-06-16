package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.service.ICalculatorService;

@Controller
public class Controllers {
    @Autowired
    ICalculatorService calculatorService;

    @RequestMapping
    public String home() {
        return "index";
    }

    @RequestMapping("/calculator")
    public String calculator(@RequestParam double num1, double num2, String calculator, Model model) {
        String result = calculatorService.calculator(num1,num2,calculator);
        model.addAttribute("result",result);
        return "index";
    }

}

