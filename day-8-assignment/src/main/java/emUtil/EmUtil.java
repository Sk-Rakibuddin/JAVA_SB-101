package emUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmUtil {
    private static EntityManagerFactory entityManagerFactory;
    static {
        entityManagerFactory= Persistence.createEntityManagerFactory("user");
    }
    public  static EntityManager provideEntityManager(){
        return entityManagerFactory.createEntityManager();
    }

}
