package model.service;

import model.bean.customer.Customer;

import java.util.List;

public interface ICRUD {
    List<Customer> findAll();
    List<String[]> findTypeOfCustomer();
    public boolean insertIntoCustomer(Customer customer);
    public boolean deleteCustomer(int id);
    public Customer findById(int id);
    public boolean updateCustomerById(int id,Customer customer);
    public List<Customer> searchByName(String name);
}
