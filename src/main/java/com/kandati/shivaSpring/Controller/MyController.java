package com.kandati.shivaSpring.Controller;


import com.kandati.shivaSpring.entity.CourseCreation;
import com.kandati.shivaSpring.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyController {
    @GetMapping("/home")
    public String welcome(){
        return "welcome to your course library";
    }
    MyService toget_courselist =new MyService();
    @GetMapping("/home/courses")
    public ArrayList<CourseCreation> getCourses(){
        return toget_courselist.getCourse_list();
    }

}
