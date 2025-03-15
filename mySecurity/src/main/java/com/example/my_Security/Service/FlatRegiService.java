package com.example.my_Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.FlatRegister;
import com.example.my_Security.Repository.FlatRegiRepo;

import java.util.List;

@Service
public class FlatRegiService {

    @Autowired
    private FlatRegiRepo FlatRegiRepo;

    public List<FlatRegister> getAllFlats() {
        return FlatRegiRepo.findAll();
    }
  
    public FlatRegister saveFlat(FlatRegister Flat) {
        return FlatRegiRepo.save(Flat);
    }

}