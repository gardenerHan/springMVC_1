package com.ifox.restful_CRUD.handlers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;


@Controller
public class I18nHandler {

        @Autowired
        private ResourceBundleMessageSource messageSource ;


        @RequestMapping("/i18n")
        public String testI18n(Locale locale ){

            String val = messageSource.getMessage("i18n.username",null ,locale) ;
            System.out.println(val);
            return "i18n" ;

        }
}
