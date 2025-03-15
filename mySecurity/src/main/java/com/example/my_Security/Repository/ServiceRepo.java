package com.example.my_Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.my_Security.Entity.Services;

public interface ServiceRepo extends JpaRepository<Services, Long> {
    
}
