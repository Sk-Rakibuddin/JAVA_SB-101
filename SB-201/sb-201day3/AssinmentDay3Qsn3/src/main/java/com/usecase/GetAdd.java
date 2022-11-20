package com.usecase;
import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImpl;

import java.util.Scanner;

public class GetAdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.println("enter id");
        int empId=s.nextInt();
        EmployeeDao emp=new EmployeeDaoImpl();
        emp.getAddressOfEmployee(empId);
    }




}
