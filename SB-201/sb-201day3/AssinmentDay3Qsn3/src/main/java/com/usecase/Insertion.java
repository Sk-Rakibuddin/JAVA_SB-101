package com.usecase;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;
import com.entity.Employee;

import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter empid");
        int empId=s.nextInt();
        System.out.println("enter name");
        String name=s.next();
        System.out.println("enter address");
        String address=s.next();
        System.out.println("enter salary");
        int salary=s.nextInt();

        EmployeeDao e=new EmployeeDaoImpl();

        Employee e1=new Employee(empId,name,address,salary);
        e.save(e1);
    }
}
