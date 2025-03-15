package com.example.my_Security.Controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.Waitting;
import com.example.my_Security.Service.WaittingService;

import java.util.List;

@RestController
@RequestMapping("/waitting")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class WaittingController {

    @Autowired
    private WaittingService waitService;

    @GetMapping
    public List<Waitting> getAllWait() {
        return waitService.getAllwait();
    }

    @PostMapping
    public Waitting createWait(@RequestBody Waitting waits) {
        return waitService.savewait(waits);
    }

}
