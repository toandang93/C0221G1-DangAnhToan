package com.controller;

import com.dto.ServiceDto;
import com.model.entity.service.RentType;
import com.model.entity.service.Service;
import com.model.entity.service.ServiceType;
import com.model.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = "services")
public class ServiceController {
    @Autowired
    private IService service;

    @ModelAttribute("rentTypes")
    public List<RentType> rentTypeList(){
        return service.listRentType();
    }
    @ModelAttribute("serviceTypes")
    public List<ServiceType> serviceTypeList(){
        return service.listServiceType();
    }
    @GetMapping(value = "")
    public ModelAndView goList(@RequestParam("keyWord") Optional<String> keyWord,
                               @RequestParam("page") Optional<Integer> page) {
        Pageable pageable= PageRequest.of(page.orElse(0),5);
        Page<Service> services = service.findAll(keyWord.orElse(""),pageable);
        ModelAndView modelAndView = new ModelAndView("service/list","services",services);
        modelAndView.addObject("keyWord", keyWord.orElse(""));
        return modelAndView;
    }

    @GetMapping(value = "create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("service/create","serviceDto",new ServiceDto());
        return modelAndView;
    }
}
