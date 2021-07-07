package com.model.entity.contractDetail;

import com.model.entity.contract.Contract;

import javax.persistence.*;
import java.util.List;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contractDetailId;
    @Column(nullable = false)
    private Integer quantity;

    @OneToMany(mappedBy = "contractDetail")
    private List<AttachService> attachServiceList;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    public ContractDetail() {
    }

    public Long getContractDetailId() {
        return contractDetailId;
    }

    public void setContractDetailId(Long contractDetailId) {
        this.contractDetailId = contractDetailId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<AttachService> getAttachServiceList() {
        return attachServiceList;
    }

    public void setAttachServiceList(List<AttachService> attachServiceList) {
        this.attachServiceList = attachServiceList;
    }
}
