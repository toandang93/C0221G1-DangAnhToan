package model.service;

import model.bean.customer.Customer;

import java.util.List;

public interface ICRUD<T> {
    List<T> findAll();
    List<String[]> findTypeOfCustomer();
    public boolean insertInto(T t);
    public boolean delete(int id);
    public T findById(int id);
    public boolean updateById(int id,T t);
    public List<T> searchByName(String name);
}
