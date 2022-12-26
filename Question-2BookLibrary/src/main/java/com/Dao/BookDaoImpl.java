package com.Dao;

import com.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BookDaoImpl implements BookDao{
    EntityManagerFactory emf= Persistence.createEntityManagerFactory("bookUnit");
    EntityManager em=emf.createEntityManager();

    @Override
    public String createBook(Book book) {
        String x="not added";
        if(book!=null){
            em.getTransaction().begin();
            em.persist(book);
            em.getTransaction().commit();
            x="added successfully";
        }
        return x;
    }

    @Override
    public String findBook(int id) {
        String x="not found";
        Book b=em.find(Book.class,id);
        if(b!=null){
            System.out.println(b);
        }
        return  x;
    }

    @Override
    public String updateBook(int id) {
        String x="not found";
       Book book= em.find(Book.class,id);
       if(book==null){
           System.out.println("not found with id :"+id);
       }
       else{
           em.getTransaction().begin();
           book.setPrice(2*book.getPrice());
           x="updated successfully";
           em.getTransaction().commit();
       }
       em.close();
       return x;

    }

    @Override
    public String deleteBook(int id) {
        String x="not found";
        Book book=em.find(Book.class,id);
        if(book==null){
           System.out.println("Book does not exists");
        }
        else{
            em.getTransaction().begin();
            em.remove(book);
            em.getTransaction().commit();
            x="deleted successfully";
        }
        em.close();
        return x;
    }
}
