package com.Dao;

import com.model.Employee;

public interface EmpDao {

    public void save(Employee emp);
   public String getAddressOfEmployee(int empId);
    public String giveBonusToEmployee(int empId, int bonus);
    public boolean deleteEmployee(int empId);

}
