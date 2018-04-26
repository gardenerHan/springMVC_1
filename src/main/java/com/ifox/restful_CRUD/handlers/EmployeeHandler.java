package com.ifox.restful_CRUD.handlers;

import com.ifox.restful_CRUD.dao.DepartmentDao;
import com.ifox.restful_CRUD.dao.EmployeeDao;
import com.ifox.restful_CRUD.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao ;

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
    public String save(Employee employee){
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
