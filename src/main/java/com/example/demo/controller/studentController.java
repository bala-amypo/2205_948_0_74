package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.

@RestController
public class studentController{
     
    @Autowired


    @GetMapping
    public List<studentEntity> getAll(){
       return service.getAll;
    }

}