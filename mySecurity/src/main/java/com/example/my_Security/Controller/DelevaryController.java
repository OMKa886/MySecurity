package com.example.my_Security.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.Delevary;
import com.example.my_Security.Service.DelevaryService;

import java.util.List;

@RestController
@RequestMapping("/delevary")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class DelevaryController {

    @Autowired
    private DelevaryService delevaryService;

    @GetMapping
    public List<Delevary> getAllDelevary() {
        return delevaryService.getAllDelevary();
    }

    @PostMapping
    public Delevary createDelevary(@RequestBody Delevary delevary) {
        return delevaryService.saveDelevary(delevary);
    }

}
