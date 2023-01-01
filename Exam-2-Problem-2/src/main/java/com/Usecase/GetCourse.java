package com.Usecase;

import com.Dao.DAO;
import com.Dao.StudentDaoImpl;

public class GetCourse {
    public static void main(String[] args) {
        DAO dao=new StudentDaoImpl();
        dao.getCourse(1);
    }
}
