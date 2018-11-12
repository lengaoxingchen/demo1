package com.example.demo.member.controller.member.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JspController {
    private static final Logger logger = LoggerFactory.getLogger(JspController.class);

    @RequestMapping("/jspIndex")
    public String jspIndex(){
        logger.info("spring boot 集成 Logger日志成功!!!");
        return "jspIndex";
    }
}
