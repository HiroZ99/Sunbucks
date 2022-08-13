package com.example.sun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/")
    public String getHome(){
        return "Home";
    }
    
    @GetMapping("/test")
    public String getTest(){
        return "test";
    }

    @GetMapping("/person")
    public Person getPerson(){
        Person p = new Person();
        p.setName("Mek");
        p.setAge(26);
        return p;
    }
    
}
class Person{
    private String name;
    private Integer age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }
}