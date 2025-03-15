package com.example.my_Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.Waitting;
import com.example.my_Security.Repository.WaittingRepo;

import java.util.List;

@Service
public class WaittingService {

    @Autowired
    private WaittingRepo wait;

    public List<Waitting> getAllwait() {
        return wait.findAll();
    }
  
    public Waitting savewait(Waitting waits) {
        return wait.save(waits);
    }

}