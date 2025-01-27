package com.kandati.shivaSpring.Controller;


import com.kandati.shivaSpring.entity.CourseCreation;
import com.kandati.shivaSpring.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyController {

    @GetMapping("/home")
    public String welcome(){
        return "welcome to your course library "+"Go to /courses to access the list";
    }

   MyService serve = new MyService() ;

    @GetMapping("/home/courses")
    public ArrayList<CourseCreation> getCourses(){

        return serve.getCourse_list();
    }

    @PostMapping("/home/courses")
    public String addcourse( @RequestBody CourseCreation body){

        return serve.addcourse(body);
    }


}
