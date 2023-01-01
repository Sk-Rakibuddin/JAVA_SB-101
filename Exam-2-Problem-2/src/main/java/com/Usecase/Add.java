package com.Usecase;

import com.Dao.DAO;
import com.Dao.StudentDaoImpl;
import com.Entity.Course;
import com.Entity.Student;

import java.util.HashSet;
import java.util.Set;

public class Add {
    public static void main(String[] args) {
        Course course1=new Course();
        course1.setCourseId(1);
        course1.setCourseName("web development");
        course1.setDuration("6 Months");
        course1.setFee(2000);
        Student St=new Student();
        St.setRollNo(1);
        St.setName("Rakib");
        St.setEmail("abc");
        St.setMobile("97746");
        Set<Student> set=new HashSet<>();
        set.add(St);
        course1.setStudentSet(set);

        DAO dao=new StudentDaoImpl();
        dao.addCourse(course1);
    }
}
