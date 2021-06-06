package model.service.impl;

import model.bean.customerUsingService.AttachService;
import model.bean.customerUsingService.CustomerUsingService;
import model.repository.CustomerUsingServiceRepository;
import model.service.ICustomerUsingService;

import java.util.List;

public class CustomerUsingServiceImpl implements ICustomerUsingService {
    CustomerUsingServiceRepository customerUsingServiceRepository = new CustomerUsingServiceRepository();
    @Override
    public List<CustomerUsingService> findAll() {
        return customerUsingServiceRepository.findAll();
    }

    @Override
    public List<AttachService> findAllAttachService() {
        return customerUsingServiceRepository.findAllAttachService();
    }
}
