package com.example.my_Security.Controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.Guest;
import com.example.my_Security.Service.GuestService;

import java.util.List;

@RestController
@RequestMapping("/guests")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class GuestController {

    @Autowired
    private GuestService guestService;

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }

    @PostMapping
    public Guest createGuest(@RequestBody Guest guest) {
        return guestService.saveGuest(guest);
    }

}
