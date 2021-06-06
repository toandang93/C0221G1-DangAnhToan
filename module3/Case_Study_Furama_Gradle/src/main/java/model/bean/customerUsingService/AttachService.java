package model.bean.customerUsingService;

public class AttachService {
    private  int attachServiceId;
    private String attachServiceName;
    private int contractId;
    private int quantity;

    public AttachService() {
    }

    public AttachService(int attachServiceId, String attachServiceName, int contractId, int quantity) {
        this.attachServiceId = attachServiceId;
        this.attachServiceName = attachServiceName;
        this.contractId = contractId;
        this.quantity = quantity;
    }

    public int getAttachServiceId() {
        return attachServiceId;
    }

    public void setAttachServiceId(int attachServiceId) {
        this.attachServiceId = attachServiceId;
    }

    public String getAttachServiceName() {
        return attachServiceName;
    }

    public void setAttachServiceName(String attachServiceName) {
        this.attachServiceName = attachServiceName;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
