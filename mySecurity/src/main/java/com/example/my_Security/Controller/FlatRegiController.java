package com.example.my_Security.Controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.FlatRegister;
import com.example.my_Security.Service.FlatRegiService;

import java.util.List;

@RestController
@RequestMapping("/FlatRegi")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class FlatRegiController {

    @Autowired
    private FlatRegiService FlatRegiService;

    @GetMapping
    public List<FlatRegister> getAllFlats() {
        return FlatRegiService.getAllFlats();
    }

    @PostMapping
    public FlatRegister createGuest(@RequestBody FlatRegister FlatRegi) {
        return FlatRegiService.saveFlat(FlatRegi);
    }

}

