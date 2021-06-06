package model.repository;

import model.bean.contract.Contract;
import model.bean.contractDetail.AttachService;
import model.bean.contractDetail.ContractDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository {
    BaseRepository baseRepository = new BaseRepository();
    final static String INSERT_INTO_CONTRACTDETAIL = "insert into contract_detail(contract_id,attach_service_id,quantity)\n" +
            "values(?,?,?);";
    final static String SELECT_ATTACH_SERVICE = "select * from attach_service;";
    final static String SELECT_ALL_ID_CONTRACT = "select contract_id from contract;";

    public List<AttachService> findAllAttachService(){
        List<AttachService> attachServiceList = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ATTACH_SERVICE);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
               int id = resultSet.getInt("attach_service_id");
               String name = resultSet.getString("attach_service_name");
               double cost = resultSet.getDouble("attach_service_cost");
               int unit = resultSet.getInt("attach_service_unit");
               String status = resultSet.getString("attach_service_status");
               AttachService attachService = new AttachService(id,name,cost,unit,status);
               attachServiceList.add(attachService);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return attachServiceList;
    }
    public boolean insertIntoContractDetail(ContractDetail contractDetail){
        boolean rowInsert = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_CONTRACTDETAIL);
            preparedStatement.setInt(1,contractDetail.getIdContract());
            preparedStatement.setInt(2,contractDetail.getIdAttachService());
            preparedStatement.setInt(3,contractDetail.getQuantity());
            rowInsert = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  rowInsert;
    }
    public List<Integer> fillAllIdContrat(){
        List<Integer> list = new ArrayList<>();
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_ID_CONTRACT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("contract_id");
                list.add(id);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
