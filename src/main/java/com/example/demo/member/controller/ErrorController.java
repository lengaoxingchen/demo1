package com.example.demo.member.controller;

import com.example.demo.member.controller.member.error.GlobalExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ErrorController {

    @RequestMapping("/getUser")
    public String getUser(int i){
        int j = 1/i;
        return "success"+ j;
    }


}
