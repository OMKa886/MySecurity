package com.example.my_Security.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.History;
import com.example.my_Security.Service.HistoryService;

import java.util.List;

@RestController
@RequestMapping("/history")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping
    public List<History> getAllHistory() {
        return historyService.getAllHistory();
    }

    @PostMapping
    public History createHistory(@RequestBody History history) {
        return historyService.saveHistory(history);
    }

}

