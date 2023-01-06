package com.Dao;

import com.bean.Email;
import com.bean.User;
import emUtil.EmUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class UserDaoImpl implements UserDao {
    @Override
    public void createUser(User user, Email email) {
        EntityManager manager= EmUtil.provideEntityManager();
        user .setName("Rakib");
        user.setDateOfBirth("31/05/1998");
        user.setPhoneNo("9898987867");
        email.setCreated_date(LocalDateTime.now());
        email.setEmail("abc@gmail");
        user.setEmail(email);
        manager.getTransaction().begin();
        manager.persist(user);
        manager.getTransaction().commit();
        System.out.println("done");
        manager.close();
    }

    @Override
    public void retrieveUsers() {
        EntityManager manager=EmUtil.provideEntityManager();
        Query query= manager.createQuery("select x from User x");

        if(query!=null){
           List<User> user= query.getResultList();

           if(user.size()==0){
               System.out.println("List is empty");
           }else
               for(User us:user){
                   System.out.println(us.getName());
               }
        }
        else throw new RuntimeException("user not found");
    }

    @Override
    public void retOneUser(int userId) {
        EntityManager manager=EmUtil.provideEntityManager();
       User user= manager.find(User.class,userId);
       if(user!=null){
           System.out.println(user.getName()+"  dob is: "+user.getDateOfBirth());
       }
       else throw new RuntimeException("not found");
    }

    @Override
    public void createEmail(User user, Email email) {
        EntityManager manager= EmUtil.provideEntityManager();
        user .setName("Rakib");
        user.setDateOfBirth("31/05/1998");
        user.setPhoneNo("9898987867");
        email.setCreated_date(LocalDateTime.now());
        email.setEmail("abc@gmail");
        email.setUser(user);
        manager.getTransaction().begin();
        manager.persist(email);
        manager.getTransaction().commit();
        System.out.println("done");
        manager.close();

    }

    @Override
    public void deleteUser(int userId) {
        EntityManager manager=EmUtil.provideEntityManager();
        User user=manager.find(User.class,userId);
        if(user!=null){
            manager.getTransaction().begin();
            manager.remove(user);
            manager.getTransaction().commit();
            manager.close();
        }
        else throw  new RuntimeException("User does not exists");
    }
}
