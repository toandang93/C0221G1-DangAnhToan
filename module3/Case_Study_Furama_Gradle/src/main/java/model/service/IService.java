package model.service;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;

import java.util.List;

public interface IService {
    List<Service> findAll();
    List<ServiceType> findAllServiceType();
    List<RentType> fillAllRentType();
}
