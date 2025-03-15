package com.example.my_Security.Controller;


 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.Services;
import com.example.my_Security.Service.ServiceS;

import java.util.List;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class ServicesController {

    @Autowired
    private ServiceS ServiceS;

    @GetMapping
    public List<Services> getAllService() {
        return ServiceS.getAllService();
    }

    @PostMapping
    public Services createService(@RequestBody Services services) {
        return ServiceS.saveservice(services);
    }

}
