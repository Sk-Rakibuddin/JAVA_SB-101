import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("product");

        EntityManager em=emf.createEntityManager();

        Product product=em.find(Product.class,3);
        if(product!=null){
            System.out.println(product);
        }
        else System.out.println("Not found");

        em.close();

    }
}
