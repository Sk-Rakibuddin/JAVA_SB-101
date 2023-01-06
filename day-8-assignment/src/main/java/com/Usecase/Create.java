package com.Usecase;

import com.Dao.UserDao;
import com.Dao.UserDaoImpl;
import com.bean.Email;
import com.bean.User;

public class Create {

    public static void main(String[] args) {
        UserDao dao=new UserDaoImpl();
        dao.createUser(new User(),new Email());
    }
}
