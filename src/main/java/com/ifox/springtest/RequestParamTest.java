package com.ifox.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("/springmvc")
@Controller
public class RequestParamTest {

    private static final String SUCCESS = "success" ;


    @RequestMapping(value = "/testRequestParam")
    public String testRequestParam(@RequestParam("username") String username , @RequestParam(value = "age",required = false) Integer age){
        System.out.println("testRequestParam , username:"+username +","+" age:"+age);
        return SUCCESS ;
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String sessionID){
        System.out.println("testCookieValue,JSESSIONID:"+sessionID);
        return SUCCESS ;
    }
}
