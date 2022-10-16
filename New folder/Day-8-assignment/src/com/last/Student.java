package com.last;

import java.io.Serializable;

public class Student implements Serializable {

	private String name;
	private int roll;
	private int marks;
	private Address addr;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int roll, int marks, Address addr) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
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
	public Address getAdd() {
		return addr;
	}
	public void setAdd(Address add) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", marks=" + marks + ", addr=" + addr + "]";
	}
	
	
	
}
