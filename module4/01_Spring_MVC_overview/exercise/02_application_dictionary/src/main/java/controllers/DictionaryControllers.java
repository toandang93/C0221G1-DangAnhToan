package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryControllers {
    @GetMapping
    public String home(){
        return "home";
    }
    @PostMapping("abc")
    public String translate(@RequestParam String input, Model model){
        String[] viet = {"xin chào","tạm biệt","hát","bay","nhảy"};
        String[] anh = {"hello","goodbye","sing","ply","jump"};
        boolean check = false;
        for (int i =0;i<anh.length;i++){
            if (anh[i].equals(input)){
                model.addAttribute("result",viet[i]);
                check = true;
            }
        }
        if (!check){
            model.addAttribute("result","Not found ");
        }
        return "home";
    }
}
