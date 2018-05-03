package com.ifox.restful_CRUD.handlers;

import com.ifox.restful_CRUD.dao.DepartmentDao;
import com.ifox.restful_CRUD.dao.EmployeeDao;
import com.ifox.restful_CRUD.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao ;


    @InitBinder
    public void initBinder(WebDataBinder binder){
        System.out.println("initBinder............");
        //忽略lastName的提交
       // binder.setDisallowedFields("lastName");

    }

    @RequestMapping("/emps")
    public String list(Map<String, Object> map) {
        map.put("employees", employeeDao.getAll());
        return "list";
    }

    @RequestMapping(value = "/emp", method = RequestMethod.GET)
    public String input(Map<String, Object> map) {
        map.put("departments",departmentDao.getDepartments() ) ;
        map.put("employee",new Employee()) ;
        return "input" ;
    }

    @RequestMapping(value = "/emp",method = RequestMethod.POST)
    public String save(@Valid Employee employee , BindingResult result , Map<String,Object> map){

        if (result.getErrorCount() > 0 ){
            System.out.println("出错了:");
            for (FieldError error : result.getFieldErrors()){
                System.out.println(error.getField()+":"+error.getDefaultMessage());
            }
            //出错，转向指定页面
            map.put("departments",departmentDao.getDepartments()) ;
            return  "input" ;
        }
        System.out.println("save:"+employee);
        employeeDao.save(employee);
        return "redirect:/emps" ;
    }

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps" ;
    }

    @RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
    public String input(@PathVariable("id") Integer id ,Map<String,Object> map){
        map.put("employee",employeeDao.get(id)) ;
        map.put("departments",departmentDao.getDepartments()) ;
        return "input" ;
    }

    @ModelAttribute
    public void getEmployee(@RequestParam(value = "id",required = false) Integer id , Map<String,Object> map){
        if (id != null) {
            Employee e = employeeDao.get(id);
            map.put("employee",e) ;
        }
    }

    @RequestMapping(value = "/emp",method = RequestMethod.PUT )
    public String update(Employee employee){
       // employee.setLastName(employeeDao.get(employee.getId()).getLastName());
        employeeDao.save(employee);
        return "redirect:/emps" ;
    }



}
