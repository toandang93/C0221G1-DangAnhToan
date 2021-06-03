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
    private static final String INSER_INTO_SERVICE = "insert into service" +
            "(service_name,service_area,service_cost,service_max_people," +
            "rent_type_id,service_type_id,standard_room,description_other_convenience,pool_area,number_of_floor)\n" +
            "values(?,?,?,?,?,?,?,?,?,?);";

    public ServiceRepository() {
    }
    public boolean inserIntoService(Service service){
        boolean rowInsert = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSER_INTO_SERVICE);
            preparedStatement.setString(1,service.getName());
            preparedStatement.setInt(2,service.getArea());
            preparedStatement.setDouble(3,service.getCost());
            preparedStatement.setInt(4,service.getPeopleMax());
            preparedStatement.setInt(5,service.getRentTypeID());
            preparedStatement.setInt(6,service.getServiceTypeID());
            preparedStatement.setString(7,service.getStandardRoom());
            preparedStatement.setString(8,service.getDescription());
            preparedStatement.setString(9,service.getPoolArea());
            preparedStatement.setString(10,service.getNumberFloor());
            rowInsert = preparedStatement.executeUpdate() > 0 ;
            preparedStatement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
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
                String poolArea = resultSet.getString("pool_area");
                String numberFloor = resultSet.getString("number_of_floor");
                Service service = new Service(id,name,area,cost,peoplemax,rentTypeID,serviceTypeId,standard,description,numberFloor,poolArea);
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
