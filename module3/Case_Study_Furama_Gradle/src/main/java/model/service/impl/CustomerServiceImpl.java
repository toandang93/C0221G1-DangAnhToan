package model.service.impl;

import model.bean.customer.Customer;
import model.repository.CustomerRepository;
import model.service.ICustomerService;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAllCustomer();
    }
    @Override
    public List<String[]> findTypeOfCustomer(){
        return customerRepository.findAllNameTypeCustomer();
    }
    public boolean insertInto(Customer customer){
        return customerRepository.insertIntoCustomer(customer);
    }
    public boolean delete(int id){
        return customerRepository.deleteCustomer(id);
    }
    public Customer findById(int id){
        return customerRepository.findById(id);
    }
    public boolean updateById(int id,Customer customer){
        return customerRepository.updateCustomerById(id,customer);
    }
    public List<Customer> searchByName(String name){
        return customerRepository.searchByName(name);
    }
}
