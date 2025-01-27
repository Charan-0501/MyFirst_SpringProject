package com.kandati.shivaSpring.entity;

public class CourseCreation {
    private int course_Id;
    private String course_title;
    private String course_duration;
    private double course_fees;
    private boolean course_available;

    public CourseCreation(int course_Id,String course_title,String course_duration,double course_fees,boolean course_available) {
        this.course_Id = course_Id;
        this.course_title = course_title;
        this.course_duration=course_duration;
        this.course_fees=course_fees;
        this.course_available=course_available;
    }

    public int getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(int course_Id) {
        this.course_Id = course_Id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public double getCourse_fees() {
        return course_fees;
    }

    public void setCourse_fees(double course_fees) {
        this.course_fees = course_fees;
    }

    public boolean isCourse_available() {
        return course_available;
    }

    public void setCourse_available(boolean course_available) {
        this.course_available = course_available;
    }
}
