package com.day_1_Q1;

public class Employee {
private int empId;
private String empName;
private int salary;
private String address;


public Employee() {
	super();
	
}


public Employee(int empId, String empName, int salary, String address) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.salary = salary;
	this.address = address;
}


public int getEmpId() {
	return empId;
}


public void setEmpId(int empId) {
	this.empId = empId;
}


public String getEmpName() {
	return empName;
}


public void setEmpName(String empName) {
	this.empName = empName;
}


public int getSalary() {
	return salary;
}


public void setSalary(int salary) {
	this.salary = salary;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", address=" + address + "]";
}


}
