package com.model.service.impl;

import com.model.entity.contract.Contract;
import com.model.repository.contract.IContractRepository;
import com.model.service.IContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements IContractService {
    @Autowired
    IContractRepository contractRepository;
    @Override
    public Page<Contract> findAll(String keyWord, Pageable pageable) {
        return this.contractRepository.findAllByKeyWord(keyWord, pageable);
    }

    @Override
    public Contract findById(Long id) {
        return this.contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        this.contractRepository.save(contract);
    }

    @Override
    public void remove(Long id) {
        Contract contract = this.findById(id);
        contract.setFlag(false);
        this.contractRepository.save(contract);
    }

    @Override
    public Iterable<Contract> fillAll() {
        return this.contractRepository.findAll();
    }
}
