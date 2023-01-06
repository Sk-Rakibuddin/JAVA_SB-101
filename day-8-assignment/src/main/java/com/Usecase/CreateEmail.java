package com.Usecase;

import com.Dao.UserDao;
import com.Dao.UserDaoImpl;
import com.bean.Email;
import com.bean.User;

public class CreateEmail {
    public static void main(String[] args) {
        UserDao dao=new UserDaoImpl();
        dao.createEmail(new User(),new Email());
    }
}
