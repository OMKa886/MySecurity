package com.example.my_Security.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.Delevary;
import com.example.my_Security.Repository.DelevaryRepo;

import java.util.List;

@Service public class DelevaryService {

    @Autowired
    private DelevaryRepo delevaryRepo;

    public List<Delevary> getAllDelevary() {
        return delevaryRepo.findAll();
    }
  
    public Delevary saveDelevary(Delevary delevary) {
        return delevaryRepo.save(delevary);
    }

}
