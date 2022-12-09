package com.masai.demo;

import org.springframework.stereotype.Component;

@Component
public class A {
	private String name;
	
public void printA(String name) {
	System.out.println("Welcome "+name);
}

public A() {
	super();
	// TODO Auto-generated constructor stub
}

public A(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
