package model.repository;

import model.bean.customer.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private static final String FIND_BY_ID = "select * from customer where customer_id = ?;";
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM customer;";
    private static final String SELECT_ALL_TYPE_CUSTOMER = "SELECT * FROM customer_type;";
    private static final String INSERT_INTO_CUSTOMER = "insert into customer(customer_name,customer_type_id,customer_birthday,customer_gender," +
            "customer_id_card,customer_phone,customer_email,customer_address)\n" +
            "values(?,?,?,?,?,?,?,?);";
    private static final String DELETE_CUSTOMER_BY_ID = "delete from customer where customer_id = ?;";
    private static final String UPDATE_CUSTOMER_BY_ID = "update customer\n" +
            "set customer_name = ?,\n" +
            "customer_type_id = ?,\n" +
            "customer_birthday = ?,\n" +
            "customer_gender = ?,\n" +
            "customer_id_card = ?,\n" +
            "customer_phone = ?,\n" +
            "customer_email = ?,\n" +
            "customer_address = ?\n" +
            "where customer_id = ?;";
    private static final String SEARCH_BY_NAME = "select * from customer where customer_name like ?;";

    public CustomerRepository() {
    }

    public List<Customer> searchByName(String name){
        List<Customer> customerList = new ArrayList<>();
        List<String[]> stringList = findAllNameTypeCustomer();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name_type_customer = null;
                int id_customer = resultSet.getInt("customer_id");
                int id_type_customer = resultSet.getInt("customer_type_id");
                String customerName = resultSet.getString("customer_name");
                String date = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                for (int i = 0; i < stringList.size(); i++) {
                    if (i == (id_type_customer - 1)) {
                        name_type_customer = stringList.get(i)[1];
                    }
                }
                Customer customer = new Customer(id_customer, customerName, name_type_customer, date, gender, idCard, phone, email, address);
                customerList.add(customer);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public boolean updateCustomerById(int id,Customer customer){
        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER_BY_ID);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setInt(2,customer.getCustomerTypeId());
            preparedStatement.setString(3,customer.getBirthday());
            preparedStatement.setString(4,customer.getGender());
            preparedStatement.setString(5,customer.getIdCard());
            preparedStatement.setString(6,customer.getPhone());
            preparedStatement.setString(7,customer.getEmail());
            preparedStatement.setString(8,customer.getAddress());
            preparedStatement.setInt(9,id);
            rowUpdate = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    public boolean deleteCustomer(int id) {
        boolean rowDelete = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowDelete;
    }

    public List<String[]> findAllNameTypeCustomer() {
        List<String[]> stringList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_TYPE_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String id = rs.getString("customer_type_id");
                String name = rs.getString("customer_type_name");
                String[] strings = {id, name};
                stringList.add(strings);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public List<Customer> findAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String[]> stringList = findAllNameTypeCustomer();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name_type_customer = null;
                int id_customer = resultSet.getInt("customer_id");
                int id_type_customer = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String date = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                for (int i = 0; i < stringList.size(); i++) {
                    if (i == (id_type_customer - 1)) {
                        name_type_customer = stringList.get(i)[1];
                    }
                }
                Customer customer = new Customer(id_customer, name, name_type_customer, date, gender, idCard, phone, email, address);
                customerList.add(customer);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public boolean insertIntoCustomer(Customer customer) {
        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_CUSTOMER);
            preparedStatement.setString(1, customer.getName());
            preparedStatement.setInt(2, customer.getCustomerTypeId());
            preparedStatement.setString(3, customer.getBirthday());
            preparedStatement.setString(4, customer.getGender());
            preparedStatement.setString(5, customer.getIdCard());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            rowUpdate = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

    public Customer findById(int id){
        Customer customer = null;
        List<String[]> stringList = findAllNameTypeCustomer();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name_type_customer = null;
                int id_customer = resultSet.getInt("customer_id");
                int id_type_customer = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String date = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                for (int i = 0; i < stringList.size(); i++) {
                    if (i == (id_type_customer - 1)) {
                        name_type_customer = stringList.get(i)[1];
                    }
                }
                customer = new Customer(id_customer, name, name_type_customer, date, gender, idCard, phone, email, address);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }
}
