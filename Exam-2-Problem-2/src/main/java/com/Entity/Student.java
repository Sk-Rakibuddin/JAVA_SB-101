package com.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="student")
public class Student {
    @Id
    private  int rollNo;
    private String name;
    private String email;
     private String mobile;

    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name="courseId")
    private Course course;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student(int rollNo, String name, String email, String mobile, Course course) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", course=" + course +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNo == student.rollNo && Objects.equals(name, student.name) && Objects.equals(email, student.email) && Objects.equals(mobile, student.mobile) && Objects.equals(course, student.course);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(rollNo, name, email, mobile, course);
//    }
}
