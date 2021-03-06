package model.bean.contractDetail;

public class ContractDetail {
    private int id;
    private int idContract;
    private String idAttachService;
    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int idContract, String idAttachService, int quantity) {
        this.idContract = idContract;
        this.idAttachService = idAttachService;
        this.quantity = quantity;
    }

    public ContractDetail(int id, int idContract, String idAttachService, int quantity) {
        this.id = id;
        this.idContract = idContract;
        this.idAttachService = idAttachService;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdContract() {
        return idContract;
    }

    public void setIdContract(int idContract) {
        this.idContract = idContract;
    }

    public String getIdAttachService() {
        return idAttachService;
    }

    public void setIdAttachService(String idAttachService) {
        this.idAttachService = idAttachService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
