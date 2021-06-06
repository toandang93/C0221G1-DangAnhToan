package model.service;

import model.bean.customerUsingService.AttachService;
import model.bean.customerUsingService.CustomerUsingService;

import java.util.List;

public interface ICustomerUsingService {
    List<CustomerUsingService> findAll();
    List<AttachService> findAllAttachService();
    List<CustomerUsingService> searchByName(String name);
}
