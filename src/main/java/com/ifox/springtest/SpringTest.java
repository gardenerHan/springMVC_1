package com.ifox.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/springmvc")
@Controller
public class SpringTest {
    private static final String SUCCESS = "success" ;


    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.GET)
    public String testRest(@PathVariable("id") Integer id){
        System.out.println("testRest GET :" + id);
        return SUCCESS ;
    }

    @RequestMapping(value = "/testRest",method = RequestMethod.POST)
    public String testRest(){
        System.out.println("testRest POST");
        return SUCCESS ;
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String testRestDelete(@PathVariable("id") Integer id){
        System.out.println("testRest Delete :" + id);
        return SUCCESS ;
    }

    @RequestMapping(value = "/testRest/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public String testRestPut(@PathVariable("id") Integer id){
        System.out.println("testRest PUT :" + id);
        return SUCCESS ;
    }




    /**
     * @PathVariable 可以来映射URL 中的占位符到目标方法的参数中。
     * @param id
     * @return
     */
    @RequestMapping(value = "/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(value = "id") Integer id){
        System.out.println("testPathVariable" + id);
        return SUCCESS ;
    }

    @RequestMapping(value = "/testAntPath/*/abc")
    public String testAntPath(){
        System.out.println("testAntPath");
        return SUCCESS ;
    }

    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCESS ;
    }

    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return SUCCESS ;
    }

    @RequestMapping(value = "/testParamAndHeaders",params = {"username","age!=10"},headers = {})
    public String testParamsAndHeaders(){
        return SUCCESS ;
    }
}

