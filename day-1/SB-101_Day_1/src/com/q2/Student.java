package com.q2;

import java.util.Objects;

public class Student {
	private int roll;
	private int marks;
	private String name;
	private String address;
	
	
	public Student(int roll, int marks, String name, String address) {
		super();
		this.roll = roll;
		this.marks = marks;
		this.name = name;
		this.address = address;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + ", name=" + name + ", address=" + address + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(address, marks, name, roll);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && marks == other.marks && Objects.equals(name, other.name)
				&& roll == other.roll;
	}
	
	
	

}
