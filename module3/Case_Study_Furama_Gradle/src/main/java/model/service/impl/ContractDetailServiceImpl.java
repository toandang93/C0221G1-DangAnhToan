package model.service.impl;

import model.bean.contractDetail.AttachService;
import model.bean.contractDetail.ContractDetail;
import model.repository.ContractDetailRepository;
import model.service.IContractDetailService;

import java.util.List;

public class ContractDetailServiceImpl implements IContractDetailService {
    ContractDetailRepository contractDetailRepository = new ContractDetailRepository();
    @Override
    public boolean insertIntoContractDetail(ContractDetail contractDetail) {
        return contractDetailRepository.insertIntoContractDetail(contractDetail);
    }

    @Override
    public List<AttachService> fillAllAttachService() {
        return contractDetailRepository.findAllAttachService();
    }

    @Override
    public List<Integer> fillAllIdContract() {
        return contractDetailRepository.fillAllIdContrat();
    }
}
