package model.service;

import model.bean.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();
    List<String[]> findTypeOfCustomer();
    public boolean insertInto(Customer customer);
    public boolean delete(int id);
    public Customer findById(int id);
    public boolean updateById(int id, Customer customer);
    public List<Customer> searchByName(String name);
}
