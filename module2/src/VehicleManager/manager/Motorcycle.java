package VehicleManager.manager;

public class Motorcycle extends Vehicle {
    private int wattage;

    public Motorcycle() {
    }

    public Motorcycle(int wattage) {
        this.wattage = wattage;
    }

    public Motorcycle(String numberPlate, String manufacturerName, int yearOfManufacturer, String owner, int wattage) {
        super(numberPlate, manufacturerName, yearOfManufacturer, owner);
        this.wattage = wattage;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    @Override
    public java.lang.String toString() {
        return super.toString() +
                "," + wattage ;
    }


}
