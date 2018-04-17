package com.ifox.springtest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping("/servletAPI")
@Controller
public class ServletAPITest  extends SuccessString{
    @RequestMapping("/test")
    public String testServletAPI(HttpServletRequest request, HttpServletResponse response){

        System.out.println("testServletAPI:"+request+"\t"+response);
        return SUCCESS ;


    }


}
