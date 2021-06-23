package com.example.blog.controller;

import com.example.blog.model.entity.Blog;
import com.example.blog.model.entity.Category;
import com.example.blog.model.service.IBlogService;
import com.example.blog.model.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;

    @Autowired
    ICategoryService categoryService;

//    @ModelAttribute("category")
//    public Iterable<Category> category(){
//        return categoryService.findAll();
//    }

    @RequestMapping(value = "")
    public String goHome(Model model){
       model.addAttribute("blog",iBlogService.findAll());
//       model.addAttribute("category",categoryService.findAll());
       return "/blog/home";
    }

    @GetMapping(value = "/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("category",categoryService.findAll());
        return "/blog/create";
    }
    @PostMapping(value = "/create")
    public String createBlog(@ModelAttribute Blog blog){
        this.iBlogService.save(blog);
        blog.setDate(new Date(System.currentTimeMillis()));
        return "redirect:/blog";
    }
    @GetMapping(value = "/edit")
    public String showEditForm(@RequestParam Integer id,Model model){
        model.addAttribute("blog",this.iBlogService.findById(id));
        return "/blog/edit";
    }
    @PostMapping(value = "/edit")
    public String editBlog(@ModelAttribute Blog blog,Model model){
        this.iBlogService.save(blog);
        model.addAttribute("blog",blog);
        model.addAttribute("msg","Edit successfully");
        return "/blog/edit";
    }

    @GetMapping(value = "/show")
    public String showBlog(@RequestParam Integer id,Model model){
        model.addAttribute("blog",this.iBlogService.findById(id));
        return "/blog/show";
    }
    @GetMapping(value = "/delete")
    public String showDelete(@RequestParam Integer id,Model model){
        model.addAttribute("blog",this.iBlogService.findById(id));
        return "/blog/delete";
    }
    @PostMapping(value = "/delete")
    public String deleteBlog(@RequestParam Integer id, RedirectAttributes redirectAttributes){
        this.iBlogService.remove(id);
        redirectAttributes.addFlashAttribute("msg","Delete Success");
        return "redirect:/blog";
    }



}
