package com.demo.aop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

    @GetMapping("/")
    public String test(){
        return "index";
    }

    @RequestMapping(value = "/user/{userId}",method= RequestMethod.GET)
    public String test2(@PathVariable("userId") final String userId){
        return "/index";
    }

    @RequestMapping(value = "/user/{userId}",method= RequestMethod.POST)
    public String test3(@PathVariable("userId") final Integer userId){
        return "index";
    }

    @RequestMapping(value = "/user/{userId}",method= RequestMethod.PUT)
    public String test4(@PathVariable("userId") final Integer userId){
        return "index";
    }

    @RequestMapping(value = "/user/{userId}",method= RequestMethod.DELETE)
    public String test5(@PathVariable("userId") final Integer userId){
        return "index";
    }
}
