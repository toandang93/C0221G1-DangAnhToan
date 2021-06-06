package model.service;

import model.bean.contractDetail.AttachService;
import model.bean.contractDetail.ContractDetail;

import java.util.List;

public interface IContractDetailService {
    boolean insertIntoContractDetail(ContractDetail contractDetail);
    List<AttachService> fillAllAttachService();
    List<Integer> fillAllIdContract();
}
