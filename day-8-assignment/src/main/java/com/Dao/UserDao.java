package com.Dao;

import com.bean.Email;
import com.bean.User;

public interface UserDao {
    public void createUser(User user, Email email);
    public  void retrieveUsers();
    public void retOneUser(int userId);
    public void createEmail(User user,Email email);
    public void deleteUser(int userId);
}
