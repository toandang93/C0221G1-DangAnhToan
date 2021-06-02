package model.service.impl;

import model.bean.Customer;
import model.repository.CustomerRepository;
import model.service.ICRUD;

import java.util.List;

public class CustomerServiceImpl implements ICRUD {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAllCustomer();
    }
}
