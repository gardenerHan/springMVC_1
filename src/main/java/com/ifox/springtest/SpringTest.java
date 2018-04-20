package com.ifox.springtest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 类定义处标记的@RequestMapping 限定了处理器类可以处理所有 URI 为 /springmvc的请求，
 * 它相对于 WEB 容器部署的根路径
 */
@RequestMapping("/springmvc")
@Controller
public class SpringTest {
    private static final String SUCCESS = "success" ;

    /**
     * 处理器类可以定义多个处理方法，处理来自/springmvc 下的请求 这个方法可以处理来自/springmvc/testRequestMapping的请求
     * @return
     */
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping(){
        System.out.println("testRequestMapping");
        return SUCCESS ;
    }


    /**
     * 映射请求方法
     *
     */
    @RequestMapping(value = "/testMethod", method = RequestMethod.POST)
    public String testMethod(){
        System.out.println("testMethod");
        return SUCCESS ;
    }

    /**
     * 映射请求参数或请求头
     * @return
     */
    @RequestMapping(value = "/testParamAndHeaders",params = {"username","age!=10"},headers = {})
    public String testParamsAndHeaders(){
        return SUCCESS ;
    }


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





}

