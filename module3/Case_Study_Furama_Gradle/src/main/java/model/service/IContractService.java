package model.service;

import model.bean.contract.Contract;

public interface IContractService {
    boolean insertContract(Contract contract);
    void deleteContract(int id);
    Contract findById(int id);
    boolean updateContract(int id,Contract contract);
}
