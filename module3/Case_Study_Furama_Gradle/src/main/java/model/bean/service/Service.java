package model.bean.service;

public class Service {
    private int id;
    private String name;
    private int area;
    private double cost;
    private int peopleMax;
    private int rentTypeID;
    private int serviceTypeID;
    private String standardRoom;
    private String description;
    private String numberFloor;
    private String poolArea;

    public Service() {
    }

    public Service(int id, String name, int area, double cost, int peopleMax, int rentTypeID, int serviceTypeID, String standardRoom, String description, String numberFloor, String poolArea) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.peopleMax = peopleMax;
        this.rentTypeID = rentTypeID;
        this.serviceTypeID = serviceTypeID;
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberFloor = numberFloor;
        this.poolArea = poolArea;
    }

    public Service(String name, int area, double cost, int peopleMax, int rentTypeID, int serviceTypeID, String standardRoom, String description, String numberFloor, String poolArea) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.peopleMax = peopleMax;
        this.rentTypeID = rentTypeID;
        this.serviceTypeID = serviceTypeID;
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberFloor = numberFloor;
        this.poolArea = poolArea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getPeopleMax() {
        return peopleMax;
    }

    public void setPeopleMax(int peopleMax) {
        this.peopleMax = peopleMax;
    }

    public int getRentTypeID() {
        return rentTypeID;
    }

    public void setRentTypeID(int rentTypeID) {
        this.rentTypeID = rentTypeID;
    }

    public int getServiceTypeID() {
        return serviceTypeID;
    }

    public void setServiceTypeID(int serviceTypeID) {
        this.serviceTypeID = serviceTypeID;
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

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }
}
