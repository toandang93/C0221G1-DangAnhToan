package model.service.impl;

import model.bean.customer.Customer;
import model.common.Validate;
import model.repository.CustomerRepository;
import model.service.ICustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAllCustomer();
    }
    public List<String> insertInto(Customer customer){
       List<String> errList = new ArrayList<>();
       errList.add(Validate.checkCustomerCode(customer.getCode()));
       errList.add(Validate.checkName(customer.getName()));
       errList.add(Validate.checkDay(customer.getBirthday()));
       errList.add(Validate.checkEmail(customer.getEmail()));
       errList.add(Validate.checkIdCard(customer.getIdCard()));
       errList.add(Validate.checkPhoneNumber(customer.getPhone()));
       errList.add(Validate.checkName(customer.getAddress()));
       int checkFull = 0;
       for (String string : errList){
           if (string.equals("")){
               checkFull++;
           }
       }
       if(checkFull == 7){
           customerRepository.insertIntoCustomer(customer);
       }
       return errList;
    }
    @Override
    public List<String[]> findTypeOfCustomer(){
        return customerRepository.findAllNameTypeCustomer();
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
