package VehicleManager.manager;

public abstract class Vehicle {
    protected String numberPlate;
    protected String manufacturerName;
    protected int yearOfManufacturer;
    protected String owner;

    public Vehicle() {
    }

    public Vehicle(String numberPlate, String manufacturerName, int yearOfManufacturer, String owner) {
        this.numberPlate = numberPlate;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacturer = yearOfManufacturer;
        this.owner = owner;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public java.lang.String toString() {
        return  numberPlate +
                "," + manufacturerName +
                "," + yearOfManufacturer +
                "," + owner ;
    }

    //: Biển kiểm soát , tên hãng sản xuất, năm sản xuất, chủ sở hữu.
}
