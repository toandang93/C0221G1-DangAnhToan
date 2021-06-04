package model.service.impl;

import model.bean.employee.*;
import model.repository.EmployyRepository;
import model.service.IEmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    EmployyRepository employyRepository = new EmployyRepository();
    @Override
    public List<Employee> findAllEmployee() {
        return employyRepository.findAllEmployee();
    }
    @Override
    public List<Division> findAllDivision() {
        return employyRepository.findAllDivision();
    }
    @Override
    public List<Position> findAllPosition() {
        return employyRepository.findAllPosition();
    }
    @Override
    public List<EducationDegree> findAllEducation() {
        return employyRepository.findAllEducation();
    }
    @Override
    public List<User> findAllUser() {
        return employyRepository.findAllUser();
    }
    @Override
    public boolean addNewEmployee(Employee employee) {
        return employyRepository.insertIntoEmployee(employee);
    }
    @Override
    public Employee findById(int id) {
        return employyRepository.findEmployeeById(id);
    }
    @Override
    public boolean editEmployee(int id, Employee employee) {
        return employyRepository.updateEmployeeById(id,employee);
    }
    @Override
    public boolean deleteEmployee(int id) {
        return employyRepository.deleteEmployee(id);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return employyRepository.searchByName(name);
    }
}
