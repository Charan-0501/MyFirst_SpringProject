package com.kandati.shivaSpring.service;

import com.kandati.shivaSpring.entity.CourseCreation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Service
public class MyService implements MyInterface {

    ArrayList<CourseCreation> course_list;
    Set<CourseCreation> check=new HashSet<>();

    public MyService() {

        course_list=new ArrayList<>();
        course_list.add(new CourseCreation(101,"Java SpringBoot","3 Months",4500.00,true));
        course_list.add(new CourseCreation(102,"Python Django","2 Months",5000.00,true));
        course_list.add(new CourseCreation(103,"JavaScript Fundamentals","1 Months",1500.00,true));

//        Set<CourseCreation> check=new HashSet<>();
        check.addAll(course_list);

//        for(CourseCreation just : course_list){
//            check.add(just);
//        }
    }
//    Set<CourseCreation> check=new HashSet<>();
//
//    for(CourseCreation just : course_list){
//        check.add(just);
//    }
    @Override
    public ArrayList<CourseCreation> getCourse_list() {
        return course_list;
    }

    @Override
    public String addcourse(CourseCreation body) {
        if (!check.contains(body)) {
            course_list.add(body);
            check.add(body);
        return "Course added successfully.You can now check the Updated course list";
        }
        else {
            return "Course already exists .please try adding new courses";
        }
    }


}
