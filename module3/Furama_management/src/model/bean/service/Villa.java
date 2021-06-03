package model.bean.service;

public class Villa extends Service {
    private String standardRoom;
    private String description;
    private double areaPool;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String standardRoom, String description, double areaPool, int numberFloor) {
        this.standardRoom = standardRoom;
        this.description = description;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(int id, String name, int area, double cost, int peopleMax, String rentType, String serviceType, String standardRoom, String description, double areaPool, int numberFloor) {
        super(id, name, area, cost, peopleMax, rentType, serviceType);
        this.standardRoom = standardRoom;
        this.description = description;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public Villa(String name, int area, double cost, int peopleMax, String rentType, String serviceType, String standardRoom, String description, double areaPool, int numberFloor) {
        super(name, area, cost, peopleMax, rentType, serviceType);
        this.standardRoom = standardRoom;
        this.description = description;
        this.areaPool = areaPool;
        this.numberFloor = numberFloor;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
