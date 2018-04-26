package com.ifox.restful_CRUD.handlers;

import com.ifox.restful_CRUD.dao.EmployeeDao;
import com.ifox.restful_CRUD.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversionServiceConverer {


    @Autowired
    private EmployeeDao employeeDao  ;

    @RequestMapping("/testConversionServiceConverer")
    public String testConversionService(@RequestParam("employee") Employee employee){
        System.out.println("save:"+employee);
        employeeDao.save(employee);
        return "redirect:/emps" ;
    }
}
