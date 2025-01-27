package com.kandati.shivaSpring.service;

import com.kandati.shivaSpring.entity.CourseCreation;

import java.util.ArrayList;

public class MyService {

    ArrayList<CourseCreation>  course_list;

    public MyService() {

        course_list=new ArrayList<>();
        course_list.add(new CourseCreation(101,"Java SpringBoot","3 Months",4500.00,true));
        course_list.add(new CourseCreation(102,"Python Django","2 Months",5000.00,true));
        course_list.add(new CourseCreation(103,"JavaScript Fundamentals","1 Months",1500.00,true));

    }

    public ArrayList<CourseCreation> getCourse_list(){
        return course_list;
    }
}
