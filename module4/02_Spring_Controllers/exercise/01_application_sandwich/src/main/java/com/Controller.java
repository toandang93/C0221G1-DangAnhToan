package com;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping
    public String home() {
        return "index";
    }

    @RequestMapping("/save")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        String result = "";
        if (condiment == null){
            result = "You don't choose sandwich ";
        }
        for (String temp : condiment) {
            if (temp != null) {
                result += temp + " ";
            }
        }
        if ("".equals(result)) {
            result = "You don't choose sandwich";
        }
        model.addAttribute("result", result);
        return "result";
    }
}
