package com.ifox.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class TestRedirect {

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        System.out.println("Test Redirect");
        return "redirect:/index.jsp" ;
    }


}
