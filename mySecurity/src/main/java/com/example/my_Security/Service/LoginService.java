package com.example.my_Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.my_Security.Entity.Login;
import com.example.my_Security.Repository.LoginRepository;

import java.util.List;

@Service
public class LoginService {

    @Autowired
    private    LoginRepository  loginRepository;

    public List<Login> getAllLogin() {
        return loginRepository.findAll();
    }
  
    public Login saveLogin(Login login) {
        return loginRepository.save(login);
    }

}
