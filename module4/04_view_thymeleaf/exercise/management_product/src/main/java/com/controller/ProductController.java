package com.controller;

import com.model.bean.Product;
import com.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    IProductService iProductService;

    @RequestMapping(value = "")
    public ModelAndView view(){
        List<Product> productList = iProductService.findAll();
        return new ModelAndView("/view","products",productList);
    }
    @GetMapping(value = "/create")
    public ModelAndView showFormCreate(){
        return new ModelAndView("/create","product",new Product());
    }
    @PostMapping(value = "/save")
    public String save(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        product.setId((int) (Math.random() * 10000));
        this.iProductService.save(product);
        redirectAttributes.addFlashAttribute("success","Create Success");
        return "redirect:/product/";
    }
    @GetMapping(value = "/edit")
    public String showFormEdit(@RequestParam int id, Model model){
        Product product = this.iProductService.findById(id);
        model.addAttribute("product",product);
        return "/edit";
    }
    @PostMapping(value = "/update")
    public String updateProduct(@ModelAttribute Product product){
        this.iProductService.update(product.getId(),product);
        return "redirect:/product/";
    }
    @GetMapping(value = "/delete")
    public String delete(@RequestParam int id,Model model){
        Product product = this.iProductService.findById(id);
        model.addAttribute("product",product);
        return "/delete";
    }
    @PostMapping(value = "/remove")
    public String remove(@ModelAttribute Product product){
        this.iProductService.remove(product.getId());
        return "redirect:/product/";
    }
    @GetMapping(value = "/view")
    public ModelAndView showInfo(@RequestParam int id){
        return new ModelAndView("/show","product",iProductService.findById(id));
    }
    @PostMapping(value = "/search")
    public ModelAndView search(@RequestParam String search){
        return new ModelAndView("/view","products",this.iProductService.search(search));

    }
}
