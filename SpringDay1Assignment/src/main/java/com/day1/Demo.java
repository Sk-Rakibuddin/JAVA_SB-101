package com.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("Beans.xml");

        Student s=ac.getBean("student", Student.class);

        System.out.println(s);

        College college=ac.getBean("college", College.class);

        college.setCollege_name("Vidyasagar university");
        college.setCollege_address("ghatal");
        System.out.println(college.getCollege_name());
        System.out.println(college.getCollege_address());
        System.out.println(college.getStudent());
        college.showDetails();





    }
}
