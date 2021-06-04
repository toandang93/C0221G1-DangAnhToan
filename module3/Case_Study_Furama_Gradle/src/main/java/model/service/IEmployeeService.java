package model.service;

import model.bean.employee.*;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAllEmployee();
    List<Division> findAllDivision();
    List<Position> findAllPosition();
    List<EducationDegree> findAllEducation();
    List<User> findAllUser();
    boolean addNewEmployee(Employee employee);
    Employee findById(int id);
    boolean editEmployee(int id,Employee employee);
    boolean deleteEmployee(int id);
    List<Employee> searchByName(String name);

}
