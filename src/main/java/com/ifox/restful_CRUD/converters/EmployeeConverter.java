package com.ifox.restful_CRUD.converters;

import com.ifox.restful_CRUD.entities.Department;
import com.ifox.restful_CRUD.entities.Employee;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;


@Component
public class EmployeeConverter implements Converter<String,Employee> {


    @Nullable
    @Override
    public Employee convert(String s) {
        if (s != null){
            String val[] = s.split("-") ;
           if (val != null && val.length == 4){
               String lastName = val[0] ;
               String email = val[1] ;
               Integer gender = Integer.parseInt(val[2]) ;
               Department department = new Department() ;
               department.setId(Integer.parseInt(val[3]));

               Employee employee = new Employee(null,lastName,email, gender, department) ;

               System.out.println(s +"--convert--"+ employee );
               return employee ;
           }
        }

        return null ;
    }
}
