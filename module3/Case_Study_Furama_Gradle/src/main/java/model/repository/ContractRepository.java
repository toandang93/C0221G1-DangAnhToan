package model.repository;

import model.bean.contract.Contract;
import sun.awt.geom.AreaOp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContractRepository {
    BaseRepository baseRepository = new BaseRepository();
    static final String INSERT_INTO_CONTRACT = "insert into contract(contract_start_date,contract_end_date" +
            ",contract_deposit,employee_id,customer_id,service_id)\n" +
            "values(?,?,?,?,?,?);";
    static final String DELETE_CONTRACT = "delete from contract where contract_id = ?;";
    static final String SELECT_CONTRACT_BY_ID = "select * from contract where contract_id = ?;";
    static final String UPDATE_CONTRACT_BY_ID = "update contract\n" +
            "set contract_start_date = ?,\n" +
            "contract_end_date = ?,\n" +
            "contract_deposit = ?,\n" +
            "employee_id = ?,\n" +
            "customer_id = ?,\n" +
            "service_id =?\n" +
            "where contract_id = ?;";
    public Contract selectContractById(int id){
        Connection connection = baseRepository.getConnection();
        Contract contract = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CONTRACT_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                 int contractId = resultSet.getInt("contract_id");
                 String startDate = resultSet.getString("contract_start_date");
                 String endDate = resultSet.getString("contract_end_date");
                 double deposit = resultSet.getDouble("contract_deposit");
                 int employeeId = resultSet.getInt("employee_id");
                 int customerId = resultSet.getInt("customer_id");
                 int serviceId = resultSet.getInt("service_id");
                 contract = new Contract(contractId,startDate,endDate,deposit,employeeId,customerId,serviceId);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contract;
    }
    public void deleteContract(int id){
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CONTRACT);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public boolean insertContract(Contract contract){
        boolean rowInsert = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTO_CONTRACT);
            preparedStatement.setString(1,contract.getStartDate());
            preparedStatement.setString(2,contract.getEndDate());
            preparedStatement.setDouble(3,contract.getDeposit());
            preparedStatement.setInt(4,contract.getEmployeeId());
            preparedStatement.setInt(5,contract.getCustomerId());
            preparedStatement.setInt(6,contract.getServiceId());
            rowInsert = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowInsert;
    }
    public boolean updateContractById(int id,Contract contract){
        boolean rowUpdate = false;
        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CONTRACT_BY_ID);
            preparedStatement.setString(1,contract.getStartDate());
            preparedStatement.setString(2,contract.getEndDate());
            preparedStatement.setDouble(3,contract.getDeposit());
            preparedStatement.setInt(4,contract.getEmployeeId());
            preparedStatement.setInt(5,contract.getCustomerId());
            preparedStatement.setInt(6,contract.getServiceId());
            preparedStatement.setInt(7,id);
            rowUpdate = preparedStatement.executeUpdate()>0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowUpdate;
    }

}
