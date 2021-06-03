package model.repository;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL_SERVICE = "select * from service;";
    private static final String SELECT_ALL_SERVICE_TYPE = "select * from service_type;";
    private static final String SELECT_ALL_RENT_TYPE= "select * from rent_type;";

    public ServiceRepository() {
    }

    public List<ServiceType> findAllServiceType(){
        List<ServiceType> serviceTypeList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("service_type_id");
                String name = resultSet.getString("service_type_name");
                ServiceType serviceType = new ServiceType(id,name);
                serviceTypeList.add(serviceType);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceTypeList;
    }
    public List<RentType> fillAllRentType(){
        List<RentType> rentTypeList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_RENT_TYPE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("rent_type_id");
                String name = resultSet.getString("rent_type_name");
                double cost = resultSet.getDouble("rent_type_cost");
                RentType rentType = new RentType(id,name,cost);
                rentTypeList.add(rentType);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rentTypeList;
    }

    public List<Service> findAllService(){
        List<Service> serviceList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id =  resultSet.getInt("service_id");
                String name = resultSet.getString("service_name");
                int area = resultSet.getInt("service_area");
                double cost = resultSet.getDouble("service_cost");
                int peoplemax = resultSet.getInt("service_max_people");
                int rentTypeID = resultSet.getInt("rent_type_id");
                int serviceTypeId = resultSet.getInt("service_type_id");
                String standard = resultSet.getString("standard_room");
                String description = resultSet.getString("description_other_convenience");
                double poolArea = resultSet.getDouble("pool_area");
                int numberFloor = resultSet.getInt("number_of_floor");
                Service service = new Service(id,name,area,cost,peoplemax,rentTypeID,serviceTypeId,standard,description,numberFloor);
                serviceList.add(service);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }


}
