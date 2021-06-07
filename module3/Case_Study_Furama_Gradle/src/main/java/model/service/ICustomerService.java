package model.service;

import model.bean.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    List<String[]> findTypeOfCustomer();
     List<String> insertInto(Customer customer);
     boolean delete(int id);
     Customer findById(int id);
     boolean updateById(int id, Customer customer);
     List<Customer> searchByName(String name);
}
