package com.example.my_Security.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "FlatRegister")  // Ensure this matches the actual table name in MySQL
public class FlatRegister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String flatNum;
    private String name;
    private String number;
    private String wing;
    private String email;


    // Default constructor (required by Hibernate)
    public FlatRegister() {}

    // Constructor with parameters (optional)
    public FlatRegister(String flatNum, String name, String number, String wing,String email) {
        this.flatNum = flatNum;
        this.name = name;
        this.number = number;
        this.wing = wing;
        this.email=email;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFlatNum() {
        return flatNum;
    }

    public void setFlatNum(String flatNum) {
        this.flatNum = flatNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
   
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static FlatRegister save(FlatRegister flat) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

}