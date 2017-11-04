package com.wen.boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@RequestMapping("/aop")  
public class AopController {  
  
    @RequestMapping("/before/{key}/{value}")  
    public void before(@PathVariable String key,@PathVariable String value){  
        //return "key="+key+"  value="+value;  
    }  
    @RequestMapping("/after/{key}")  
    public String after(@PathVariable String key){  
        return "key=: "+key;  
    }  
    @RequestMapping("/throwing/{key}")  
    public String throwing(@PathVariable String key){  
        throw new NullPointerException();  
    }    
    @RequestMapping("/around/{key}")  
    public String around(@PathVariable String key){  
        return "环绕通知："+key;  
    }  
}  