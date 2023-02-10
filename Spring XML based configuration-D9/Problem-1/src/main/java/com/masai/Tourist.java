package com.masai;

public class Tourist {
	private String name;
	private int age;
	private String aadhar_id;
	
	//Register the Tourist class with the Spring Container and configure all its
	//dependency using constructor injection.
	//parameterized constructor
	public Tourist(String name, int age, String aadhar_id) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar_id = aadhar_id;
	}

	//toString()
	@Override
	public String toString() {
		return "Tourist [name=" + name + ", age=" + age + ", aadhar_id=" + aadhar_id + "]";
	} 
	
	
	

}
