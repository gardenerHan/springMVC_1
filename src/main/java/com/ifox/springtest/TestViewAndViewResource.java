package com.ifox.springtest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/springmvc")
@Controller
public class TestViewAndViewResource extends SuccessString {

    @RequestMapping("testViewAndViewResource")
    public String testViewAndViewResource(){
        System.out.println("Test ViewAndViewResource");
        return SUCCESS ;
    }
//-javaagent:D:\openResources\RepMaven\org\springframework\springloaded\1.2.8.RELEASE\springloaded-1.2.8.RELEASE.jar -noverify
//    @RequestMapping("/Jrebel")
//    public String testJrebel(){
//        System.out.println("部署成功");
//        return SUCCESS ;
//    }
}
