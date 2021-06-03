package model.service.impl;

import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.repository.ServiceRepository;
import model.service.IService;

import java.util.List;

public class ServiceImpl implements IService {
    ServiceRepository serviceRepository = new ServiceRepository();
    @Override
    public List<Service> findAll() {
        return serviceRepository.findAllService();
    }

    @Override
    public List<ServiceType> findAllServiceType() {
        return serviceRepository.findAllServiceType();
    }

    @Override
    public List<RentType> fillAllRentType() {
        return serviceRepository.fillAllRentType();
    }
}
