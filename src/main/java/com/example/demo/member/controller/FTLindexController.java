package com.example.demo.member.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FTLindexController {

    @RequestMapping("/ftlIndex")
    public String ftlIndex(Map<String, Object>map){
        map.put("name", "liu");
        map.put("age", "12");
        return "ftlIndex.ftl";
    }
}
