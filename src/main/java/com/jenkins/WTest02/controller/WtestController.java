package com.jenkins.WTest02.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WtestController {

    @GetMapping("/employee/test")
    public String getEmployeeTest(){
        return "The code of Rajkumar ...neew    erd";
    }
}