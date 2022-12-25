package com.Dao;

import com.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmpDaoImpl implements EmpDao{
   EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");

   EntityManager em=emf.createEntityManager();


    @Override
    public void save(Employee emp) {

       em.getTransaction().begin();
       em.persist(emp);
       em.getTransaction().commit();


    }

    @Override
    public String getAddressOfEmployee(int empId) {

        String x="not found";
       Employee emp= em.find(Employee.class,empId);
       if(emp!=null){
           System.out.println(emp.getAddress());
           x="address found successfully";

       }


        return x;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        String x="not found";
       Employee emp= em.find(Employee.class,empId);
       if(emp!=null){
           em.getTransaction().begin();
           emp.setSalary(emp.getSalary()+bonus);
           em.getTransaction().commit();
           x="bonus credited";
       }


        return x;



    }

    @Override
    public boolean deleteEmployee(int empId) {
       boolean x=false;
      Employee emp= em.find(Employee.class,empId);
      if(emp!=null){
          em.getTransaction().begin();
          em.remove(emp);
          em.getTransaction().commit();
          x=true;
      }

       return x;
    }
}
