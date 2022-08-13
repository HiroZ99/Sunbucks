package com.example.sun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.sun.model.Menus;
import com.example.sun.repository.MySqlRepository;

import java.util.List;

@RestController
public class menuController {
    
    @Autowired
    MySqlRepository mySqlRepository;
    
    @GetMapping("/GET")
    public List<Menus> getAllMenu(){

        return mySqlRepository.findAll();

    }
}
