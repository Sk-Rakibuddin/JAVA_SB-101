package Usecase;

import com.Entity.PhoneNumber;
import com.Entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class Insertion {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("userUnit");

        EntityManager em= emf.createEntityManager();
        User user=new User();
        user.setUserId(1);
        user.setUserName("Nrupul");
        user.setEmailid("abc@gmail");
        PhoneNumber phone1=new PhoneNumber(1,"2435343","home");
        PhoneNumber phone2=new PhoneNumber(2,"1435343","LandLine");
        PhoneNumber phone3=new PhoneNumber(3,"4435343","office");
        Set<PhoneNumber> set=new HashSet<>();
        set.add(phone1);
        set.add(phone2);
        set.add(phone3);
        user.setPhonenumber(set);

        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();


        User user1=new User();
        user1.setUserId(2);
        user1.setUserName("Prateek");
        user1.setEmailid("cbc@gmail");
        PhoneNumber phone4=new PhoneNumber(4,"9435343","home");
        PhoneNumber phone5=new PhoneNumber(5,"7435343","LandLine");
        PhoneNumber phone6=new PhoneNumber(6,"3435343","office");
        Set<PhoneNumber> set1=new HashSet<>();
        set1.add(phone4);
        set1.add(phone5);
        set1.add(phone6);
        user1.setPhonenumber(set1);

        em.getTransaction().begin();
        em.persist(user1);
        em.getTransaction().commit();
        em.close();

    }
}
