package model.repository;

import model.bean.customerUsingService.AttachService;
import model.bean.customerUsingService.CustomerUsingService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerUsingServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    static final String SELECT_ALL_CUSTOMER_USING_SERVICE = "select * from customer_using_service;";
    static final String SELECT_ALL_ATTACH_SERVICE = "select * from show_attach_service;";
    static final String SEARCH_BY_NAME = "select * from customer_using_service where customer_name like ?";

    public List<AttachService> findAllAttachService(){
        List<AttachService> attachServiceList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ATTACH_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int attachServiceId = resultSet.getInt("attach_service_id");
                String attachServiceName = resultSet.getString("attach_service_name");
                int contractId = resultSet.getInt("contract_id");
                int quantity = resultSet.getInt("quantity");
                AttachService attachService = new AttachService(attachServiceId,attachServiceName,contractId,quantity);
                attachServiceList.add(attachService);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServiceList;
    }
    public List<CustomerUsingService> searchByName(String name){
        List<CustomerUsingService> customerUsingServiceList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME);
            preparedStatement.setString(1,"%"+name+"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String customerPhone = resultSet.getString("customer_phone");
                int contractId = resultSet.getInt("contract_id");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                String serviceName = resultSet.getString("service_name");
                CustomerUsingService customerUsingService = new CustomerUsingService(customerId,customerName,
                        customerPhone,contractId,contractStartDate,contractEndDate,serviceName);
                customerUsingServiceList.add(customerUsingService);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerUsingServiceList;
    }
    public List<CustomerUsingService> findAll(){
        List<CustomerUsingService> customerUsingServiceList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_USING_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int customerId = resultSet.getInt("customer_id");
                String customerName = resultSet.getString("customer_name");
                String customerPhone = resultSet.getString("customer_phone");
                int contractId = resultSet.getInt("contract_id");
                String contractStartDate = resultSet.getString("contract_start_date");
                String contractEndDate = resultSet.getString("contract_end_date");
                String serviceName = resultSet.getString("service_name");
                CustomerUsingService customerUsingService = new CustomerUsingService(customerId,customerName,
                        customerPhone,contractId,contractStartDate,contractEndDate,serviceName);
                customerUsingServiceList.add(customerUsingService);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerUsingServiceList;
    }
}
