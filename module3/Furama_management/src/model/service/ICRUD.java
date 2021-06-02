package model.service;

import model.bean.Customer;

import java.util.List;

public interface ICRUD {
    public List<Customer> findAll();
}
