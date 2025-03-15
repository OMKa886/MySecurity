package com.example.my_Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.my_Security.Entity.Guest;
import com.example.my_Security.Repository.GuestRepository;

import java.util.List;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }
  
    public Guest saveGuest(Guest guest) {
        return guestRepository.save(guest);
    }

}
