package model.repository;

import model.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    BaseRepository baseRepository = new BaseRepository();
    public EmployeeRepository() {
    }

    private final String SELECT_ALL_EMPLOYEE = "SELECT * FROM nhan_vien;";
    private final String INSERT_INTP_EMPLOYEE = "insert into nhan_vien values(?,?,?);";
    private final String UPDATE_EMPLOYEE = "update nhan_vien " +
            "set ten_nhan_vien = ?,ngay_sinh = ?" +
            "where ma_nhan_vien = ?;";
    private final String FIND_BY_CODE = "select * from nhan_vien where ma_nhan_vien = ?;";
    private final String DELETE_EMPLOYEE = "delete from nhan_vien where ma_nhan_vien = ?;";
    private final String SEARCH_BY_NAME = "select * from nhan_vien where ten_nhan_vien like ?;";

    public List<Employee> findAll(){
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String code = resultSet.getString("ma_nhan_vien");
                String name = resultSet.getString("ten_nhan_vien");
                String birthday = resultSet.getString("ngay_sinh");
                Employee employee = new Employee(code,name,birthday);
                employeeList.add(employee);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public boolean insertEmployer(Employee employee){
        boolean rowInsert = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTP_EMPLOYEE);
            preparedStatement.setString(1,employee.getCode());
            preparedStatement.setString(2,employee.getName());
            preparedStatement.setString(3,employee.getBirthday());
            rowInsert = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }
    public Employee findByCode(String code){
        Employee employee = null;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_CODE);
            preparedStatement.setString(1,code);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String employeeCode = resultSet.getString("ma_nhan_vien");
                String name = resultSet.getString("ten_nhan_vien");
                String date = resultSet.getString("ngay_sinh");
                employee = new Employee(employeeCode,name,date);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    public boolean updateEmployee(String code,Employee employee){
        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,code);
            rowUpdate = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;

    }
    public boolean deleteEmployee(String code){
        boolean rowDelete = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_EMPLOYEE);
            preparedStatement.setString(1,code);
            rowDelete = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  rowDelete;
    }
    public List<Employee> findByName(String inputname){
       List<Employee> employeeList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1,"%"+inputname+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String employeeCode = resultSet.getString("ma_nhan_vien");
                String name = resultSet.getString("ten_nhan_vien");
                String date = resultSet.getString("ngay_sinh");
               Employee employee = new Employee(employeeCode,name,date);
               employeeList.add(employee);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employeeList;
    }

}
