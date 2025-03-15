package com.example.my_Security.Controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.Inside;
import com.example.my_Security.Service.InsideService;

import java.util.List;

@RestController
@RequestMapping("/inside")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class InsideController {

    @Autowired
    private InsideService insideService;

    @GetMapping
    public List<Inside> getAllInside() {
        return insideService.getAllInside();
    }

    @PostMapping
    public Inside createInside(@RequestBody Inside insides) {
        return insideService.saveInside(insides);
    }

}
