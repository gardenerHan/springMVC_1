package com.ifox.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/springmvc")
@Controller
public class RequestHeaderTest {

    private static final String SUCCESS = "success" ;


    @RequestMapping(value = "/testRequestHeader")
    public String testRequestParam(@RequestHeader(value = "Accept-Language") String al){
        System.out.println("testRequestHeader,Accept-Language:"+ al);
        return SUCCESS ;
    }
}
