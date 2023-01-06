package com.Usecase;

import com.Dao.UserDao;
import com.Dao.UserDaoImpl;

public class Delete {
    public static void main(String[] args) {
        UserDao dao=new  UserDaoImpl();
        dao.deleteUser(1);
    }
}
