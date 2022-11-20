package com.usecase;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

import java.util.Scanner;

public class DeleteEmp {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter id");
        int id=s.nextInt();
        EmployeeDao emp=new EmployeeDaoImpl();
        emp.deleteEmployee(id);
    }
}
