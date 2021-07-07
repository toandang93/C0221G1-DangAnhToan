package com.dto;

import com.model.entity.service.RentType;
import com.model.entity.service.ServiceType;
import lombok.Data;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;


public class ServiceDto implements Validator {
    private Long id;
    @NotBlank
    private String serviceName;
    @NotBlank
    private String serviceArea;
    @NotBlank
    private String serviceCost;
    @NotBlank
    private String serviceMaxPeople;
    private String standardRoom;
    private String descriptionOtherConvenience;
    private String poolArea;
    private String numberOfFloors;
    private RentType rentType;
    private ServiceType serviceType;
    private boolean flag=true;

    public ServiceDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(String serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        ServiceDto serviceDto = (ServiceDto) target;
        if (!serviceDto.getServiceCost().matches("^[0-9]+$")) {
            errors.rejectValue("serviceCost", "service.validCost", "Service cost format number");
        } else if (Integer.parseInt(serviceDto.getServiceCost()) < 0) {
            errors.rejectValue("serviceCost", "service.validCost", "Service cost great 0");
        }
        if(serviceDto.getNumberOfFloors() != null){
            if (!serviceDto.getNumberOfFloors().matches("^[0-9]+$")) {
                errors.rejectValue("numberOfFloors", "service.validFloor", "Service number of floors format number");
            } else if (Integer.parseInt(serviceDto.getNumberOfFloors()) <= 0) {
                errors.rejectValue("numberOfFloors", "service.validFloor", "Number of floors great 0");
            }
        }
    }
}
