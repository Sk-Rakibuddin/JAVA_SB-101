package com.Usecase;

import com.Dao.DAO;
import com.Dao.StudentDaoImpl;

public class GetStudent {
    public static void main(String[] args) {
        DAO dao=new StudentDaoImpl();
        dao.getStudent(1);
    }
}
