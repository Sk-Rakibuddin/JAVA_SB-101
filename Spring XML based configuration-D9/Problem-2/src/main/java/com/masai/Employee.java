package com.masai;

public class Employee {
	private int empId;
	private String empName;
	private String address;
	private int salary;

	//use constructor injection to inject the above fields.
	public Employee(int empId, String empName, String address, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.address = address;
		this.salary = salary;
		
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + ", salary=" + salary
				 + "]";
	}
	
}
