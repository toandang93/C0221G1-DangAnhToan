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
    private int numberFloor;

    public Service() {
    }

    public Service(int id, String name, int area, double cost, int peopleMax, int rentTypeID, int serviceTypeID, String standardRoom, String description, int numberFloor) {
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
    }

    public Service(String name, int area, double cost, int peopleMax, int rentTypeID, int serviceTypeID, String standardRoom, String description, int numberFloor) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.peopleMax = peopleMax;
        this.rentTypeID = rentTypeID;
        this.serviceTypeID = serviceTypeID;
        this.standardRoom = standardRoom;
        this.description = description;
        this.numberFloor = numberFloor;
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

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }
}
