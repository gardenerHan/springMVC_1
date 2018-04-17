package com.ifox.springtest;

import com.ifox.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class TestPOJO {
    public static final String SUCCESS = "success" ;

    @RequestMapping(value = "/testPOJO")
    public String testPOJO(User user){
        System.out.println("testPOJO:"+ user);
        System.out.println("testPOJO");
        return SUCCESS ;
    }
}
