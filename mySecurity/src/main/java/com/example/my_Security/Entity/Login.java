package com.example.my_Security.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "login")  // Ensure this matches the actual table name in MySQL
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;

     // Default constructor (required by Hibernate)
     public Login() {}

     // Constructor with parameters (optional)
     public Login(String userName, String password) {
         this.userName= userName;
         this.password = password;
          
     }
 
     // Getters and Setters
     public Long getId() {
         return id;
     }
 
     public void setId(Long id) {
         this.id = id;
     }
 
     public String getuserName() {
         return userName;
     }
 
     public void setuserName(String userName) {
         this.userName = userName;
     }

     public String getpassword(){
        return password;
     }

     public void setpassword(String password){
        this.password=password;
     }
 

}