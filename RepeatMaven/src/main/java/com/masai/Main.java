package com.masai;

import com.Dao.EmpDao;
import com.Dao.EmpDaoImpl;
import com.model.Employee;

public class Main {
    public static void main(String[] args) {
        EmpDao emp=new EmpDaoImpl();
        emp.save(new Employee("Rakib","Kolkata",40000));


        emp.getAddressOfEmployee(1);
        emp.giveBonusToEmployee(1,2000);
        emp.deleteEmployee(4);
    }
}