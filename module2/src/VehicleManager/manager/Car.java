package VehicleManager.manager;

public class Car extends Vehicle {
    private int seat;
    private String type;

    public Car() {
    }

    public Car(int seat, String type) {
        this.seat = seat;
        this.type = type;
    }
    //43B-453.88,Huyndai,2020,Xe  khách,Nguyễn Văn B,45

    public Car(String numberPlate, String manufacturerName, int yearOfManufacturer, String type, String owner, int seat) {
        super(numberPlate, manufacturerName, yearOfManufacturer, owner);
        this.seat = seat;
        this.type = type;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public java.lang.String toString() {
        return numberPlate +
                "," + manufacturerName +
                "," + yearOfManufacturer +
                "," + type +
                "," + owner +
                "," + seat;
    }


}
