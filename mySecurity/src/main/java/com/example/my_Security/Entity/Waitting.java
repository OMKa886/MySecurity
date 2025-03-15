package com.example.my_Security.Entity;
import jakarta.persistence.*;



@Entity
@Table(name = "waitting")  // Ensure this matches the actual table name in MySQL
public class Waitting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flatNum;
    private String name;
    private String wing;
    private String Company;
    // Default constructor (required by Hibernate)
    public Waitting() {}

    // Constructor with parameters (optional)
    public Waitting(String flatNum, String name, String wing,String Company) {
        this.flatNum = flatNum;
        this.name = name;
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
