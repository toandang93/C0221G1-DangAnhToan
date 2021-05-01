package VehicleManager.manager;

public class Truck extends Vehicle {
    private double payLoad;

    public Truck() {
    }

    public Truck(double payLoad) {
        this.payLoad = payLoad;
    }

    public Truck(String numberPlate, String manufacturerName, int yearOfManufacturer, String owner, double payLoad) {
        super(numberPlate, manufacturerName, yearOfManufacturer, owner);
        this.payLoad = payLoad;
    }

    public double getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(double payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public java.lang.String toString() {
        return super.toString()+
                "," + payLoad ;
    }


}
