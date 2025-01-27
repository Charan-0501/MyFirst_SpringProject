package com.kandati.shivaSpring.service;

import com.kandati.shivaSpring.entity.CourseCreation;

import java.util.ArrayList;

public interface MyInterface {
    public ArrayList<CourseCreation> getCourse_list();

    public String addcourse(CourseCreation body);


}
