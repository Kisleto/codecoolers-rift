package com.example.codecoolers_rift.controller;

import com.example.codecoolers_rift.model.Customer;
import com.example.codecoolers_rift.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("https://localhost:3000/#/registration")
    public void registration(@RequestParam String summonerName, @RequestParam String password, @RequestParam String email){
        userRepository.save(Customer.builder()
                .summonerName(summonerName)
                .email(email)
                .password(password)
                .build());
        
    }
}
