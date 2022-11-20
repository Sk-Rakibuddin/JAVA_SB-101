package com.dao;

import com.entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeDaoImpl implements EmployeeDao{

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("empUnit");
    EntityManager em=emf.createEntityManager();
    @Override
    public void save(Employee emp) {
      em.getTransaction().begin();
      em.persist(emp);
      em.getTransaction().commit();
      System.out.println("Data saved successfully");
      em.close();


    }

    @Override
    public String getAddressOfEmployee(int empId) {
        String mesg="employee not found";
        Employee emp=em.find(Employee.class,empId);
        if(emp!=null){


            System.out.println("address= "+ emp.getAddress());
            mesg="done";

        }


        return mesg;
    }

    @Override
    public String giveBonusToEmployee(int empId, int bonus) {
        String mesg="employee not found";

        Employee emp=em.find(Employee.class,empId);
        if(emp!=null){
            em.getTransaction().begin();
           emp.setSalary(emp.getSalary()+bonus);
           em.getTransaction().commit();
            mesg="Bonus added";
        }
        em.close();


        return mesg;
    }

    @Override
    public boolean deleteEmployee(int empId) {
        boolean flag=false;
        Employee emp=em.find(Employee.class,empId);
        if(emp!=null){
           em.getTransaction().begin();
           em.remove(emp);
           em.getTransaction().commit();
           flag=true;
           System.out.println("Employee removed");
        }
        else{
            System.out.println("Employee not found");
        }
        return flag;
    }
}
