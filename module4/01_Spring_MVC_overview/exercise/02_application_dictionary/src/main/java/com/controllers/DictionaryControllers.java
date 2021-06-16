package com.controllers;

import com.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryControllers {
    @Autowired
    IDictionaryService dictionaryService;
    @GetMapping
    public String home(){
        return "home";
    }
    @PostMapping("abc")
    public String translate(@RequestParam String input, Model model){
       String result = dictionaryService.change(input);
       model.addAttribute("result",result);
        return "home";
    }
}
