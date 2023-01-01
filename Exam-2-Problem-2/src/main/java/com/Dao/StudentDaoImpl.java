package com.Dao;

import com.Entity.Course;
import com.Entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class StudentDaoImpl implements DAO{
    @Override
    public void addCourse(Course course) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("course");
        EntityManager em= emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(course);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void getStudent(int roll_no) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("course");
        EntityManager em= emf.createEntityManager();
        Student s=em.find(Student.class,roll_no);
        if(s!=null){
            System.out.println(s);
        }

    }

    @Override
    public void getCourse(int course_id) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("course");
        EntityManager em= emf.createEntityManager();
        Course c=em.find(Course.class,course_id);
        if(c!=null){
            System.out.println(c);
        }
    }
}
