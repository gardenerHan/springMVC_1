package com.ifox.springtest;


import com.ifox.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@SessionAttributes(value = {"user"},types = {String.class})
@RequestMapping("/springmvc")
@Controller
public class DataProcessingModel extends SuccessString {

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){

        String viewName = SUCCESS ;
        ModelAndView modelAndView = new ModelAndView(viewName) ;

        modelAndView.addObject("time",new Date()) ;
        return modelAndView ;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){

        System.out.println(map.getClass().getName());//org.springframework.validation.support.BindingAwareModelMap
        map.put("names", Arrays.asList("Tom","jerry","Mike")) ;
        return  SUCCESS ;
    }

    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Map<String,Object> map){
        User user = new User("大王","12334",11,"12231233@qq.com") ;
        map.put("user",user) ;
        map.put("likeColor","red") ;
        return SUCCESS ;
    }
    /**
     * 1. 有 @ModelAttribute 标记的方法, 会在每个目标方法执行之前被 SpringMVC 调用!
     * 2. @ModelAttribute 注解也可以来修饰目标方法 POJO 类型的入参, 其 value 属性值有如下的作用:
     * 1). SpringMVC 会使用 value 属性值在 implicitModel 中查找对应的对象, 若存在则会直接传入到目标方法的入参中.
     * 2). SpringMVC 会一 value 为 key, POJO 类型的对象为 value, 存入到 request 中.
     */
    @ModelAttribute
    public void getUser(@RequestParam("id") Integer id ,Map<String,Object> map){
        System.out.println("ModelAttribute Method");

        if (id != null){
            User user =  new User(1,"hgx","123456",12,"1223@qq.com") ;
            System.out.println("从数据库查到User:" + user);
          //  map.put("user",user) ;
            map.put("abc",user) ;
        }
    }


    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") User user){

        System.out.println("修改:"+user);

        return SUCCESS ;
    }




}
