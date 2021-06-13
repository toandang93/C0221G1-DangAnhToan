package model.service.impl;

import model.bean.Employee;
import model.common.Validate;
import model.repository.EmployeeRepository;
import model.service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepository();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public List<String> insertEmployee(Employee employee) {
        List<String> errList = new ArrayList<>();
        errList.add(Validate.checkEmployeeCode(employee.getCode()));
        errList.add(Validate.checkName(employee.getName()));
        errList.add(Validate.checkDate(employee.getBirthday()));
        int checkFull = 0;
        for (String string : errList){
            if ("".equals(string)){
                checkFull++;
            }
        }
        if (checkFull == 3){
            employeeRepository.insertEmployer(employee);
        }
        return errList;
    }

    @Override
    public Employee findByCode(String code) {
        return employeeRepository.findByCode(code);
    }

    @Override
    public List<String> updateEmployee(String code, Employee employee) {
        List<String> errList = new ArrayList<>();
        errList.add(Validate.checkName(employee.getName()));
        errList.add(Validate.checkDate(employee.getBirthday()));
        int checkFull = 0;
        for (String string : errList){
            if ("".equals(string)){
                checkFull++;
            }
        }
        if (checkFull == 2){
            employeeRepository.updateEmployee(code,employee);
        }
        return errList;
    }

    @Override
    public boolean deleteEmployee(String code) {
        return employeeRepository.deleteEmployee(code);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employeeRepository.findByName(name);
    }
}
