package com.example.my_Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.Inside;
import com.example.my_Security.Repository.InsideRepo;

import java.util.List;

@Service
public class InsideService {

    @Autowired
    private InsideRepo insideRepo;

    public List<Inside> getAllInside() {
        return insideRepo.findAll();
    }
  
    public Inside saveInside(Inside insides) {
        return insideRepo.save(insides);
    }

}