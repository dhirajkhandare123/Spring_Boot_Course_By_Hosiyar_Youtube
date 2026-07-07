package com.hosiyar.lecture04.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class MyFirstApi {
    @GetMapping("/hello")
    public String getMethodName() {
        return "Get request recived";
    }

    @PostMapping("/post")
    public String postMethodName() {
        return "Post request recived";
    }

    @DeleteMapping("/delete")
    public String deleteReq(){
        return "Delete Req";
    }

    @PutMapping("/put")
    public String putMethodName() {
        return "Put request";
    }

    @GetMapping("/api/{data}")
    public String getMethodName(@PathVariable String data) {
        return "Data recieved: "+ data;
    }
    
    @GetMapping("/api")
    public String recieveData(@RequestParam String name) {
        return "Hello: " + name;
    }

    @GetMapping("/info")
    public String getInfo(@RequestBody Student stud) {
        return "Data recieved: " + stud;
    }
    
    
}

class Student{
    int id;
    int roll;
    String name;
    String address;

    public Student(int id, int roll, String name, String address){
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.address = address;
    }

    @Override
public String toString() {
    return "Student{" +
            "id=" + id +
            ", roll=" + roll +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            '}';
}
}
