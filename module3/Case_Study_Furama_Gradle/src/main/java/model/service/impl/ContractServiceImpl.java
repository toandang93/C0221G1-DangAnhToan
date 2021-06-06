package model.service.impl;

import model.bean.contract.Contract;
import model.repository.ContractRepository;
import model.service.IContractService;

public class ContractServiceImpl implements IContractService {
    ContractRepository contractRepository = new ContractRepository();
    @Override
    public boolean insertContract(Contract contract) {
        return contractRepository.insertContract(contract);
    }

    @Override
    public void deleteContract(int id) {
        contractRepository.deleteContract(id);
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.selectContractById(id);
    }

    @Override
    public boolean updateContract(int id, Contract contract) {
        return contractRepository.updateContractById(id,contract);
    }
}
