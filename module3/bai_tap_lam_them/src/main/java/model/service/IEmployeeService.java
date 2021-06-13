package model.service;

import model.bean.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();
    List<String> insertEmployee(Employee employee);
    Employee findByCode(String code);
    List<String> updateEmployee(String code, Employee employee);
    boolean deleteEmployee(String code);
    List<Employee> searchByName(String name);
}
