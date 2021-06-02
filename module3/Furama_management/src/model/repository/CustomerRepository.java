package model.repository;

import model.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    private BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL_CUSTOMER = "SELECT * FROM khach_hang;";
    private static final String SELECT_ALL_NAME_TYPE_CUSTOMER = "SELECT ten_loai_khach_hang FROM loai_khach;";

    public CustomerRepository() {
    }

    public List<String> findAllNameTypeCustomer(){
        List<String> stringList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_NAME_TYPE_CUSTOMER);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name = rs.getString("ten_loai_khach_hang");
                stringList.add(name);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public List<Customer> findAllCustomer(){
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = findAllNameTypeCustomer();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                String name_type_customer = null;
                int id_customer = resultSet.getInt("id_khach_hang");
                int id_type_customer = resultSet.getInt("id_loai_khach");
                String name = resultSet.getString("ho_ten");
                String date = resultSet.getString("ngay_sinh");
                String gender = resultSet.getString("gioi_tinh");
                String idCard = resultSet.getString("so_CMTND");
                String phone = resultSet.getString("SDT");
                String email = resultSet.getString("email");
                String address = resultSet.getString("dia_chi");
                for (int i =0;i<stringList.size();i++){
                    if (i == (id_type_customer-1)){
                        name_type_customer = stringList.get(i);
                    }
                }
                Customer customer = new Customer(id_customer,name,name_type_customer,date,gender,idCard,phone,email,address);
                customerList.add(customer);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }
}
