package com.example.blog.controller;

import com.example.blog.model.entity.Category;
import com.example.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/category")
public class CategoryController {
    @Autowired
    ICategoryService categoryService;

    @GetMapping
    public String showList(Model model){
        model.addAttribute("category",categoryService.findAll());
        return "/category/home";
    }

    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        model.addAttribute("category",new Category());
        return "/category/create";
    }
    @PostMapping(value = "/create")
    public String createCategory(@ModelAttribute Category category,Model model){
        this.categoryService.save(category);
        model.addAttribute("msg","Create Successfully");
        return "/category/create";
    }
}
