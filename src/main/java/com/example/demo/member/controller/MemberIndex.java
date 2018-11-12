package com.example.demo.member.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MemberIndex {
    @RequestMapping("/memberIndex")
    public static String memberIndex(){
        return "Hello World";
    }
}
