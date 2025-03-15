package com.example.my_Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.Services;
import com.example.my_Security.Repository.ServiceRepo;

import java.util.List;

@Service
public class ServiceS {

    @Autowired
    private ServiceRepo serviceRepo;

    public List<Services> getAllService() {
        return serviceRepo.findAll();
    }
  
    public Services saveservice(Services service) {
        return serviceRepo.save(service);
    }

}
