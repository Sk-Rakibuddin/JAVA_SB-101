package Usecase;

import com.Entity.PhoneNumber;
import com.Entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GetAll {
    public static void main(String[] args) throws Exception {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("userUnit");

        EntityManager em= emf.createEntityManager();

        Query query=em.createQuery("select x from User x where x.userName='Nrupul'");
        if(query!=null){
            List<User> phone=query.getResultList();

            for(User p:phone){
                System.out.println(p);
            }
        }
        else throw new Exception("user not found");

    }
}
