package com.example.my_Security.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.History;
import com.example.my_Security.Repository.HistoryRepo;

import java.util.List;

@Service public class HistoryService {

    @Autowired
    private HistoryRepo historyRepo;

    public List<History> getAllHistory() {
        return historyRepo.findAll();
    }
  
    public History saveHistory(History historys) {
        return historyRepo.save(historys);
    }
}
