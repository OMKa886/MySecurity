package com.example.my_Security.Controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.my_Security.Entity.Login;
import com.example.my_Security.Service.LoginService;

import java.util.List;

@RestController
@RequestMapping("/logins")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests

public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public List<Login> getAllLogins() {
        return loginService.getAllLogin();
    }

    @PostMapping
    public Login createLogin(@RequestBody Login login) {
        return loginService.saveLogin(login);
    }

}
