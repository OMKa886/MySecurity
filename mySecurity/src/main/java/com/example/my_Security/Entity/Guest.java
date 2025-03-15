package com.example.my_Security.Entity;
import jakarta.persistence.*;
 


@Entity
@Table(name = "guest")  // Ensure this matches the actual table name in MySQL
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flatNum;
    private String name;
    private String number;
    private String wing;

    // Default constructor (required by Hibernate)
    public Guest() {}

    // Constructor with parameters (optional)
    public Guest(String flatNum, String name, String number, String wing) {
        this.flatNum = flatNum;
        this.name = name;
        this.number = number;
        this.wing = wing;
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
}
