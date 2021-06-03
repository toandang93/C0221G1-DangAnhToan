package model.bean.service;

public class Service {
    private int id;
    private String name;
    private int area;
    private double cost;
    private int peopleMax;
    private String rentType;
    private String serviceType;

    public Service() {
    }

    public Service(int id, String name, int area, double cost, int peopleMax, String rentType, String serviceType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.peopleMax = peopleMax;
        this.rentType = rentType;
        this.serviceType = serviceType;
    }

    public Service(String name, int area, double cost, int peopleMax, String rentType, String serviceType) {
        this.name = name;
        this.area = area;
        this.cost = cost;
        this.peopleMax = peopleMax;
        this.rentType = rentType;
        this.serviceType = serviceType;
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

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
