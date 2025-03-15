package com.example.my_Security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.my_Security.Entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}