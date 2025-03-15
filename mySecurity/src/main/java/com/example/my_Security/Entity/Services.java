package com.example.my_Security.Entity;
import jakarta.persistence.*;
 


@Entity
@Table(name = "services")  // Ensure this matches the actual table name in MySQL
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flatNum;
    private String name;
    private String number;
    private String wing;
    private String Company;
    // Default constructor (required by Hibernate)
    public Services() {}

    // Constructor with parameters (optional)
    public Services(String flatNum, String name, String number, String wing,String Company) {
        this.flatNum = flatNum;
        this.name = name;
        this.number = number;
        this.wing = wing;
        this.Company=Company;
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

    public String getcompany() {
        return Company;
    }

    public void setcompany(String company) {
        this.Company = company;
    }
}
