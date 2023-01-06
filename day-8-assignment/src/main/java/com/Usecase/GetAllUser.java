package com.Usecase;

import com.Dao.UserDao;
import com.Dao.UserDaoImpl;

public class GetAllUser {
    public static void main(String[] args) {
        UserDao dao=new UserDaoImpl();
        dao.retrieveUsers();
    }
}
