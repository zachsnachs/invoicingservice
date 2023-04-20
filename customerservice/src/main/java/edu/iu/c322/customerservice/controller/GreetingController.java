package edu.iu.c322.customerservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class GreetingController {

    //Get https:localhost:8080/customers
    @GetMapping
    public String greetings(){
        return "Greetings!";
    }
}
