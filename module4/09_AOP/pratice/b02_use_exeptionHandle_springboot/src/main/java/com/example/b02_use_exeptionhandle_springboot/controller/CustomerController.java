package com.example.b02_use_exeptionhandle_springboot.controller;

import com.example.b02_use_exeptionhandle_springboot.model.Customer;
import com.example.b02_use_exeptionhandle_springboot.model.Province;
import com.example.b02_use_exeptionhandle_springboot.service.CustomerService;
import com.example.b02_use_exeptionhandle_springboot.service.impl.DuplicateEmailException;
import com.example.b02_use_exeptionhandle_springboot.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("customers")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> allProvinces() {
        return provinceService.findAll();
    }

    @GetMapping
    public ModelAndView showList(Optional<String> s, Pageable pageInfo) {
        ModelAndView modelAndView = new ModelAndView("/customers/list");
        Page<Customer> customers = s.isPresent() ? search(s, pageInfo) : getPage(pageInfo);
        modelAndView.addObject("keyword", s.orElse(null));
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showInformation(@PathVariable Long id) {
        ModelAndView modelAndView = new ModelAndView("/customers/info");
        Optional<Customer> customerOptional = customerService.findOne(id);
        modelAndView.addObject("customer", customerOptional.get());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView updateCustomer(Customer customer) throws DuplicateEmailException {
        customerService.save(customer);
        return new ModelAndView("redirect:/customers");
    }
    @ExceptionHandler(DuplicateEmailException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("/customers/inputs-not-acceptable");
    }
    private Page<Customer> getPage(Pageable pageInfo) {
        return customerService.findAll(pageInfo);
    }

    private Page<Customer> search(Optional<String> s, Pageable pageInfo) {
        return customerService.search(s.get(), pageInfo);
    }
}
