package com.ifox.springtest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class TestMyView {


    @RequestMapping("/testView")
    public String testView(){
        return "helloView" ;
    }
}
