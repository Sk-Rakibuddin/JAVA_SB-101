package com.q5;

import java.io.Serializable;


public class Student implements Serializable {
	private String name;
	private int roll;
	private int marks;
	private String email;
	 private String password;
	private Address addr;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(String name, int roll, int marks, String email, String password, Address addr) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
		this.email = email;
		this.password = password;
		this.addr = addr;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + ", email=" + email + ", password="
				+ password + ", addr=" + addr + "]";
	}
	
	
	
	
	
}
