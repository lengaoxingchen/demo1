package com.example.demo.member.controller.member.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.descriptor.JspConfigDescriptor;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> errorResult(){
        Map<String, Object> errorResultMap = new HashMap<String, Object>();
        errorResultMap.put("errCode", "500");
        errorResultMap.put("errMsg","系统错误");
        return errorResultMap;

    }
}
