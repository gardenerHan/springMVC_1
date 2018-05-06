package com.ifox.restful_CRUD.handlers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class FileuploadHandler {

    @RequestMapping("/testFileupload")
    public String testFileupload(@RequestParam("desc") String desc, @RequestParam("file") MultipartFile file) throws IOException {

        System.out.println("DESC:"+desc);
        System.out.println("OriginalFilename:"+file.getOriginalFilename());
        System.out.println("InputStream:"+file.getInputStream());

        return "success" ;
    }
}
