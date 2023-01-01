package com.Dao;

import com.Entity.Course;

public interface DAO {

    public void addCourse(Course course);
    public void getStudent(int roll_no);
    public void getCourse(int course_id);
}
